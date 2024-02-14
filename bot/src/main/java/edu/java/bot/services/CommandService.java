package edu.java.bot.services;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.request.ForceReply;
import com.pengrad.telegrambot.model.request.ReplyKeyboardRemove;
import com.pengrad.telegrambot.request.SendMessage;
import edu.java.bot.services.exceptions.NoSuchCommandException;
import edu.java.bot.services.exceptions.NotACommandOrUserParameterException;
import edu.java.bot.services.exceptions.NotAReplyOnBotMessageException;
import edu.java.bot.services.exceptions.StrangeSlashCommandException;
import edu.java.bot.services.slashCommands.SimplyExecutableSlashCommand;
import edu.java.bot.services.slashCommands.ExecuableWithArgumentsSlashCommand;
import edu.java.bot.services.slashCommands.SlashCommand;
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
        } else if (isCommand(message)) {
            String responseText = handleCommand(message);
            SendMessage sendMessageRequest = new SendMessage(chatId, responseText);

            if (defineSlashCommand(message.text()).needAdditionalUserParameter()) {
                return sendMessageRequest.replyMarkup(new ForceReply());
            } else {
                return sendMessageRequest.replyMarkup(new ReplyKeyboardRemove());
            }

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

    private String handleUserParameters(Message userParameters) {
        Message botMessage = userParameters.replyToMessage();
        if (botMessage == null || !botMessage.from().isBot()) {
            throw new NotAReplyOnBotMessageException("Message with parameters must be a reply on bot message");
        }

        ExecuableWithArgumentsSlashCommand slashCommand = null;
        try {
            slashCommand = (ExecuableWithArgumentsSlashCommand) defineSlashCommand(botMessage.text());
        } catch (ClassCastException ex) {
            throw new StrangeSlashCommandException(
                STR."Command from message: \"\{botMessage.text()}\" have no parameters"
            );
        }
        return slashCommand.executeAndGetResponse(userParameters);
    }

    //TODO rework initial command use
    private String handleCommand(Message message) {
        SlashCommand command = defineSlashCommand(message.text());
        return switch (command) {
            case SimplyExecutableSlashCommand simplyExecutableSlashCommand ->
                simplyExecutableSlashCommand.executeAndGetResponse();
            case ExecuableWithArgumentsSlashCommand execuableWithArgumentsSlashCommand ->
                execuableWithArgumentsSlashCommand.executeAndGetResponse(message);
            default -> throw new StrangeSlashCommandException(
                STR."Command \"\{command.getTextCommand()}\" has no way of execution"
            );
        };
    }

    private SlashCommand defineSlashCommand(String text) {
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
