package edu.java.bot.services.slashCommands;

public non-sealed interface NoParametersExecutableSlashCommand extends SlashCommand {
    String executeAndGetResponse();
}
