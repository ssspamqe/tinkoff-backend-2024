package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.request.SendMessage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class HelpSlashCommandTest {

    SlashCommand command;

    @BeforeEach
    void init() {
        command = new HelpSlashCommand();
    }

    @Test
    void should_returnSendMessageRequest() {
        SendMessage sendMessageRequest = command.getSendMessageRequest(1);

        String expectedText = """
            This bot allows to subscribe on updates from various services!

            Here are commands:
            **Subscription control**
            /track - Start tracking updates from given link
            /untrack - Stop tracking updates from given link
            /list - Get list of subscriptions

            **Other commands**
            /start - Register in app
            /help - Get list of commands""";
        String actualText = (String) sendMessageRequest.getParameters().get("text");

        assertThat(actualText).isEqualTo(expectedText);
    }

    @Test
    void should_returnBotCommandInstance() {
        BotCommand botCommand = command.getBotCommand();

        assertAll(
            "Bot command instance should have correct text command and description",
            () -> assertThat(botCommand.command()).isEqualTo("/help"),
            () -> assertThat(botCommand.description()).isEqualTo("Get list of commands")
        );
    }
}
