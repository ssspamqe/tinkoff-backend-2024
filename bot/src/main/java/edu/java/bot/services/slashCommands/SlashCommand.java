package edu.java.bot.services.slashCommands;

import com.pengrad.telegrambot.model.BotCommand;

public sealed interface SlashCommand permits ExecuableWithArgumentsSlashCommand, SimplyExecutableSlashCommand {

    String getTextCommand();

    String getDescription();

    BotCommand getBotCommand();

    boolean needAdditionalUserParameter();
}
