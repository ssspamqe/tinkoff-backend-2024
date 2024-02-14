package edu.java.bot.controllers;

import com.pengrad.telegrambot.Callback;
import com.pengrad.telegrambot.request.SendMessage;
import com.pengrad.telegrambot.response.SendResponse;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class LoggingCallback implements Callback<SendMessage, SendResponse> {

    private static final Logger LOGGER = LogManager.getLogger();

    @Override
    public void onResponse(SendMessage sendMessage, SendResponse sendResponse) {
        LOGGER.info(STR."Successfully sent message to \{sendResponse.message().from().username()}");
    }

    @Override
    public void onFailure(SendMessage sendMessage, IOException e) {
        LOGGER.warn(STR."Unsuccessful tryout of sending message, IOException: \{e.getMessage()}");
    }
}
