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
            case "physical" -> characters.physicalCharacters(event);
            case "fire" -> characters.fireCharacters(event);
            case "ice" -> characters.iceCharacters(event);
            case "lightning" -> characters.lightningCharacters(event);
            case "wind" -> characters.windCharacters(event);
            case "quantum" -> characters.quantumCharacters(event);
            case "imaginary" -> characters.imaginaryCharacters(event);
            default -> event.reply("Not a valid element.").queue();
        }
    }
}
