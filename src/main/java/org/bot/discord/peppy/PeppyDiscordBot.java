package org.bot.discord.peppy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.Command;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.Commands;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import net.dv8tion.jda.api.requests.restaction.CommandListUpdateAction;
import org.bot.discord.peppy.commands.BotCommands;

import javax.swing.text.html.Option;

public class PeppyDiscordBot {

    public static void main(String[] args) throws InterruptedException {

        JDA bot = JDABuilder.createDefault("MTEwODgyOTgyOTg3NDMxOTM4MQ.G0Kt4K.9V3UbeMn_vnNeRXkdPXyWtJcFNNW1qa6ysngd4")
                .setActivity(Activity.playing("Honkai: Star Rail!"))
                .addEventListeners(new BotCommands())
                .build().awaitReady();

        // Global Commands and Guild Commands
        // Global Commands - they can be used anywhere: any guild that your bot is in and also in DMs
        // Guild Commands - can only be used in a specific guild

        Guild guild = bot.getGuildById("1108829460242903110");

        // to switch it to global, replace guild with bot to do these commands on the bot directly

        if (guild != null) {
            guild.upsertCommand("characters", "List all characters by elements")
                    .addOptions(
                            new OptionData(OptionType.STRING, "element", "physical, fire, ice, lightning, wind, quantum, or imaginary", true)
                                    .addChoice("Physical", "physical")
                                    .addChoice("Fire", "fire")
                                    .addChoice("Ice", "ice")
                                    .addChoice("Lightning", "lightning")
                                    .addChoice("Wind", "wind")
                                    .addChoice("Quantum", "quantum")
                                    .addChoice("Imaginary", "imaginary")
                    )
                    .queue();
            guild.upsertCommand("seele", "Returns information on Seele").queue();
        }

//        CommandListUpdateAction commands = bot.updateCommands();
//
//        commands.addCommands(
//                Commands.slash("fart", "Fart really hard"),
//                Commands.slash("food", "Name your favorite food.")
//                        .addOption(OptionType.STRING, "name", "the name of your favorite food", true)
//        );
//
//        commands.queue();


    }

}
