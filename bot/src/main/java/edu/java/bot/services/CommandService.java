package edu.java.bot.services;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.request.ForceReply;
import com.pengrad.telegrambot.model.request.ReplyKeyboardRemove;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.services.exceptions.CantDefineSlashCommandFromTextException;
import edu.java.bot.services.exceptions.NoSuchCommandException;
import edu.java.bot.services.exceptions.NotACommandOrUserParameterException;
import edu.java.bot.services.exceptions.NotAReplyMessageException;
import edu.java.bot.services.exceptions.NotReplyOnBotMessageException;
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

        if (isUserParameters(message)) {
            String responseText = handleUserParameters(message);
            return new SendMessage(chatId, responseText).replyMarkup(new ReplyKeyboardRemove());
        } else if (message.text().startsWith("/")) {
            String responseText = handleCommand(message);
            SendMessage sendMessageRequest = new SendMessage(chatId, responseText);

            if (defineSlashCommandFromBotMessage(message).needAdditionalUserParameter()) {
                return sendMessageRequest.replyMarkup(new ForceReply());
            } else {
                return sendMessageRequest.replyMarkup(new ReplyKeyboardRemove());
            }

        } else {
            throw new NotACommandOrUserParameterException("Haha, funny joke");
        }
    }

    private String handleUserParameters(Message userParameters) {
        Message botMessage = userParameters.replyToMessage();
        if (botMessage == null) {
            throw new NotAReplyMessageException("Passed message is not a reply (original Message is null)");
        } else if (!botMessage.from().isBot()) {
            throw new NotReplyOnBotMessageException("Message with parameters must be reply on bit message");
        }

        ParameterizedExecutableSlashCommand slashCommand =
            (ParameterizedExecutableSlashCommand) defineSlashCommandFromBotMessage(botMessage);
        return slashCommand.executeWithParametersAndGetResponse(userParameters);
    }

    private SlashCommand defineSlashCommandFromBotMessage(Message originalMessage) {
        String messageText = originalMessage.text();
        int slashCommandsInMessageText = 0;
        SlashCommand resultSlashCommand = null;

        for (var slashCommand : allCommands.values()) {
            if (messageText.contains(slashCommand.getTextCommand())) {
                slashCommandsInMessageText++;
                resultSlashCommand = slashCommand;
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
            case null -> throw new NoSuchCommandException(STR."There is no such command: \{message.text()}");
            case NoParametersExecutableSlashCommand noParametersExecutableSlashCommand ->
                noParametersExecutableSlashCommand.executeAndGetResponse();
            case ParameterizedExecutableSlashCommand parameterizedExecutableSlashCommand ->
                parameterizedExecutableSlashCommand.executeWithParametersAndGetResponse(message);
            default ->
                throw new StrangeSlashCommandException(STR."Command \"\{command.getTextCommand()}\" has no way of execution");
        };
    }

    private boolean isUserParameters(Message message) {
        return message.replyToMessage() != null;
    }
}
