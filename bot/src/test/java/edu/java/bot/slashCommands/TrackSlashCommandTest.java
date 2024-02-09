package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.data.entities.Subscription;
import edu.java.bot.data.repositories.SubscriptionRepository;
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
import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class TrackSlashCommandTest {

    @Mock
    SubscriptionRepository subscriptionRepository;

    @InjectMocks
    TrackSlashSlashCommand command;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void should_addLinkToDatabase() {
        Message parameterizedMessage = getDefaultParameterizedMessage();

        String actualResponse = command.getParameterizedResponse(parameterizedMessage);

        Subscription expectedToSaveSubscription = new Subscription(0L, 1L, "https://first/link");
        assertDoesNotThrow(() ->
            Mockito.verify(subscriptionRepository, Mockito.times(1)).save(expectedToSaveSubscription)
        );
        assertThat(actualResponse).isEqualTo("Successfully added https://first/link for tracking!");
    }

    @ParameterizedTest
    @ValueSource(strings = {"ashajdfjakd sdfsdf", "asdjasd ", "/track httsp:Mylink", ""})
    void should_returnSpecialMessage_when_linkIsNotValid(String link) {
        Message parameterizedMessage = getParameterizeMessageWithLink(link);

        String actualResponse = command.getParameterizedResponse(parameterizedMessage);

        assertThat(actualResponse).isEqualTo(STR."Error! \"\{link}\" is not correct");
    }

    @Test
    void should_returnBotCommandInstance() {
        BotCommand botCommand = command.getBotCommand();

        assertAll(
            "Bot command instance should have correct text command and description",
            () -> assertThat(botCommand.command()).isEqualTo("/track"),
            () -> assertThat(botCommand.description()).isEqualTo("Start tracking updates from given link")
        );
    }

    Message getDefaultParameterizedMessage() {
        return getParameterizeMessageWithLink("https://first/link");
    }

    Message getParameterizeMessageWithLink(String link) {
        User user = new User(1L);

        Message originalMessage = new Message();
        Mockito.when(originalMessage.text()).thenReturn(command.getSimpleResponse());

        Message parameterizedMessage = Mockito.spy(new Message());
        Mockito.when(parameterizedMessage.from()).thenReturn(user);
        Mockito.when(parameterizedMessage.text()).thenReturn(link);
        Mockito.when(parameterizedMessage.replyToMessage()).thenReturn(originalMessage);

        return parameterizedMessage;
    }
}
