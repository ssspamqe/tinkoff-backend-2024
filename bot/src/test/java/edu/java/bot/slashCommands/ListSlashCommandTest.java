package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.ListSlashCommand;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.dto.responses.LinkResponse;
import edu.java.bot.webClients.scrapper.dto.responses.ListLinksResponse;
import java.net.URI;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@ExtendWith(MockitoExtension.class)
class ListSlashCommandTest {

    @Mock
    ScrapperLinksClient scrapperLinksClient;

    @InjectMocks
    ListSlashCommand command;

    @Test
    void should_sendRequestForStartingToTrack() {
        //Arrange
        Mockito.when(scrapperLinksClient.fetchTrackedLinksByChatId(1L)).thenReturn(
            new ListLinksResponse(
                List.of(
                    new LinkResponse(1, URI.create("https://link1")),
                    new LinkResponse(2, URI.create("https://link2"))
                ),
                2
            )
        );
        Message spyMessage = getSpyMessageWithUserId(1L);

        //Act
        String actualResponse = command.executeAndGetResponse(spyMessage);

        //Asert
        Mockito.verify(scrapperLinksClient, Mockito.times(1)).fetchTrackedLinksByChatId(1L);
        assertThat(actualResponse).isEqualTo("""
            Here are your current subscriptions:
            1) link1
            https://link1
            2) link2
            https://link2
            """);
    }

    @Test
    void should_returnBotCommandInstance() {
        BotCommand botCommand = command.getBotCommand();

        assertAll(
            "Bot command instance should have correct text command and description",
            () -> assertThat(botCommand.command()).isEqualTo(command.getTextCommand()),
            () -> assertThat(botCommand.description()).isEqualTo(command.getDescription())
        );
    }

    Message getSpyMessageWithUserId(Long userId) {
        User user = new User(userId);

        Message spyMessage = Mockito.spy(new Message());
        Mockito.when(spyMessage.from()).thenReturn(user);

        return spyMessage;
    }
}
