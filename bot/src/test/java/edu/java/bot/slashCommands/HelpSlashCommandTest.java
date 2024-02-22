package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.HelpSlashCommand;
import edu.java.bot.telegramBot.slashCommandServices.slashCommands.SlashCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class HelpSlashCommandTest {

    SlashCommand command;

    @BeforeEach
    void init() {
        command = new HelpSlashCommand();
    }

    @Test
    void should_returnBotCommandInstance() {
        BotCommand botCommand = command.getBotCommand();

        assertAll(
            "Bot command instance should have correct text command and description",
            () -> assertThat(botCommand.command()).isEqualTo("/help"),
            () -> assertThat(botCommand.description()).isEqualTo("Get list of commands")
        );
    }
}
