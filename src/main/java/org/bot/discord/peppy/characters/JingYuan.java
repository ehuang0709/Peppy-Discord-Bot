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

public class JingYuan extends ListenerAdapter {

    private final String jingyuanThumbnailPath = Paths.get("src/main/resources/jingyuan/jingyuan.png").toString();
    private final File jingyuanThumbnail = new File(jingyuanThumbnailPath);
    private final String jingyuanBuildPath = Paths.get("src/main/resources/jingyuan/jingyuanbuild.png").toString();
    private final File jingyuanBuild = new File(jingyuanBuildPath);
    private final String lightningLogoPath = Paths.get("src/main/resources/element/lightning.png").toString();
    private final File lightningLogo = new File(lightningLogoPath);
    private final String jingyuanTeamPath = Paths.get("src/main/resources/jingyuan/jingyuanteam.png").toString();
    private final File jingyuanTeam = new File(jingyuanTeamPath);
    private final Color jingyuanColor = new Color(94, 94, 94);

    protected void jingyuanInfo(@NotNull SlashCommandInteractionEvent event) {
        EmbedBuilder jingyuanInfoEmbed = new EmbedBuilder()
                .setTitle("JING YUAN  ·  ✦✦✦✦✦")
                .setColor(jingyuanColor)
                .setThumbnail("attachment://lightning.png")
                .addField("The Erudition", """
                        AOE DPS
                        Lightning
                        """, true)
                .setImage("attachment://jingyuanbuild.png")
                ;

        ActionRow actionRow = new ButtonListeners().createButtons();

        // .getChannel().sendMessageEmbeds
        event.replyEmbeds(jingyuanInfoEmbed.build())
                .setActionRow(actionRow.getComponents())
                .addFiles(FileUpload.fromData(jingyuanBuild, "jingyuanbuild.png"), FileUpload.fromData(lightningLogo, "lightning.png"))
                .queue();
    }


    protected void jingyuanBuild(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder jingyuanBuildEmbed = new EmbedBuilder()
                .setTitle("JING YUAN BUILDS")
                .setColor(jingyuanColor)
                .setThumbnail("attachment://jingyuan.png")
                .addField("The Erudition", """
                        AOE DPS
                        Lightning
                        """, false)
                .addField("__**LIGHT CONES**__", """
                        **1.** Before Dawn
                        **2.** Today Is Another Peaceful Day
                        **3.** Night on the Milky Way
                        **4.** The Birth of the Self
                        **5.** The Seriousness of Breakfast
                        """, false)
                .addField("__**RELICS**__", """
                        **1.** Band of Sizzling Thunder (4)
                        **2.** Band of Sizzling Thunder (2) + Musketeer of Wild Wheat (2)
                        
                        **1.** Inert Salsotto (2)
                        **2.** Space Sealing Station (2)
                        """, false)
                .addField("__**MAIN STATS**__", """
                        **HEAD:** HP
                        **HAND:** ATK
                        **BODY:** Crit Rate
                        **FEET:** Speed/ATK%
                        **PLANAR SPHERE:** Lightning DMG
                        **LINK ROPE:** ATK%
                        """, true)
                .addField("__**SUB STATS**__", """
                        **1.** Crit Rate / Crit DMG
                        **2.** ATK%
                        **3.** Speed
                        """, true)
                .addField("__**TRACES**__", """
                        **1.** Talent
                        **2.** Ultimate
                        **3.** Skill
                        **4.** Basic
                        """, false)
                .setFooter("For more information, please visit: https://tinyurl.com/starrailbuild")
                ;

        event.editMessageEmbeds(jingyuanBuildEmbed.build())
                .setFiles(FileUpload.fromData(jingyuanThumbnail, "jingyuan.png"))
                .queue();
    }

    protected void jingyuanAscension(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder jingyuanAscensionEmbed = new EmbedBuilder()
                .setTitle("JING YUAN ASCENSION MATERIALS")
                .setColor(jingyuanColor)
                .setThumbnail("attachment://jingyuan.png")
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
                        Immortal Scionette x5
                        -
                        Immortal Scionette x10
                        -
                        Immortal Aeroblossom x6
                        Shape Shifter’s Lightning Staff x3
                        Immortal Aeroblossom x9
                        Shape Shifter’s Lightning Staff x7
                        Immortal Lumintwig x6
                        Shape Shifter’s Lightning Staff x20
                        Immortal Lumintwig x9
                        Shape Shifter’s Lightning Staff x35
                        
                        ** • Immortal Scionette x15
                           • Immortal Aeroblossom x15
                           • Immortal Lumintwig x15
                           • Shape Shifter’s Lightning Staff x65 **
                        """, true)
                ;

        event.editMessageEmbeds(jingyuanAscensionEmbed.build())
                .setFiles(FileUpload.fromData(jingyuanThumbnail, "jingyuan.png"))
                .queue();
    }

    protected void jingyuanTeam(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder jingyuanTeamEmbed = new EmbedBuilder()
                .setImage("attachment://jingyuanteam.png")
                .setColor(jingyuanColor)
                .setFooter("For more information, please visit: https://genshinlab.com/honkai-star-rail-team/jingyuan-team-guide/")
                ;

        event.editMessageEmbeds(jingyuanTeamEmbed.build())
                .setFiles(FileUpload.fromData(jingyuanTeam, "jingyuanteam.png"))
                .queue();

    }

}
