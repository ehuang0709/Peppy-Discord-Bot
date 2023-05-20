package org.bot.discord.peppy.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.interactions.commands.OptionMapping;

public class CharactersByElementsFactory {
    CharactersByElements characters = new CharactersByElements();

    protected void handleCharactersByElementCommand(SlashCommandInteractionEvent event) {
        OptionMapping inputElement = event.getOption("element");
        if (inputElement == null) {
            event.reply("An element is not provided.").queue();
            return;
        }
        String element = inputElement.getAsString();
        switch (element) {
            case "physical":
                characters.physicalCharacters(event);
                break;
            case "fire":
                characters.fireCharacters(event);
                break;
            case "ice":
                characters.iceCharacters(event);
                break;
            case "lightning":
                characters.lightningCharacters(event);
                break;
            case "wind":
                characters.windCharacters(event);
                break;
            case "quantum":
                characters.quantumCharacters(event);
                break;
            case "imaginary":
                characters.imaginaryCharacters(event);
                break;
            default:
                event.reply("Not a valid element.").queue();
        }
    }
}
