package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.UntrackSlashCommand;
import jakarta.validation.Validation;
import jakarta.validation.Validator;
import java.util.List;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

@ExtendWith(MockitoExtension.class)
public class UntrackSlashCommandTest {

    @Mock
    SubscriptionRepository subscriptionRepository;

    @Spy
    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @InjectMocks
    UntrackSlashCommand command;

    @Test
    void should_removeSubscription() {
        var subscriptionList = List.of(
            new Subscription(1L, 1L, "https://first/linkEntity"),
            new Subscription(2L, 1L, "https://second/linkEntity")
        );
        Mockito.when(subscriptionRepository.findAllByUserId(1L)).thenReturn(subscriptionList);
        Message parameterMessage = getParameterMessageWithLinkAndUserId("https://first/linkEntity", 1L);

        String actualResponse = command.executeWithUserParametersAndGetResponse(parameterMessage);

        Mockito.verify(subscriptionRepository, Mockito.times(1)).deleteById(1L);
        assertThat(actualResponse).isEqualTo("/unrack command succeed!");
    }

    @Test
    void should_returnSpecialMessage_when_noSuchSubscription() {
        var subscriptionList = List.of(
            new Subscription(1L, 1L, "https://first/linkEntity"),
            new Subscription(2L, 1L, "https://second/linkEntity")
        );
        Mockito.when(subscriptionRepository.findAllByUserId(1L)).thenReturn(subscriptionList);
        Message parameterMessage = getParameterMessageWithLinkAndUserId("https://third/linkEntity", 1L);

        String actualResponse = command.executeWithUserParametersAndGetResponse(parameterMessage);

        assertThat(actualResponse).isEqualTo("You don't have such subscription");
    }

    @ParameterizedTest
    @ValueSource(strings = {"ashajdfjakd sdfsdf", "asdjasd ", "/track httsp:Mylink", ""})
    void should_returnSpecialMessage_when_linkIsNotValid(String linkEntity) {
        Message parameterMessage = getParameterMessageWithLinkAndUserId(linkEntity, 1L);

        String actualResponse = command.executeWithUserParametersAndGetResponse(parameterMessage);

        String expectedResponse = """
            Can't /untrack linkEntity because:
            1) must match "https?://.*\"""";
        assertThat(actualResponse).isEqualTo(expectedResponse);
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

    Message getParameterMessageWithLinkAndUserId(String linkEntity, Long userId) {
        User user = new User(userId);

        Message parameterizedMessage = Mockito.spy(new Message());
        Mockito.when(parameterizedMessage.from()).thenReturn(user);
        Mockito.when(parameterizedMessage.text()).thenReturn(linkEntity);

        return parameterizedMessage;
    }
}
