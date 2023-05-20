package org.bot.discord.peppy.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.awt.*;

public class CharactersByElements {

    protected void physicalCharacters(SlashCommandInteractionEvent event) {
        Color physical = new Color(44, 44, 55);
        EmbedBuilder physicalCharactersEmbed = new EmbedBuilder()
                .setTitle("Physical Characters")
                .setColor(physical)
                .addField("Name", """
                    Clara
                    Natasha
                    Sushang
                    """, true)
                .addField("Path", """
                    The Destruction
                    The Abundance
                    The Hunt
                    """, true)
                .addField("Rarity", """
                    ✦✦✦✦✦
                    ✦✦✦✦
                    ✦✦✦✦
                    """, true);
        event.replyEmbeds(physicalCharactersEmbed.build()).queue();
    }

    protected void fireCharacters(SlashCommandInteractionEvent event) {
        Color fire = new Color(230, 42, 41);
        EmbedBuilder fireCharactersEmbed = new EmbedBuilder()
                .setTitle("Fire Characters")
                .setColor(fire)
                .addField("Name", """
                    Himeko
                    Asta
                    Hook
                    """, true)
                .addField("Path", """
                    The Erudition
                    The Harmony
                    The Destruction
                    """, true)
                .addField("Rarity", """
                    ✦✦✦✦✦
                    ✦✦✦✦
                    ✦✦✦✦
                    """, true);
        event.replyEmbeds(fireCharactersEmbed.build()).queue();
    }

    protected void iceCharacters(SlashCommandInteractionEvent event) {
        Color ice = new Color(33, 146, 214);
        EmbedBuilder iceCharactersEmbed = new EmbedBuilder()
                .setTitle("Ice Characters")
                .setColor(ice)
                .addField("Name", """
                    Gepard
                    Yanqing
                    Herta
                    March 7th
                    Pela
                    """, true)
                .addField("Path", """
                    The Preservation
                    The Hunt
                    The Erudition
                    The Preservation
                    The Nihility
                    """, true)
                .addField("Rarity", """
                    ✦✦✦✦✦
                    ✦✦✦✦✦
                    ✦✦✦✦
                    ✦✦✦✦
                    ✦✦✦✦
                    """, true);
        event.replyEmbeds(iceCharactersEmbed.build()).queue();
    }

    protected void lightningCharacters(SlashCommandInteractionEvent event) {
        Color lightning = new Color(181, 75, 211);
        EmbedBuilder lightningCharactersEmbed = new EmbedBuilder()
                .setTitle("Lightning Characters")
                .setColor(lightning)
                .addField("Name", """
                    Bailu
                    Jing Yuan
                    Kafka (Upcoming)
                    Arlan
                    Serval
                    Tingyun
                    """, true)
                .addField("Path", """
                    The Abundance
                    The Erudition
                    The Nihility
                    The Destruction
                    The Erudition
                    The Harmony
                    """, true)
                .addField("Rarity", """
                    ✦✦✦✦✦
                    ✦✦✦✦✦
                    ✦✦✦✦✦
                    ✦✦✦✦
                    ✦✦✦✦
                    ✦✦✦✦
                    """, true);
        event.replyEmbeds(lightningCharactersEmbed.build()).queue();
    }

    protected void windCharacters(SlashCommandInteractionEvent event) {
        Color wind = new Color(66, 195, 140);
        EmbedBuilder windCharactersEmbed = new EmbedBuilder()
                .setTitle("Wind Characters")
                .setColor(wind)
                .addField("Name", """
                    Blade (Upcoming)
                    Bronya
                    Dan Heng
                    Sampo
                    """, true)
                .addField("Path", """
                    The Destruction
                    The Harmony
                    The Hunt
                    The Nihility
                    """, true)
                .addField("Rarity", """
                    ✦✦✦✦✦
                    ✦✦✦✦✦
                    ✦✦✦✦
                    ✦✦✦✦
                    """, true);
        event.replyEmbeds(windCharactersEmbed.build()).queue();
    }

    protected void quantumCharacters(SlashCommandInteractionEvent event) {
        Color quantum = new Color(31, 28, 74);
        EmbedBuilder quantumCharactersEmbed = new EmbedBuilder()
                .setTitle("Quantum Characters")
                .setColor(quantum)
                .addField("Name", """
                    Seele
                    Silver Wolf (Upcoming)
                    Qingque
                    """, true)
                .addField("Path", """
                    The Hunt
                    The Nihility
                    The Erudition
                    """, true)
                .addField("Rarity", """
                    ✦✦✦✦✦
                    ✦✦✦✦✦
                    ✦✦✦✦
                    """, true);
        event.replyEmbeds(quantumCharactersEmbed.build()).queue();
    }

    protected void imaginaryCharacters(SlashCommandInteractionEvent event) {
        Color imaginary = new Color(229, 185, 9);
        EmbedBuilder imaginaryCharactersEmbed = new EmbedBuilder()
                .setTitle("Imaginary Characters")
                .setColor(imaginary)
                .addField("Name", """
                    Luocha (Upcoming)
                    Welt
                    Yukong (Upcoming)
                    """, true)
                .addField("Path", """
                    The Abundance
                    The Nihility
                    The Harmony
                    """, true)
                .addField("Rarity", """
                    ✦✦✦✦✦
                    ✦✦✦✦✦
                    ✦✦✦✦
                    """, true);
        event.replyEmbeds(imaginaryCharactersEmbed.build()).queue();
    }


}
