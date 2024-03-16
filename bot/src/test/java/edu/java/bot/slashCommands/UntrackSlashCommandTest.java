package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.UntrackSlashCommand;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import edu.java.bot.webClients.scrapper.dto.requests.RemoveLinkRequest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@ExtendWith(MockitoExtension.class)
public class UntrackSlashCommandTest {

    @Mock
    ScrapperLinksClient scrapperLinksClient;

    @InjectMocks
    UntrackSlashCommand command;

    @Test
    void should_sendRequestForUntracking() {
        Message parameterMessage = getParameterMessageWithLinkAndChatId("https://first/link", 1L);

        String actualResponse = command.executeWithUserParametersAndGetResponse(parameterMessage);

        Mockito.verify(scrapperLinksClient, Mockito.times(1))
            .untrackLinkByChatId(new RemoveLinkRequest("https://first/link"), 1L);
        assertThat(actualResponse).isEqualTo("/unrack command succeed!");
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

    Message getParameterMessageWithLinkAndChatId(String link, Long chatId) {
        User user = new User(chatId);

        Message parameterizedMessage = Mockito.spy(new Message());
        Mockito.when(parameterizedMessage.from()).thenReturn(user);
        Mockito.when(parameterizedMessage.text()).thenReturn(link);

        return parameterizedMessage;
    }
}
