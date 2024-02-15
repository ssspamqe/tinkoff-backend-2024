package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
import edu.java.bot.services.slashCommands.TrackSlashCommand;
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
class TrackSlashCommandTest {

    @Mock
    SubscriptionRepository subscriptionRepository;

    @Spy
    Validator validator = Validation.buildDefaultValidatorFactory().getValidator();

    @InjectMocks
    TrackSlashCommand command;

    @Test
    void should_addLinkToDatabase() {
        Message parameterMessage = getMessageWithLinkAndUserId("https://first/link", 1L);

        String actualResponse = command.executeAndGetResponse(parameterMessage);

        Subscription expectedToSaveSubscription = new Subscription(0L, 1L, "https://first/link");
        Mockito.verify(subscriptionRepository, Mockito.times(1)).save(expectedToSaveSubscription);
        assertThat(actualResponse).isEqualTo("Given link was successfully added to /track it!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"ashajdfjakd sdfsdf", "asdjasd ", "/track https:Mylink", ""})
    void should_returnSpecialMessage_when_linkNotMatchRegex(String link) {
        Message parameterMessage = getMessageWithLinkAndUserId(link, 1L);

        String actualResponse = command.executeAndGetResponse(parameterMessage);

        String expectedResponse = """
            Can't /track link because:
            1) must match "https?://.*\"""";
        assertThat(actualResponse).isEqualTo(expectedResponse);
    }

    @Test
    void should_returnSpecialMessage_when_doubleLinks() {
        Message parameterMessage = getMessageWithLinkAndUserId("https://ll", 1L);

        Mockito.when(
            subscriptionRepository.findAllByUserId(1L)
        ).thenReturn(
            List.of(new Subscription(1L, 1L, "https://ll"))
        );
        String actualResponse = command.executeAndGetResponse(parameterMessage);

        assertThat(actualResponse).isEqualTo("This link was already added to /track it");
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

    Message getMessageWithLinkAndUserId(String link, Long userId) {
        User user = new User(userId);

        Message parameterizedMessage = Mockito.spy(new Message());
        Mockito.when(parameterizedMessage.from()).thenReturn(user);
        Mockito.when(parameterizedMessage.text()).thenReturn(link);

        return parameterizedMessage;
    }
}
