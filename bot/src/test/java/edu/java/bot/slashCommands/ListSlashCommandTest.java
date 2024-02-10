package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class ListSlashCommandTest {

    @Mock
    SubscriptionRepository subscriptionRepository;

    @InjectMocks
    ListSlashCommand command;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void should_returnMessageWithSubscriptionList() {
        //Arrange
        var subscriptionList = List.of(
            new Subscription(1L, 1L, "first/link"),
            new Subscription(2L, 1L, "second/link"),
            new Subscription(3L, 1L, "third/link")
        );
        Mockito.when(subscriptionRepository.findAllByUserId(1)).thenReturn(subscriptionList);

        Message spyMessage = getDefaultSpyMessage();

        //Act
        String actualResponse = command.executeWithParametersAndGetResponse(spyMessage);

        //Asert
        assertThat(actualResponse).contains("first/link", "second/link", "third/link");
    }

    @Test
    void should_returnSpecialMessage_when_noSubscriptions() {
        //Arrange
        List<Subscription> subscriptionList = List.of();
        Mockito.when(subscriptionRepository.findAllByUserId(1)).thenReturn(subscriptionList);

        Message spyMessage = getDefaultSpyMessage();

        //Act
        String actualResponse = command.executeWithParametersAndGetResponse(spyMessage);

        //Asser
        assertThat(actualResponse).isEqualTo("There is no active subscriptions");
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

    Message getDefaultSpyMessage() {
        Chat spyChat = Mockito.spy(new Chat());
        Mockito.when(spyChat.id()).thenReturn(1L);

        User user = new User(1L);

        Message spyMessage = Mockito.spy(new Message());
        Mockito.when(spyMessage.chat()).thenReturn(spyChat);
        Mockito.when(spyMessage.from()).thenReturn(user);

        return spyMessage;
    }
}
