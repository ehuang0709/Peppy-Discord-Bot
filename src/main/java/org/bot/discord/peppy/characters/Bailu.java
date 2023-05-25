package org.bot.discord.peppy.characters;

import net.dv8tion.jda.api.EmbedBuilder;
import net.dv8tion.jda.api.events.interaction.command.SlashCommandInteractionEvent;
import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.utils.FileUpload;
import org.jetbrains.annotations.NotNull;

import java.awt.*;
import java.io.File;
import java.nio.file.Paths;

public class Bailu extends ListenerAdapter {
    private final String bailuThumbnailPath = Paths.get("src/main/resources/bailu/bailu.png").toString();
    private final File bailuThumbnail = new File(bailuThumbnailPath);
    private final String bailuBuildPath = Paths.get("src/main/resources/bailu/bailubuild.png").toString();
    private final File bailuBuild = new File(bailuBuildPath);
    private final String lightningLogoPath = Paths.get("src/main/resources/element/lightning.png").toString();
    private final File lightningLogo = new File(lightningLogoPath);
    private final String bailuTeamPath = Paths.get("src/main/resources/bailu/bailuteam.png").toString();
    private final File bailuTeam = new File(bailuTeamPath);
    private final Color bailuColor = new Color(225, 216, 241);

    protected void bailuInfo(@NotNull SlashCommandInteractionEvent event) {
        EmbedBuilder bailuInfoEmbed = new EmbedBuilder()
                .setTitle("BAILU  ·  ✦✦✦✦✦")
                .setColor(bailuColor)
                .setThumbnail("attachment://lightning.png")
                .addField("The Abundance", """
                        AOE Healer
                        Lightning
                        """, true)
                .setImage("attachment://bailubuild.png")
                ;

        ActionRow actionRow = new ButtonListeners().createButtons();

        event.replyEmbeds(bailuInfoEmbed.build())
                .setActionRow(actionRow.getComponents())
                .addFiles(FileUpload.fromData(bailuBuild, "bailubuild.png"), FileUpload.fromData(lightningLogo, "lightning.png"))
                .queue();
    }


    protected void bailuBuild(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder bailuBuildEmbed = new EmbedBuilder()
                .setTitle("BAILU BUILDS")
                .setColor(bailuColor)
                .setThumbnail("attachment://bailu.png")
                .addField("The Abundance", """
                        AOE Healer
                        Lightning
                        """, false)
                .addField("__**LIGHT CONES**__", """
                        **1.** Time Waits for No One
                        **2.** Post-Op Conversation
                        **3.** Warmth Shortens Cold Nights
                        **4.** Shared Feeling
                        **5.** Cornucopia
                        """, false)
                .addField("__**RELICS**__", """
                        **1.** Passerby of Wandering Cloud (4)
                        **2.** Musketeer of Wild Wheat (4)
                        
                        **1.** Fleet of the Ageless (2)
                        **2.** Sprightly Vonwacq (2)
                        """, false)
                .addField("__**MAIN STATS**__", """
                        **HEAD:** HP
                        **HAND:** ATK
                        **BODY:** Outgoing Healing Boost
                        **FEET:** Speed/HP%
                        **PLANAR SPHERE:** HP%
                        **LINK ROPE:** HP%
                        """, true)
                .addField("__**SUB STATS**__", """
                        **1.** Speed
                        **2.** HP%
                        **3.** DEF%
                        """, true)
                .addField("__**TRACES**__", """
                        **1.** Ultimate
                        **2.** Skill
                        **3.** Talent
                        **4.** Basic
                        """, false)
                .setFooter("For more information, please visit: https://tinyurl.com/starrailbuild")
                ;

        event.editMessageEmbeds(bailuBuildEmbed.build())
                .setFiles(FileUpload.fromData(bailuThumbnail, "bailu.png"))
                .queue();
    }

    protected void bailuAscension(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder bailuAscensionEmbed = new EmbedBuilder()
                .setTitle("BAILU ASCENSION MATERIALS")
                .setColor(bailuColor)
                .setThumbnail("attachment://bailu.png")
                .addField("Level", """
                        20
                        
                        30
                        
                        40
                        
                        50
                        
                        60
                        
                        70
                        
                        
                        **Total**
                        """, true)
                .addField("Credit", """
                        4,000
                        
                        8,000
                        
                        16,000
                        
                        40,000
                        
                        80,000
                        
                        160,000
                        

                        **308,000**
                        """, true)
                .addField("Materials", """
                        Extinguished Core x5
                        -
                        Extinguished Core x10
                        -
                        Glimmering Core x6
                        Lightning Crown of the Past Shadow x3
                        Glimmering Core x9
                        Lightning Crown of the Past Shadow x7
                        Squirming Core x6
                        Lightning Crown of the Past Shadow x20
                        Squirming Core x9
                        Lightning Crown of the Past Shadow x35
                        
                        ** • Extinguished Core x15
                           • Glimmering Core x15
                           • Squirming Core x15
                           • Lightning Crown of the Past Shadow x65 **
                        """, true)
                ;

        event.editMessageEmbeds(bailuAscensionEmbed.build())
                .setFiles(FileUpload.fromData(bailuThumbnail, "bailu.png"))
                .queue();
    }

    protected void bailuTeam(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder bailuTeamEmbed = new EmbedBuilder()
                .setImage("attachment://bailuteam.png")
                .setColor(bailuColor)
                .setFooter("For more information, please visit: https://genshinlab.com/honkai-star-rail-team/bailu-team-guide/")
                ;

        event.editMessageEmbeds(bailuTeamEmbed.build())
                .setFiles(FileUpload.fromData(bailuTeam, "bailuteam.png"))
                .queue();

    }

}
