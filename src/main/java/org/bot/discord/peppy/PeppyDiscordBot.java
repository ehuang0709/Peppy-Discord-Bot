package org.bot.discord.peppy;

import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Guild;
import net.dv8tion.jda.api.interactions.commands.OptionType;
import net.dv8tion.jda.api.interactions.commands.build.OptionData;
import org.bot.discord.peppy.commands.BotCommands;
import org.bot.discord.peppy.characters.ButtonListeners;

public class PeppyDiscordBot {

    public static void main(String[] args) throws InterruptedException {

        JDA bot = JDABuilder.createDefault("MTEwODgyOTgyOTg3NDMxOTM4MQ.GbZtzY.8p-aoBAoTh52EK3BbvQK0VtGFOKsjTrLHO2uHg")
                .setActivity(Activity.playing("Honkai: Star Rail"))
                .addEventListeners(new BotCommands(), new ButtonListeners())
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
            guild.upsertCommand("bailu", "Returns information on Bailu").queue();
            guild.upsertCommand("jing-yuan", "Returns information on Jing Yuan").queue();
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
