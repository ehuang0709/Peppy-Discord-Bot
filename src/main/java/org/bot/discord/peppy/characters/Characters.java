package org.bot.discord.peppy.characters;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;

public interface Characters {

    void seele(SlashCommandInteractionEvent event);

    void getSeeleBuild(ButtonInteractionEvent event);

    void getSeeleAscension(ButtonInteractionEvent event);

    void getSeeleTeam(ButtonInteractionEvent event);

    void bailu(SlashCommandInteractionEvent event);

    void getBailuBuild(ButtonInteractionEvent event);

    void getBailuAscension(ButtonInteractionEvent event);

    void getBailuTeam(ButtonInteractionEvent event);

    void jingyuan(SlashCommandInteractionEvent event);

    void getJingYuanBuild(ButtonInteractionEvent event);

    void getJingYuanAscension(ButtonInteractionEvent event);

    void getJingYuanTeam(ButtonInteractionEvent event);
}
