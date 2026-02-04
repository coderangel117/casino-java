package fr.perino.casino.ui.console.menu;

import fr.perino.casino.ui.console.GuessNumberConsole;
import fr.perino.casino.util.Translator.Translator;

import java.util.Scanner;

public class GameMenu {
    private Translator translator;
    Scanner scanner;
    public GameMenu(Translator translator){
        this.translator = translator;
        this.scanner = new Scanner(System.in);

    }
    public void display(){
        while (true) {
            System.out.println(translator.get("game.title"));
            System.out.println("1. " + translator.get("game.guess"));
            System.out.println("2. " + translator.get("game.tictactoe"));
            System.out.println("3. " + translator.get("game.return"));
            System.out.print(translator.get("choice"));
            int choice = scanner.nextInt();
            if (choice == 1) {
                new GuessNumberConsole(translator).run();
            } else if (choice == 2) {
//                new GameConsole("Morpion").run();
            } else if (choice == 3) {
                new MainMenu(translator).display();
                break;
            }
        }
    }
}