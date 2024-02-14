package edu.java.bot.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;
import edu.java.bot.services.slashCommands.SlashCommand;
import edu.java.bot.services.slashCommands.StartSlashCommand;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;

class StartSlashCommandTest {

    SlashCommand command;

    @BeforeEach
    void setUp() {
        command = new StartSlashCommand();
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
}
