package org.bot.discord.peppy.characters;

import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;

public class GetCharacterInfo implements Characters {

    public void seele(SlashCommandInteractionEvent event) {
        Seele seele = new Seele();
        seele.seeleInfo(event);
    }

    public void getSeeleBuild(ButtonInteractionEvent event) {
        Seele seele = new Seele();
        seele.seeleBuild(event);
    }

    public void getSeeleAscension(ButtonInteractionEvent event) {
        Seele seele = new Seele();
        seele.seeleAscension(event);
    }

    public void getSeeleTeam(ButtonInteractionEvent event) {
        Seele seele = new Seele();
        seele.seeleTeam(event);
    }

    public void bailu(SlashCommandInteractionEvent event) {
        Bailu bailu = new Bailu();
        bailu.bailuInfo(event);
    }

    public void getBailuBuild(ButtonInteractionEvent event) {
        Bailu bailu = new Bailu();
        bailu.bailuBuild(event);
    }

    public void getBailuAscension(ButtonInteractionEvent event) {
        Bailu bailu = new Bailu();
        bailu.bailuAscension(event);
    }

    public void getBailuTeam(ButtonInteractionEvent event) {
        Bailu bailu = new Bailu();
        bailu.bailuTeam(event);
    }

    public void jingyuan(SlashCommandInteractionEvent event) {
        JingYuan jingyuan = new JingYuan();
        jingyuan.jingyuanInfo(event);
    }

    public void getJingYuanBuild(ButtonInteractionEvent event) {
        JingYuan jingyuan = new JingYuan();
        jingyuan.jingyuanBuild(event);
    }

    public void getJingYuanAscension(ButtonInteractionEvent event) {
        JingYuan jingyuan = new JingYuan();
        jingyuan.jingyuanAscension(event);
    }

    public void getJingYuanTeam(ButtonInteractionEvent event) {
        JingYuan jingyuan = new JingYuan();
        jingyuan.jingyuanTeam(event);
    }

}
