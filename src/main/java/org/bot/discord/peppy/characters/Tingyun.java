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

public class Tingyun extends ListenerAdapter {

    private final String tingyunThumbnailPath = Paths.get("src/main/resources/tingyun/tingyun.png").toString();
    private final File tingyunThumbnail = new File(tingyunThumbnailPath);
    private final String tingyunBuildPath = Paths.get("src/main/resources/tingyun/tingyunbuild.png").toString();
    private final File tingyunBuild = new File(tingyunBuildPath);
    private final String lightningLogoPath = Paths.get("src/main/resources/element/lightning.png").toString();
    private final File lightningLogo = new File(lightningLogoPath);
    private final String tingyunTeamPath = Paths.get("src/main/resources/tingyun/tingyunteam.png").toString();
    private final File tingyunTeam = new File(tingyunTeamPath);
    private final Color tingyunColor = new Color(129,22,26);

    protected void tingyunInfo(@NotNull SlashCommandInteractionEvent event) {
        EmbedBuilder tingyunInfoEmbed = new EmbedBuilder()
                .setTitle("TINGYUN  ·  ✦✦✦✦")
                .setColor(tingyunColor)
                .setThumbnail("attachment://lightning.png")
                .addField("The Harmony", """
                        Single-Target Buffer
                        Lightning
                        """, true)
                .setImage("attachment://tingyunbuild.png")
                ;

        ActionRow actionRow = new ButtonListeners().createButtons();

        event.replyEmbeds(tingyunInfoEmbed.build())
                .setActionRow(actionRow.getComponents())
                .addFiles(FileUpload.fromData(tingyunBuild, "tingyunbuild.png"), FileUpload.fromData(lightningLogo, "lightning.png"))
                .queue();
    }


    protected void tingyunBuild(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder tingyunBuildEmbed = new EmbedBuilder()
                .setTitle("TINGYUN BUILDS")
                .setColor(tingyunColor)
                .setThumbnail("attachment://tingyun.png")
                .addField("The Harmony", """
                        Single-Target Buffer
                        Lightning
                        """, false)
                .addField("__**LIGHT CONES**__", """
                        **1.** But the Battle Isn't Over
                        **2.** Carve the Moon, Weave the Clouds
                        **3.** Memories of the Past [S5]
                        **4.** Dance! Dance! Dance!
                        **5.** Chorus [S5]
                        """, false)
                .addField("__**RELICS**__", """
                        **1.** Musketeer of Wild Wheat (4)
                        **2.** Musketeer of Wild Wheat (2) + Band of Sizzling Thunder (2)
                        
                        **1.** Space Sealing Station (2)
                        **2.** Sprightly Vonwacq (2)
                        """, false)
                .addField("__**MAIN STATS**__", """
                        **HEAD:** HP
                        **HAND:** ATK
                        **BODY:** ATK%
                        **FEET:** Speed/ATK%
                        **PLANAR SPHERE:** ATK%
                        **LINK ROPE:** Energy Regen Rate
                        """, true)
                .addField("__**SUB STATS**__", """
                        **1.** ATK%
                        **2.** Speed
                        **3.** Break Effect
                        """, true)
                .addField("__**TRACES**__", """
                        **1.** Ultimate
                        **2.** Skill
                        **3.** Talent
                        **4.** Basic
                        """, false)
                .setFooter("For more information, please visit: https://tinyurl.com/starrailbuild")
                ;

        event.editMessageEmbeds(tingyunBuildEmbed.build())
                .setFiles(FileUpload.fromData(tingyunThumbnail, "tingyun.png"))
                .queue();
    }

    protected void tingyunAscension(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder tingyunAscensionEmbed = new EmbedBuilder()
                .setTitle("TINGYUN ASCENSION MATERIALS")
                .setColor(tingyunColor)
                .setThumbnail("attachment://tingyun.png")
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
                        Immortal Scionette x4
                        -
                        Immortal Scionette x8
                        -
                        Immortal Aeroblossom x5
                        Lightning Crown of the Past Shadow x2
                        Immortal Aeroblossom x8
                        Lightning Crown of the Past Shadow x5
                        Immortal Lumintwig x5
                        Lightning Crown of the Past Shadow x15
                        Immortal Lumintwig x7
                        Lightning Crown of the Past Shadow x28
                        
                        ** • Immortal Scionette x12
                           • Immortal Aeroblossom x13
                           • Immortal Lumintwig x12
                           • Lightning Crown of the Past Shadow x50 **
                        """, true)
                ;

        event.editMessageEmbeds(tingyunAscensionEmbed.build())
                .setFiles(FileUpload.fromData(tingyunThumbnail, "tingyun.png"))
                .queue();
    }

    protected void tingyunTeam(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder tingyunTeamEmbed = new EmbedBuilder()
                .setImage("attachment://tingyunteam.png")
                .setColor(tingyunColor)
                .setFooter("For more information, please visit: https://genshinlab.com/honkai-star-rail-team/tingyun-team-guide/")
                ;

        event.editMessageEmbeds(tingyunTeamEmbed.build())
                .setFiles(FileUpload.fromData(tingyunTeam, "tingyunteam.png"))
                .queue();

    }
}
