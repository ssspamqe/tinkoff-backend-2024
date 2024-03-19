package edu.java.bot.telegramBot.slashCommandServices;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.request.ForceReply;
import com.pengrad.telegrambot.model.request.ReplyKeyboardRemove;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.telegramBot.slashCommandServices.exceptions.NoSuchCommandException;
import edu.java.bot.telegramBot.slashCommandServices.exceptions.NotACommandOrUserParameterException;
import edu.java.bot.telegramBot.slashCommandServices.exceptions.NotAReplyOnBotMessageException;
import edu.java.bot.telegramBot.slashCommandServices.exceptions.StrangeSlashCommandException;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.ParameterizedSlashCommand;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.SlashCommand;
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
        allCommands = HashMap.newHashMap(commandList.size());
        commandList.forEach(command -> allCommands.put(command.getTextCommand(), command));
    }

    public BotCommand[] getAllBotCommands() {
        return allCommands.values().stream()
            .map(SlashCommand::getBotCommand).toArray(BotCommand[]::new);
    }

    public SendMessage handleMessage(Message message) {
        if (isUserParameters(message)) {
            return handleUserParameters(message);
        } else if (isCommand(message)) {
            return handleCommand(message);
        } else {
            throw new NotACommandOrUserParameterException("It is not a command or parameters!");
        }
    }

    private boolean isUserParameters(Message message) {
        return message.replyToMessage() != null;
    }

    private boolean isCommand(Message message) {
        return message.text().startsWith("/");
    }

    private SendMessage handleUserParameters(Message userParameters) {
        Message botMessage = userParameters.replyToMessage();
        if (botMessage == null || !botMessage.from().isBot()) {
            throw new NotAReplyOnBotMessageException("Message with parameters must be a reply on bot message");
        }

        ParameterizedSlashCommand slashCommand =
            parseParameterizedSlashCommandOrThrowException(botMessage.text());

        Long chatId = botMessage.chat().id();
        String response = slashCommand.executeWithUserParametersAndGetResponse(userParameters);
        return new SendMessage(chatId, response).replyMarkup(new ReplyKeyboardRemove());
    }

    private ParameterizedSlashCommand parseParameterizedSlashCommandOrThrowException(
        String text
    ) {
        try {
            return (ParameterizedSlashCommand) parseSlashCommand(text);
        } catch (ClassCastException ex) {
            throw new StrangeSlashCommandException(
                STR."Command from message: \"\{text}\" have no parameters"
            );
        }
    }

    private SendMessage handleCommand(Message message) {
        Long chatId = message.chat().id();
        SlashCommand command = parseSlashCommand(message.text());
        String responseText = command.executeAndGetResponse(message);
        SendMessage sendMessageRequest = new SendMessage(chatId, responseText);

        if (requiresUserParameters(command)) {
            return sendMessageRequest.replyMarkup(new ForceReply());
        } else {
            return sendMessageRequest.replyMarkup(new ReplyKeyboardRemove());
        }
    }

    private boolean requiresUserParameters(SlashCommand command) {
        return command instanceof ParameterizedSlashCommand;
    }

    private SlashCommand parseSlashCommand(String text) {
        String firstCommand = extractFirstCommand(text);
        SlashCommand slashCommand = allCommands.get(firstCommand);
        if (slashCommand == null) {
            throw new NoSuchCommandException(STR."There is no such command \"\{firstCommand}\"!");
        }
        return slashCommand;
    }

    private String extractFirstCommand(String text) {
        String[] words = text.split(" ");
        for (var word : words) {
            if (word.startsWith("/")) {
                return word;
            }
        }
        return null;
    }

}
