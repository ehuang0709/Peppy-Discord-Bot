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

public class Serval extends ListenerAdapter {

    private final String servalThumbnailPath = Paths.get("src/main/resources/serval/serval.png").toString();
    private final File servalThumbnail = new File(servalThumbnailPath);
    private final String servalBuildPath = Paths.get("src/main/resources/serval/servalbuild.png").toString();
    private final File servalBuild = new File(servalBuildPath);
    private final String lightningLogoPath = Paths.get("src/main/resources/element/lightning.png").toString();
    private final File lightningLogo = new File(lightningLogoPath);
    private final String servalTeamPath = Paths.get("src/main/resources/serval/servalteam.png").toString();
    private final File servalTeam = new File(servalTeamPath);
    private final Color servalColor = new Color(48,59,149);

    protected void servalInfo(@NotNull SlashCommandInteractionEvent event) {
        EmbedBuilder servalInfoEmbed = new EmbedBuilder()
                .setTitle("SERVAL  ·  ✦✦✦✦")
                .setColor(servalColor)
                .setThumbnail("attachment://lightning.png")
                .addField("The Erudition", """
                        AOE DPS
                        Lightning
                        """, true)
                .setImage("attachment://servalbuild.png")
                ;

        ActionRow actionRow = new ButtonListeners().createButtons();

        event.replyEmbeds(servalInfoEmbed.build())
                .setActionRow(actionRow.getComponents())
                .addFiles(FileUpload.fromData(servalBuild, "servalbuild.png"), FileUpload.fromData(lightningLogo, "lightning.png"))
                .queue();
    }


    protected void servalBuild(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder servalBuildEmbed = new EmbedBuilder()
                .setTitle("SERVAL BUILDS")
                .setColor(servalColor)
                .setThumbnail("attachment://serval.png")
                .addField("The Erudition", """
                        AOE DPS
                        Lightning
                        """, false)
                .addField("__**LIGHT CONES**__", """
                        **1.** Before Dawn
                        **2.** Night on the Milky Way
                        **3.** The Seriousness of Breakfast
                        **4.** Today Is Another Peaceful Day
                        **5.** Make the World Clamor
                        """, false)
                .addField("__**RELICS**__", """
                        **1.** Band of Sizzling Thunder (4)
                        **2.** Band of Sizzling Thunder (4) + Musketeer of Wild Wheat (2)
                        
                        **1.** Inert Salsotto (2)
                        **2.** Space Sealing Station (2)
                        """, false)
                .addField("__**MAIN STATS**__", """
                        **HEAD:** HP
                        **HAND:** ATK
                        **BODY:** Crit Rate
                        **FEET:** Speed
                        **PLANAR SPHERE:** Lightning DMG
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

        event.editMessageEmbeds(servalBuildEmbed.build())
                .setFiles(FileUpload.fromData(servalThumbnail, "serval.png"))
                .queue();
    }

    protected void servalAscension(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder servalAscensionEmbed = new EmbedBuilder()
                .setTitle("SERVAL ASCENSION MATERIALS")
                .setColor(servalColor)
                .setThumbnail("attachment://serval.png")
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
                        Silvermane Badge x4
                        -
                        Silvermane Badge x8
                        -
                        Silvermane Insignia x5
                        Lightning Crown of the Past Shadow x2
                        Silvermane Insignia x8
                        Lightning Crown of the Past Shadow x5
                        Silvermane Medal x5
                        Lightning Crown of the Past Shadow x15
                        Silvermane Medal x7
                        Lightning Crown of the Past Shadow x28
                        
                        ** • Silvermane Badge x12
                           • Silvermane Insignia x13
                           • Silvermane Medal x12
                           • Lightning Crown of the Past Shadow x50 **
                        """, true)
                ;

        event.editMessageEmbeds(servalAscensionEmbed.build())
                .setFiles(FileUpload.fromData(servalThumbnail, "serval.png"))
                .queue();
    }

    protected void servalTeam(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder servalTeamEmbed = new EmbedBuilder()
                .setImage("attachment://servalteam.png")
                .setColor(servalColor)
                .setFooter("For more information, please visit: https://genshinlab.com/honkai-star-rail-team/serval-team-guide/")
                ;

        event.editMessageEmbeds(servalTeamEmbed.build())
                .setFiles(FileUpload.fromData(servalTeam, "servalteam.png"))
                .queue();

    }
}
