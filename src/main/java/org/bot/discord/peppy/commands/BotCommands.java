package org.bot.discord.peppy.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

// .setEphemeral only makes the user who executed the command see the message

public class BotCommands extends ListenerAdapter {

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
//        super.onSlashCommandInteraction(event);
        String commandName = event.getName();
        switch (commandName) {
            case "characters":
                CharactersByElementsFactory getCharactersByElements = new CharactersByElementsFactory();
                getCharactersByElements.handleCharactersByElementCommand(event);
                break;
            case "seele":
                Characters character = new GetCharacterInfo();
                character.seele(event);
                break;

        }

    }



}
