package org.bot.discord.peppy.commands;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

import java.awt.*;
import java.io.File;

public class Seele {

    protected void seeleInfo(SlashCommandInteractionEvent event) {
        Color seeleColor = new Color(60,52,101);
        EmbedBuilder seeleInfoEmbed = new EmbedBuilder()
                .setTitle("SEELE")
//                .addBlankField(true)
                .setDescription("""
                        Quantum
                        The Hunt
                        """)
                .setColor(seeleColor)
                .setThumbnail("https://rerollcdn.com/STARRAIL/Characters/Full/1102.png")
                ;
        event.replyEmbeds(seeleInfoEmbed.build()).queue();
    }

}
