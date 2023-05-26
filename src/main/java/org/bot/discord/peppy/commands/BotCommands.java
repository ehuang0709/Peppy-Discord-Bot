package org.bot.discord.peppy.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.bot.discord.peppy.characters.ButtonListeners;
import org.bot.discord.peppy.characters.Characters;
import org.bot.discord.peppy.characters.GetCharacterInfo;

// .setEphemeral only makes the user who executed the command see the message

public class BotCommands extends ListenerAdapter {
    Characters character = new GetCharacterInfo();

    @Override
    public void onSlashCommandInteraction(SlashCommandInteractionEvent event) {
        String commandName = event.getName();
        switch (commandName) {
            case "characters" -> {
                CharactersByElementsFactory getCharactersByElements = new CharactersByElementsFactory();
                getCharactersByElements.handleCharactersByElementCommand(event);
            }
            case "seele" -> {
                ButtonListeners.setLastCommand("seele");
                character.seele(event);
            }
            case "bailu" -> {
                ButtonListeners.setLastCommand("bailu");
                character.bailu(event);
            }
            case "jing-yuan" -> {
                ButtonListeners.setLastCommand("jing-yuan");
                character.jingyuan(event);
            }
            case "qingque" -> {
                ButtonListeners.setLastCommand("qingque");
                character.qingque(event);
            }
            case "tingyun" -> {
                ButtonListeners.setLastCommand("tingyun");
                character.tingyun(event);
            }
            case "serval" -> {
                ButtonListeners.setLastCommand("serval");
                character.serval(event);
            }
            case "arlan" -> {
                ButtonListeners.setLastCommand("arlan");
                character.arlan(event);
            }
        }
    }
}
