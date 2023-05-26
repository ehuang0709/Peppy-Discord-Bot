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

    public void qingque(SlashCommandInteractionEvent event) {
        Qingque qingque = new Qingque();
        qingque.qingqueInfo(event);
    }

    public void getQingqueBuild(ButtonInteractionEvent event) {
        Qingque qingque = new Qingque();
        qingque.qingqueBuild(event);
    }

    public void getQingqueAscension(ButtonInteractionEvent event) {
        Qingque qingque = new Qingque();
        qingque.qingqueAscension(event);
    }

    public void getQingqueTeam(ButtonInteractionEvent event) {
        Qingque qingque = new Qingque();
        qingque.qingqueTeam(event);
    }

    public void tingyun(SlashCommandInteractionEvent event) {
        Tingyun tingyun = new Tingyun();
        tingyun.tingyunInfo(event);
    }

    public void getTingyunBuild(ButtonInteractionEvent event) {
        Tingyun tingyun = new Tingyun();
        tingyun.tingyunBuild(event);
    }

    public void getTingyunAscension(ButtonInteractionEvent event) {
        Tingyun tingyun = new Tingyun();
        tingyun.tingyunAscension(event);
    }

    public void getTingyunTeam(ButtonInteractionEvent event) {
        Tingyun tingyun = new Tingyun();
        tingyun.tingyunTeam(event);
    }

    public void serval(SlashCommandInteractionEvent event) {
        Serval serval = new Serval();
        serval.servalInfo(event);
    }

    public void getServalBuild(ButtonInteractionEvent event) {
        Serval serval = new Serval();
        serval.servalBuild(event);
    }

    public void getServalAscension(ButtonInteractionEvent event) {
        Serval serval = new Serval();
        serval.servalAscension(event);
    }

    public void getServalTeam(ButtonInteractionEvent event) {
        Serval serval = new Serval();
        serval.servalTeam(event);
    }

    public void arlan(SlashCommandInteractionEvent event) {
        Arlan arlan = new Arlan();
        arlan.arlanInfo(event);
    }

    public void getArlanBuild(ButtonInteractionEvent event) {
        Arlan arlan = new Arlan();
        arlan.arlanBuild(event);
    }

    public void getArlanAscension(ButtonInteractionEvent event) {
        Arlan arlan = new Arlan();
        arlan.arlanAscension(event);
    }

    public void getArlanTeam(ButtonInteractionEvent event) {
        Arlan arlan = new Arlan();
        arlan.arlanTeam(event);
    }

}
