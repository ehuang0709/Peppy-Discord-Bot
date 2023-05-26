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

public class Qingque extends ListenerAdapter {

    private final String qingqueThumbnailPath = Paths.get("src/main/resources/qingque/qingque.png").toString();
    private final File qingqueThumbnail = new File(qingqueThumbnailPath);
    private final String qingqueBuildPath = Paths.get("src/main/resources/qingque/qingquebuild.png").toString();
    private final File qingqueBuild = new File(qingqueBuildPath);
    private final String quantumLogoPath = Paths.get("src/main/resources/element/quantum.webp").toString();
    private final File quantumLogo = new File(quantumLogoPath);
    private final String qingqueTeamPath = Paths.get("src/main/resources/qingque/qingqueteam.png").toString();
    private final File qingqueTeam = new File(qingqueTeamPath);
    private final Color qingqueColor = new Color(125,189,165);

    protected void qingqueInfo(@NotNull SlashCommandInteractionEvent event) {
        EmbedBuilder qingqueInfoEmbed = new EmbedBuilder()
                .setTitle("QINGQUE  ·  ✦✦✦✦")
                .setColor(qingqueColor)
                .setThumbnail("attachment://quantum.webp")
                .addField("The Erudition", """
                        Sub DPS
                        Quantum
                        """, true)
                .setImage("attachment://qingquebuild.png")
                ;

        ActionRow actionRow = new ButtonListeners().createButtons();

        event.replyEmbeds(qingqueInfoEmbed.build())
                .setActionRow(actionRow.getComponents())
                .addFiles(FileUpload.fromData(qingqueBuild, "qingquebuild.png"), FileUpload.fromData(quantumLogo, "quantum.webp"))
                .queue();
    }


    protected void qingqueBuild(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder qingqueBuildEmbed = new EmbedBuilder()
                .setTitle("QINGQUE BUILDS")
                .setColor(qingqueColor)
                .setThumbnail("attachment://qingque.png")
                .addField("The Erudition", """
                        Sub DPS
                        Quantum
                        """, false)
                .addField("__**LIGHT CONES**__", """
                        **1.** Before Dawn
                        **2.** Today is Another Peaceful Day
                        **3.** Night on the Milky Way
                        **4.** The Seriousness of Breakfast
                        **5.** Geniuses' Repose
                        """, false)
                .addField("__**RELICS**__", """
                        **1.** Genius of Brillant Stars (4)
                        **2.** Genius of Brillant Stars (2) + Musketeer of Wild Wheat (2)
                        
                        **1.** Space Sealing Station (2)
                        """, false)
                .addField("__**MAIN STATS**__", """
                        **HEAD:** HP
                        **HAND:** ATK
                        **BODY:** Crit Rate
                        **FEET:** Speed
                        **PLANAR SPHERE:** Quantum DMG
                        **LINK ROPE:** ATK%
                        """, true)
                .addField("__**SUB STATS**__", """
                        **1.** Crit Rate / Crit DMG
                        **2.** ATK%
                        **3.** Speed
                        """, true)
                .addField("__**TRACES**__", """
                        **1.** Ultimate
                        **2.** Skill
                        **3.** Talent
                        **4.** Basic
                        """, false)
                .setFooter("For more information, please visit: https://tinyurl.com/starrailbuild")
                ;

        event.editMessageEmbeds(qingqueBuildEmbed.build())
                .setFiles(FileUpload.fromData(qingqueThumbnail, "qingque.png"))
                .queue();
    }

    protected void qingqueAscension(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder qingqueAscensionEmbed = new EmbedBuilder()
                .setTitle("QINGQUE ASCENSION MATERIALS")
                .setColor(qingqueColor)
                .setThumbnail("attachment://qingque.png")
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
                        3,200
                        
                        6,400
                        
                        12,800
                        
                        32,000
                        
                        64,000
                        
                        128,000
                        

                        **246,400**
                        """, true)
                .addField("Materials", """
                        Thief's Instinct x4
                        -
                        Thief's Instinct x8
                        -
                        Usurper's Scheme x5
                        Void Cast Iron x2
                        Usurper's Scheme x8
                        Void Cast Iron x5
                        Conqueror's Will x5
                        Void Cast Iron x15
                        Conqueror's Will x7
                        Void Cast Iron x28
                        
                        ** • Thief's Instinct x12
                           • Usurper's Scheme x13
                           • Conqueror's Will x12
                           • Void Cast Iron x50 **
                        """, true)
                ;

        event.editMessageEmbeds(qingqueAscensionEmbed.build())
                .setFiles(FileUpload.fromData(qingqueThumbnail, "qingque.png"))
                .queue();
    }

    protected void qingqueTeam(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder qingqueTeamEmbed = new EmbedBuilder()
                .setImage("attachment://qingqueteam.png")
                .setColor(qingqueColor)
                .setFooter("For more information, please visit: https://genshinlab.com/honkai-star-rail-team/qingque-team-guide/")
                ;

        event.editMessageEmbeds(qingqueTeamEmbed.build())
                .setFiles(FileUpload.fromData(qingqueTeam, "qingqueteam.png"))
                .queue();

    }
}
