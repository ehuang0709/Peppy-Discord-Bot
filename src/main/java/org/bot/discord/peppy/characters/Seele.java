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

public class Seele extends ListenerAdapter {

    private final String seeleThumbnailPath = Paths.get("src/main/resources/seele/seele.png").toString();
    private final File seeleThumbnail = new File(seeleThumbnailPath);
    private final String seeleBuildPath = Paths.get("src/main/resources/seele/seelebuild.png").toString();
    private final File seeleBuild = new File(seeleBuildPath);
    private final String quantumLogoPath = Paths.get("src/main/resources/element/quantum.webp").toString();
    private final File quantumLogo = new File(quantumLogoPath);
    private final String seeleTeamPath = Paths.get("src/main/resources/seele/seeleteam.png").toString();
    private final File seeleTeam = new File(seeleTeamPath);
    private final Color seeleColor = new Color(60,52,101);

    protected void seeleInfo(@NotNull SlashCommandInteractionEvent event) {
        EmbedBuilder seeleInfoEmbed = new EmbedBuilder()
                .setTitle("SEELE  ·  ✦✦✦✦✦")
                .setColor(seeleColor)
                .setThumbnail("attachment://quantum.webp")
                .addField("The Hunt", """
                        Single/Multi Target Main DPS
                        Quantum
                        """, true)
                .setImage("attachment://seelebuild.png")
                ;

        ActionRow actionRow = new ButtonListeners().createButtons();

        // .getChannel().sendMessageEmbeds
        event.replyEmbeds(seeleInfoEmbed.build())
                .setActionRow(actionRow.getComponents())
                .addFiles(FileUpload.fromData(seeleBuild, "seelebuild.png"), FileUpload.fromData(quantumLogo, "quantum.webp"))
                .queue();
    }


    protected void seeleBuild(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder seeleBuildEmbed = new EmbedBuilder()
                .setTitle("SEELE BUILDS")
                .setColor(seeleColor)
                .setThumbnail("attachment://seele.png")
                .addField("The Hunt", """
                        Single/Multi Target Main DPS
                        Quantum
                        """, false)
                .addField("__**LIGHT CONES**__", """
                        **1.** In the Night
                        **2.** Sleep like the Dead
                        **3.** Cruising in the Stellar Sea
                        **4.** Swordplay
                        **5.** Only Silence Remains
                        """, false)
                .addField("__**RELICS**__", """
                        **1.** Genius of Brillant Stars (4)
                        **2.** Genius of Brillant Stars (2) + Musketeer of Wild Wheat (2)
                        
                        **1.** Inert Salsotto (2) / Space Sealing Station (2)
                        """, false)
                .addField("__**MAIN STATS**__", """
                        **HEAD:** HP
                        **HAND:** ATK
                        **BODY:** Crit Rate
                        **FEET:** ATK%
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

        event.editMessageEmbeds(seeleBuildEmbed.build())
                .setFiles(FileUpload.fromData(seeleThumbnail, "seele.png"))
                .queue();
    }

    protected void seeleAscension(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder seeleAscensionEmbed = new EmbedBuilder()
                .setTitle("SEELE ASCENSION MATERIALS")
                .setColor(seeleColor)
                .setThumbnail("attachment://seele.png")
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
                        Thief's Instinct x5
                        -
                        Thief's Instinct x10
                        -
                        Usurper's Scheme x6
                        Void Cast Iron x3
                        Usurper's Scheme x9
                        Void Cast Iron x7
                        Conqueror's Will x6
                        Void Cast Iron x20
                        Conqueror's Will x9
                        Void Cast Iron x35
                        
                        ** • Thief's Instinct x15
                           • Usurper's Scheme x15
                           • Conqueror's Will x15
                           • Void Cast Iron x65 **
                        """, true)
                ;

        event.editMessageEmbeds(seeleAscensionEmbed.build())
                .setFiles(FileUpload.fromData(seeleThumbnail, "seele.png"))
                .queue();
    }

    protected void seeleTeam(@NotNull ButtonInteractionEvent event) {
        EmbedBuilder seeleTeamEmbed = new EmbedBuilder()
                .setImage("attachment://seeleteam.png")
                .setColor(seeleColor)
                .setFooter("For more information, please visit: https://genshinlab.com/honkai-star-rail-team/seele-team-guide/")
                ;

        event.editMessageEmbeds(seeleTeamEmbed.build())
                .setFiles(FileUpload.fromData(seeleTeam, "seeleteam.png"))
                .queue();

    }

}
