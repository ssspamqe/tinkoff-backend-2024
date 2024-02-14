package edu.java.bot.services.slashCommands;

public non-sealed interface SimplyExecutableSlashCommand extends SlashCommand {
    String executeAndGetResponse();
}
