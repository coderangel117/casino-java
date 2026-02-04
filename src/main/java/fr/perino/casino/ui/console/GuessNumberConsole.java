package fr.perino.casino.ui.console;

import fr.perino.casino.service.GuessNumberService;
import fr.perino.casino.util.Translator.Translator;

public class GuessNumberConsole {
    private static String gameName;
    private static Translator translator = new Translator("fr");

    public static void start() {
        System.out.println(translator.get("run.game") + " " + translator.get("game.guess"));

    }

}
