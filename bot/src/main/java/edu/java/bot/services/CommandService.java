package edu.java.bot.services;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.request.ForceReply;
import com.pengrad.telegrambot.model.request.ReplyKeyboardRemove;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.services.exceptions.CantDefineSlashCommandFromTextException;
import edu.java.bot.services.exceptions.NotAReplyMessageException;
import edu.java.bot.services.exceptions.StrangeSlashCommandException;
import edu.java.bot.slashCommands.NoParametersExecutableSlashCommand;
import edu.java.bot.slashCommands.ParameterizedExecutableSlashCommand;
import edu.java.bot.slashCommands.SlashCommand;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommandService {

    private static final String NO_SUCH_COMMAND_RESPONSE = "There is no such command";
    private static final String NOT_REPLY_ON_BOT_MESSAGE = "Please, reply to my message to pass parameters";

    private Map<String, SlashCommand> allCommands;

    @Autowired
    public CommandService(List<SlashCommand> commandList) {
        fillAllCommands(commandList);
    }

    private void fillAllCommands(List<SlashCommand> commandList) {
        allCommands = new HashMap<>();
        commandList.forEach(command -> allCommands.put(command.getTextCommand(), command));
    }

    public BotCommand[] getAllBotCommands() {
        return allCommands.values().stream()
            .map(SlashCommand::getBotCommand).toArray(BotCommand[]::new);
    }

    public SendMessage handleMessage(Message message) {
        Long chatId = message.chat().id();

        if (isCommandParameters(message)) {
            String responseText = handleParameters(message);
            return new SendMessage(chatId, responseText).replyMarkup(new ReplyKeyboardRemove());
        } else {
            String responseText = handleCommand(message);
            SendMessage sendMessageRequest = new SendMessage(chatId, responseText);

            if (defineSlashCommandFromBotMessage(message).needAdditionalUserParameter()) {
                return sendMessageRequest.replyMarkup(new ForceReply());
            } else {
                return sendMessageRequest.replyMarkup(new ReplyKeyboardRemove());
            }
        }
    }

    private String handleParameters(Message parameters) {
        Message botMessage = parameters.replyToMessage();
        if (botMessage == null) {
            throw new NotAReplyMessageException("Passed message is not a reply (original Message is null)");
        } else if (!botMessage.from().isBot()) {
            return NOT_REPLY_ON_BOT_MESSAGE;
        }

        ParameterizedExecutableSlashCommand slashCommand = defineSlashCommandFromBotMessage(botMessage);
        return slashCommand.executeWithParametersAndGetResponse(parameters);
    }

    private ParameterizedExecutableSlashCommand defineSlashCommandFromBotMessage(Message originalMessage) {
        String messageText = originalMessage.text();
        int slashCommandsInMessageText = 0;
        ParameterizedExecutableSlashCommand resultSlashCommand = null;

        for (var slashCommand : allCommands.values()) {
            if (messageText.contains(slashCommand.getTextCommand())) {
                slashCommandsInMessageText++;
                if (slashCommand instanceof ParameterizedExecutableSlashCommand) {
                    resultSlashCommand = (ParameterizedExecutableSlashCommand) slashCommand;
                }
            }
        }
        if (slashCommandsInMessageText != 1) {
            throw new CantDefineSlashCommandFromTextException(
                STR."Message \"\{messageText}\" expected to have 1 slashCommand, but actual number: \{slashCommandsInMessageText}"
            );
        }

        return resultSlashCommand;
    }

    private String handleCommand(Message message) {
        SlashCommand command = allCommands.get(message.text());
        return switch (command) {
            case null -> NO_SUCH_COMMAND_RESPONSE;
            case NoParametersExecutableSlashCommand noParametersExecutableSlashCommand ->
                noParametersExecutableSlashCommand.executeAndGetResponse();
            case ParameterizedExecutableSlashCommand parameterizedExecutableSlashCommand ->
                parameterizedExecutableSlashCommand.executeWithParametersAndGetResponse(message);
            default ->
                throw new StrangeSlashCommandException(STR."Command \"\{command.getTextCommand()}\" has no way of execution");
        };
    }

    private boolean isCommandParameters(Message message) {
        Message repliedMessage = message.replyToMessage();
        return repliedMessage == null;
    }
}
