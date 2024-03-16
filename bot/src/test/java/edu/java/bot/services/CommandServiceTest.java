package edu.java.bot.services;

import com.pengrad.telegrambot.model.BotCommand;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import com.pengrad.telegrambot.model.User;
import edu.java.bot.telegramBot.slashCommandServices.CommandService;
import edu.java.bot.telegramBot.slashCommandServices.exceptions.NoSuchCommandException;
import edu.java.bot.telegramBot.slashCommandServices.exceptions.NotACommandOrUserParameterException;
import edu.java.bot.telegramBot.slashCommandServices.exceptions.NotAReplyOnBotMessageException;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.HelpSlashCommand;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.ListSlashCommand;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.TrackSlashCommand;
import edu.java.bot.webClients.scrapper.ScrapperLinksClient;
import java.util.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

@ExtendWith(MockitoExtension.class)
public class CommandServiceTest {

    CommandService commandService;

    @Spy
    HelpSlashCommand helpSlashCommand;

    @Spy ScrapperLinksClient scrapperLinksClient;

    @Spy
    @InjectMocks
    ListSlashCommand listSlashCommand;

    @Spy
    @InjectMocks
    TrackSlashCommand trackSlashCommand;

    @BeforeEach
    void init() {
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
        Mockito.when(spyMessage.from()).thenReturn(new User(1L));

        commandService.handleMessage(spyMessage);

        Mockito.verify(helpSlashCommand, Mockito.times(1)).executeAndGetResponse(spyMessage);
    }

    @Test
    void should_callParameterizedCommandExecution_when_passedNotReplyMessageAndParameterizedCommand() {
        Message spyMessage = Mockito.spy(new Message());
        Mockito.when(spyMessage.text()).thenReturn("/list");
        Mockito.when(spyMessage.chat()).thenReturn(new Chat());
        Mockito.doReturn("subscriptionList").when(listSlashCommand).executeAndGetResponse(spyMessage);

        commandService.handleMessage(spyMessage);

        Mockito.verify(listSlashCommand, Mockito.times(1)).executeAndGetResponse(spyMessage);
    }

    @Test
    void should_callParameterizedExecution_when_passedReplyMessage() {
        //Arrange
        User botUser = Mockito.spy(new User(1L));
        Mockito.when(botUser.isBot()).thenReturn(true);

        Message repliedMessage = Mockito.spy(new Message());
        Mockito.when(repliedMessage.from()).thenReturn(botUser);
        Mockito.when(repliedMessage.text()).thenReturn("bla bla bla /track");
        Mockito.when(repliedMessage.chat()).thenReturn(new Chat());

        Message parameterMessage = Mockito.spy(new Message());
        Mockito.when(parameterMessage.replyToMessage()).thenReturn(repliedMessage);

        Mockito.doReturn("response").when(trackSlashCommand)
            .executeWithUserParametersAndGetResponse(parameterMessage);

        //Act
        commandService.handleMessage(parameterMessage);

        //Assert
        Mockito.verify(trackSlashCommand, Mockito.times(1))
            .executeWithUserParametersAndGetResponse(parameterMessage);
    }

    @Test
    void should_throwSpecialException_when_repliedNotOnBotMessage() {
        //Arrange
        User botUser = Mockito.spy(new User(1L));
        Mockito.when(botUser.isBot()).thenReturn(false);

        Message repliedMessage = Mockito.spy(new Message());
        Mockito.when(repliedMessage.from()).thenReturn(botUser);

        Message parameterMessage = Mockito.spy(new Message());
        Mockito.when(parameterMessage.replyToMessage()).thenReturn(repliedMessage);

        //Act, Assert
        assertThatThrownBy(
            () -> commandService.handleMessage(parameterMessage)
        ).isInstanceOf(NotAReplyOnBotMessageException.class);
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

        assertThatThrownBy(
            () -> commandService.handleMessage(message)
        ).isInstanceOf(NotACommandOrUserParameterException.class);
    }
}
