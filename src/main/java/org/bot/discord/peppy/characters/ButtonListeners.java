package org.bot.discord.peppy.characters;

import net.dv8tion.jda.api.events.interaction.component.ButtonInteractionEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import net.dv8tion.jda.api.interactions.components.ActionRow;
import net.dv8tion.jda.api.interactions.components.buttons.Button;
import org.jetbrains.annotations.NotNull;

public class ButtonListeners extends ListenerAdapter {
    private static String lastCommand;

    public static void setLastCommand(String command) {
        lastCommand = command;
    }

    public ActionRow createButtons() {
        Button buildButton = Button.primary("build-button", "BUILD");
        Button ascensionButton = Button.primary("ascension-button", "ASCENSION MATS");
        Button teamButton = Button.primary("team-button", "TEAM");

        return ActionRow.of(buildButton, ascensionButton, teamButton);
    }

    @Override
    public void onButtonInteraction(@NotNull ButtonInteractionEvent event) {
        Characters character = new GetCharacterInfo();
        String buttonType = event.getButton().getId();

        if (buttonType != null && lastCommand != null) {
            switch (buttonType) {
                case "build-button" -> getCharacterBuild(event, character);
                case "ascension-button" -> getCharacterAscension(event, character);
                case "team-button" -> getCharacterTeam(event, character);
            }
        }
    }

    private static void getCharacterBuild(@NotNull ButtonInteractionEvent event, Characters character) {
        switch (lastCommand) {
            case "seele" -> character.getSeeleBuild(event);
            case "bailu" -> character.getBailuBuild(event);
            case "jing-yuan" -> character.getJingYuanBuild(event);
        }
    }

    private static void getCharacterTeam(@NotNull ButtonInteractionEvent event, Characters character) {
        switch (lastCommand) {
            case "seele" -> character.getSeeleTeam(event);
            case "bailu" -> character.getBailuTeam(event);
            case "jing-yuan" -> character.getJingYuanTeam(event);
        }
    }

    private static void getCharacterAscension(@NotNull ButtonInteractionEvent event, Characters character) {
        switch (lastCommand) {
            case "seele" -> character.getSeeleAscension(event);
            case "bailu" -> character.getBailuAscension(event);
            case "jing-yuan" -> character.getJingYuanAscension(event);
        }
    }
}
