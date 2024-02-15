package edu.java.bot.eventListeners;

import com.pengrad.telegrambot.TelegramBot;
import com.pengrad.telegrambot.model.Chat;
import com.pengrad.telegrambot.model.Message;
import edu.java.bot.botMessageEventListeners.BotMessageEvent;
import edu.java.bot.botMessageEventListeners.BotMessageEventListener;
import edu.java.bot.services.CommandService;
import edu.java.bot.services.exceptions.BadLinkException;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class BotMessageEventListenerTest {

    @Mock TelegramBot telegramBot;

    @Mock CommandService commandService;

    @InjectMocks BotMessageEventListener botMessageEventListener;

    @Test
    public void should_executeSendMessage_when_requestOk() {
        Mockito.doReturn(null).when(commandService).handleMessage(Mockito.any());

        botMessageEventListener.onBotMessageEvent(new BotMessageEvent(new Message()));

        Mockito.verify(telegramBot, Mockito.times(1)).execute(Mockito.any());
    }

    @Test
    public void should_executeSendMessage_when_exceptionThrown() {
        //Arrange
        Mockito.doThrow(new BadLinkException("")).when(commandService).handleMessage(Mockito.any());

        Message spyMessage = Mockito.spy(new Message());
        Mockito.doReturn(new Chat()).when(spyMessage).chat();

        BotMessageEvent event = new BotMessageEvent(spyMessage);

        //Act
        botMessageEventListener.onBotMessageEvent(event);

        //Assert
        Mockito.verify(telegramBot, Mockito.times(1)).execute(Mockito.any());
    }

}
