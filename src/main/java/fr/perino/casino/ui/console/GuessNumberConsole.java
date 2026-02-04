package fr.perino.casino.ui.console;

import fr.perino.casino.service.GuessNumberService;
import fr.perino.casino.util.Translator.Translator;

import java.util.Scanner;

public class GuessNumberConsole {
    private String gameName = "Guess the number";
    private Translator translator;
    Scanner scanner;
    GuessNumberService service = new GuessNumberService();

    public GuessNumberConsole(Translator translator) {
        this.translator = translator;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        System.out.println(translator.get("run.game") + " " + gameName);
        System.out.println(translator.get("game.guess.question"));
        while (true) {
            int trial = scanner.nextInt();
            if(service.verifyNumber(trial)){
                System.out.println("Congrats!");
                break;
            }
            System.out.println(service.giveHint(trial));
        }
    }
}
