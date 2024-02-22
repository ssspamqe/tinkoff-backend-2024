package edu.java.bot.telegramBot.slashCommandServices.slashCommands;

public non-sealed interface SimplyExecutableSlashCommand extends SlashCommand {
    String executeAndGetResponse();
}
