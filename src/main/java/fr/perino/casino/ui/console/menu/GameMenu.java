package fr.perino.casino.ui.console.menu;

import fr.perino.casino.service.GuessNumberService;
import fr.perino.casino.ui.console.GuessNumberConsole;
import fr.perino.casino.util.Translator.Translator;

import java.util.Scanner;

public class GameMenu {
    private Translator translator = new Translator("en");

    public void display(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(translator.get("game.title"));
            System.out.println(translator.get("game.guess"));
            System.out.println(translator.get("game.tictactoe"));
            System.out.println(translator.get("game.return"));
            System.out.print("Choix : ");
            int choix = scanner.nextInt();
            if (choix == 1) {
                GuessNumberConsole.start();
            } else if (choix == 2) {
//                new GameConsole("Morpion").start();
            } else if (choix == 3) {
                new MainMenu().display();
                break;
            }
        }
    }
}