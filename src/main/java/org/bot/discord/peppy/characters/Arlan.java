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

public class Arlan extends ListenerAdapter {

    private final String arlanThumbnailPath = Paths.get("src/main/resources/arlan/arlan.png").toString();
    private final File arlanThumbnail = new File(arlanThumbnailPath);
    private final String arlanBuildPath = Paths.get("src/main/resources/arlan/arlanbuild.png").toString();
    private final File arlanBuild = new File(arlanBuildPath);
    private final String lightningLogoPath = Paths.get("src/main/resources/element/lightning.png").toString();
    private final File lightningLogo = new File(lightningLogoPath);
    private final String arlanTeamPath = Paths.get("src/main/resources/arlan/arlanteam.png").toString();
    private final File arlanTeam = new File(arlanTeamPath);
    private final Color arlanColor = new Color(41,97,187);

    protected void arlanInfo(@NotNull SlashCommandInteractionEvent event) {
        EmbedBuilder arlanInfoEmbed = new EmbedBuilder()
                .setTitle("ARLAN  ·  ✦✦✦✦")
                .setColor(arlanColor)
                .setThumbnail("attachment://lightning.png")
                .addField("The Destruction", """
                        Single Target DPS
                        Lightning
                        """, true)
                .setImage("attachment://arlanbuild.png")
                ;

        ActionRow actionRow = new ButtonListeners().createButtons();

        // .getChannel().sendMessageEmbeds
        event.replyEmbeds(arlanInfoEmbed.build())
                .setActionRow(actionRow.getComponents())
                .addFiles(FileUpload.fromData(arlanBuild, "arlanbuild.png"), FileUpload.fromData(lightningLogo, "lightning.png"))
                .queue();
    }


    protected void arlanBuild(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder arlanBuildEmbed = new EmbedBuilder()
                .setTitle("ARLAN BUILDS")
                .setColor(arlanColor)
                .setThumbnail("attachment://arlan.png")
                .addField("The Destruction", """
                        Single Target DPS
                        Lightning
                        """, false)
                .addField("__**LIGHT CONES**__", """
                        **1.** Something Irreplacable
                        **2.** On the Fall of an Aeon
                        **3.** Nowhere to Run
                        **4.** A Secret Vow
                        **5.** The Moles Welcome You
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

        event.editMessageEmbeds(arlanBuildEmbed.build())
                .setFiles(FileUpload.fromData(arlanThumbnail, "arlan.png"))
                .queue();
    }

    protected void arlanAscension(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder arlanAscensionEmbed = new EmbedBuilder()
                .setTitle("ARLAN ASCENSION MATERIALS")
                .setColor(arlanColor)
                .setThumbnail("attachment://arlan.png")
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
                        Extinguished Core x4
                        -
                        Extinguished Core x8
                        -
                        Glimmering Core x5
                        Lightning Crown of the Past Shadow x2
                        Glimmering Core x8
                        Lightning Crown of the Past Shadow x5
                        Squirming Core x5
                        Lightning Crown of the Past Shadow x15
                        Squirming Core x7
                        Lightning Crown of the Past Shadow x28
                        
                        ** • Extinguished Core x12
                           • Glimmering Core x13
                           • Squirming Core x12
                           • Lightning Crown of the Past Shadow x50 **
                        """, true)
                ;

        event.editMessageEmbeds(arlanAscensionEmbed.build())
                .setFiles(FileUpload.fromData(arlanThumbnail, "arlan.png"))
                .queue();
    }

    protected void arlanTeam(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder arlanTeamEmbed = new EmbedBuilder()
                .setImage("attachment://arlanteam.png")
                .setColor(arlanColor)
                .setFooter("For more information, please visit: https://genshinlab.com/honkai-star-rail-team/arlan-team-guide/")
                ;

        event.editMessageEmbeds(arlanTeamEmbed.build())
                .setFiles(FileUpload.fromData(arlanTeam, "arlanteam.png"))
                .queue();

    }
}
