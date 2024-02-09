package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StartSlashCommandTest {
    SlashCommand command;

    @BeforeEach
    void setUp() {
        command = new StartSlashCommand();
    }

    @Test
    void should_returnSendMessageRequest() {
        //Arrange
        Chat chatSpy = Mockito.spy(new Chat());
        Mockito.when(chatSpy.id()).thenReturn(1L);

        Message spyMessage = Mockito.spy(new Message());
        Mockito.when(spyMessage.chat()).thenReturn(chatSpy);

        //Act
        String actualResponse = command.getSimpleResponse(spyMessage);

        //Assert
        assertThat(actualResponse).isEqualTo("Registration...");
    }

    @Test
    void should_returnBotCommandInstance() {
        BotCommand botCommand = command.getBotCommand();

        assertAll(
            "Bot command instance should have correct text command and description",
            () -> assertThat(botCommand.command()).isEqualTo("/start"),
            () -> assertThat(botCommand.description()).isEqualTo("Register in app")
        );
    }
}
