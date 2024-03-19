package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.StartSlashCommand;
import edu.java.bot.webClients.scrapper.ScrapperTelegramChatClient;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StartSlashCommandTest extends SlashCommandTest {

    @Mock ScrapperTelegramChatClient scrapperChatClient;

    @InjectMocks
    StartSlashCommand command;

    @Test
    void should_returnBotCommandInstance() {
        BotCommand botCommand = command.getBotCommand();

        assertAll(
            "Bot command instance should have correct text command and description",
            () -> assertThat(botCommand.command()).isEqualTo(command.getTextCommand()),
            () -> assertThat(botCommand.description()).isEqualTo(command.getDescription())
        );
    }

    @Test
    void should_registerChat() {
        //Arrange
        Chat chat = Mockito.spy(new Chat());
        Mockito.when(chat.id()).thenReturn(1L);

        User user = Mockito.spy(new User(1L));
        Mockito.when(user.username()).thenReturn("testUser");

        Message message = Mockito.spy(new Message());
        Mockito.when(message.chat()).thenReturn(chat);
        Mockito.when(message.from()).thenReturn(user);

        //Act
        String actualResponse = command.executeAndGetResponse(message);

        //Assert
        Mockito.verify(scrapperChatClient, Mockito.times(1)).registerNewChat(1);
        assertThat(actualResponse).isEqualTo("""
            Hello, testUser!
            Registered""");
    }
}
