package fr.perino.casino.ui.console.menu;

import fr.perino.casino.util.Translator.Translator;

import java.util.Scanner;

public class MainMenu {

    private Translator translator = new Translator("fr");

    public void display() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(translator.get("greetings.welcome"));
            System.out.println(translator.get("menu.play"));
            System.out.println(translator.get("menu.quit"));
            System.out.println(translator.get("choice"));
            int choix = scanner.nextInt();
            if (choix == 1) {
                new GameMenu().display();
                break;
            } else if (choix == 2) {
                System.out.println(translator.get("greetings.bye"));
                System.exit(0);
            }
        }
    }
}