package edu.java.bot.services;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.data.repositories.SubscriptionRepository;
import edu.java.bot.services.exceptions.CantDefineSlashCommandFromTextException;
import edu.java.bot.services.exceptions.NoSuchCommandException;
import edu.java.bot.services.exceptions.NotACommandOrUserParameterException;
import edu.java.bot.services.exceptions.NotReplyOnBotMessageException;
import edu.java.bot.slashCommands.HelpSlashCommand;
import edu.java.bot.slashCommands.ListSlashCommand;
import edu.java.bot.slashCommands.TrackSlashCommand;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.Spy;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class CommandServiceTest {

    CommandService commandService;

    @Mock
    SubscriptionRepository subscriptionRepository;

    @Spy
    HelpSlashCommand helpSlashCommand;

    @Spy
    @InjectMocks
    ListSlashCommand listSlashCommand;

    @Spy
    @InjectMocks
    TrackSlashCommand trackSlashCommand;

    @BeforeEach
    void init() {
        MockitoAnnotations.openMocks(this);
        commandService = new CommandService(List.of(helpSlashCommand, listSlashCommand, trackSlashCommand));
    }

    @Test
    void should_returnArrayOfBotCommands() {
        BotCommand[] actualBotCommands = commandService.getAllBotCommands();

        var expectedBotCommands = new BotCommand[] {
            new BotCommand(helpSlashCommand.getTextCommand(), helpSlashCommand.getDescription()),
            new BotCommand(listSlashCommand.getTextCommand(), listSlashCommand.getDescription()),
            new BotCommand(trackSlashCommand.getTextCommand(), trackSlashCommand.getDescription())
        };
        assertThat(actualBotCommands).containsExactlyInAnyOrder(expectedBotCommands);
    }

    @Test
    void should_callNonParameterizedCommandExecution_when_passedNotReplyMessageAndNotParameterizedCommand() {
        Message spyMessage = Mockito.spy(new Message());
        Mockito.when(spyMessage.text()).thenReturn("/help");
        Mockito.when(spyMessage.chat()).thenReturn(new Chat());

        commandService.handleMessage(spyMessage);

        Mockito.verify(helpSlashCommand, Mockito.times(1)).executeAndGetResponse();
    }

    @Test
    void should_callParameterizedCommandExecution_when_passedNotReplyMessageAndParameterizedCommand() {
        Message spyMessage = Mockito.spy(new Message());
        Mockito.when(spyMessage.text()).thenReturn("/list");
        Mockito.when(spyMessage.chat()).thenReturn(new Chat());
        Mockito.doReturn("subscriptionList").when(listSlashCommand).executeWithParametersAndGetResponse(spyMessage);
        //Mockito.when(listSlashCommand.executeWithParametersAndGetResponse(spyMessage)).thenReturn();

        commandService.handleMessage(spyMessage);

        Mockito.verify(listSlashCommand, Mockito.times(1)).executeWithParametersAndGetResponse(spyMessage);
    }

    @Test
    void should_callParameterizedExecution_when_passedReplyMessage() {
        User botUser = Mockito.spy(new User(1L));
        Mockito.when(botUser.isBot()).thenReturn(true);

        Message repliedMessage = Mockito.spy(new Message());
        Mockito.when(repliedMessage.from()).thenReturn(botUser);
        Mockito.when(repliedMessage.text()).thenReturn("bla bla bla /track");

        Message parameterMessage = Mockito.spy(new Message());
        Mockito.when(parameterMessage.replyToMessage()).thenReturn(repliedMessage);
        Mockito.when(parameterMessage.chat()).thenReturn(new Chat());

        Mockito.doReturn("response").when(trackSlashCommand).executeWithParametersAndGetResponse(parameterMessage);

        commandService.handleMessage(parameterMessage);

        Mockito.verify(trackSlashCommand, Mockito.times(1)).executeWithParametersAndGetResponse(parameterMessage);
    }

    @Test
    void should_throwSpecialException_when_moreThanOneCommandInBotMessage() {
        User botUser = Mockito.spy(new User(1L));
        Mockito.when(botUser.isBot()).thenReturn(true);

        Message repliedMessage = Mockito.spy(new Message());
        Mockito.when(repliedMessage.from()).thenReturn(botUser);
        Mockito.when(repliedMessage.text()).thenReturn("bla bla bla /track /help");

        Message parameterMessage = Mockito.spy(new Message());
        Mockito.when(parameterMessage.replyToMessage()).thenReturn(repliedMessage);
        Mockito.when(parameterMessage.chat()).thenReturn(new Chat());

        assertThatThrownBy(
            () -> commandService.handleMessage(parameterMessage)
        ).isInstanceOf(CantDefineSlashCommandFromTextException.class);
    }

    @Test
    void should_throwSpecialException_when_repliedNotOnBotMessage() {
        User botUser = Mockito.spy(new User(1L));
        Mockito.when(botUser.isBot()).thenReturn(false);

        Message repliedMessage = Mockito.spy(new Message());
        Mockito.when(repliedMessage.from()).thenReturn(botUser);

        Message parameterMessage = Mockito.spy(new Message());
        Mockito.when(parameterMessage.replyToMessage()).thenReturn(repliedMessage);
        Mockito.when(parameterMessage.chat()).thenReturn(new Chat());

        assertThatThrownBy(
            () -> commandService.handleMessage(parameterMessage)
        ).isInstanceOf(NotReplyOnBotMessageException.class);
    }

    @Test
    void should_throwSpecialExceptions_when_givenUnknownCommand() {
        Message message = Mockito.spy(new Message());
        Mockito.when(message.text()).thenReturn("/hahahah");
        Mockito.when(message.chat()).thenReturn(new Chat());

        assertThatThrownBy(
            () -> commandService.handleMessage(message)
        ).isInstanceOf(NoSuchCommandException.class);
    }

    @Test
    void should_trowSpecialException_when_messageNotCommandOrUserParameter() {
        Message message = Mockito.spy(new Message());
        Mockito.when(message.text()).thenReturn("blallblabla");
        Mockito.when(message.chat()).thenReturn(new Chat());

        assertThatThrownBy(
            () -> commandService.handleMessage(message)
        ).isInstanceOf(NotACommandOrUserParameterException.class);
    }
}
