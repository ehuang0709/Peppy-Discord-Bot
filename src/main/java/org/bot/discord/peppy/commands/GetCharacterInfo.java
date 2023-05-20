package org.bot.discord.peppy.commands;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;

public class GetCharacterInfo implements Characters {
    public void seele(SlashCommandInteractionEvent event) {
        Seele seele = new Seele();
        seele.seeleInfo(event);
    }

}
