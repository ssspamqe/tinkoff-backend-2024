package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

public class UntrackSlashCommandTest {

    @Mock
    SubscriptionRepository subscriptionRepository;

    @InjectMocks
    UntrackSlashCommand command;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void should_removeSubscription() {
        //Assert
        var subscriptionList = List.of(
            new Subscription(1L, 1L, "https://first/link"),
            new Subscription(2L, 1L, "https://second/link")
        );
        Mockito.when(subscriptionRepository.findAllByUserId(1L)).thenReturn(subscriptionList);
        Message parameterizedMessage = getParameterizeMessageWithLinkAndUserId("https://first/link", 1L);

        //Act
        String actualResponse = command.getParameterizedResponse(parameterizedMessage);

        //Assert
        Mockito.verify(subscriptionRepository, Mockito.times(1)).deleteById(1L);
        assertThat(actualResponse).isEqualTo("The subscription on https://first/link was successfully deleted");
    }

    @Test
    void should_returnSpecialMessage_when_noSuchSubscription() {
        var subscriptionList = List.of(
            new Subscription(1L, 1L, "https://first/link"),
            new Subscription(2L, 1L, "https://second/link")
        );
        Mockito.when(subscriptionRepository.findAllByUserId(1L)).thenReturn(subscriptionList);
        Message parameterizedMessage = getParameterizeMessageWithLinkAndUserId("https://third/link", 1L);

        String actualResponse = command.getParameterizedResponse(parameterizedMessage);

        assertThat(actualResponse).isEqualTo("There is no such subscription");
    }

    @ParameterizedTest
    @ValueSource(strings = {"ashajdfjakd sdfsdf", "asdjasd ", "/track httsp:Mylink", ""})
    void should_returnSpecialMessage_when_linkIsNotValid(String link) {
        Message parameterizedMessage = getParameterizeMessageWithLinkAndUserId(link, 1L);

        String actualResponse = command.getParameterizedResponse(parameterizedMessage);

        assertThat(actualResponse).isEqualTo(STR."Error! \"\{link}\" is not correct");
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

    Message getParameterizeMessageWithLinkAndUserId(String link, Long userId) {
        User user = new User(userId);

        Message originalMessage = new Message();
        Mockito.when(originalMessage.text()).thenReturn(command.getSimpleResponse());

        Message parameterizedMessage = Mockito.spy(new Message());
        Mockito.when(parameterizedMessage.from()).thenReturn(user);
        Mockito.when(parameterizedMessage.text()).thenReturn(link);
        Mockito.when(parameterizedMessage.replyToMessage()).thenReturn(originalMessage);

        return parameterizedMessage;
    }
}
