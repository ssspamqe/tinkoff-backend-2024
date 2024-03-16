package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.TrackSlashCommand;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.mockito.ArgumentMatchers.eq;

@ExtendWith(MockitoExtension.class)
class TrackSlashCommandTest {

    @Mock ScrapperLinksClient scrapperLinksClient;

    @InjectMocks
    TrackSlashCommand command;

    @Test
    void should_sendRequestForTracking() {
        Message parameterMessage = getMessageWithLinkAndChatId("https://first/link", 1L);

        String actualResponse = command.executeWithUserParametersAndGetResponse(parameterMessage);

        Mockito.verify(scrapperLinksClient, Mockito.times(1)).trackLinkByChatId(Mockito.any(), eq(1L));
        assertThat(actualResponse).isEqualTo("Given link was successfully added to /track it!");
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

    Message getMessageWithLinkAndChatId(String link, Long chatId) {
        Chat chat = Mockito.spy(new Chat());
        Mockito.when(chat.id()).thenReturn(chatId);

        Message parameterizedMessage = Mockito.spy(new Message());
        Mockito.when(parameterizedMessage.chat()).thenReturn(chat);
        Mockito.when(parameterizedMessage.text()).thenReturn(link);

        return parameterizedMessage;
    }
}
