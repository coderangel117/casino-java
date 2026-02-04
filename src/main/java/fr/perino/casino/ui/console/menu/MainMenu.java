package fr.perino.casino.ui.console.menu;

import fr.perino.casino.util.Translator.Translator;

import java.util.Scanner;


public class MainMenu {
    final Scanner scanner;
    final Translator translator;
    public MainMenu(Translator translator){
        this.translator = translator;
        this.scanner = new Scanner(System.in);

    }
    public void display() {
        while (true) {
            System.out.println(translator.get("greetings.welcome"));
            System.out.println(translator.get("menu.play"));
            System.out.println(translator.get("menu.quit"));
            System.out.println(translator.get("choice"));
            int choix = scanner.nextInt();
            if (choix == 1) {
                new GameMenu(translator).display();
                break;
            } else if (choix == 2) {
                System.out.println(translator.get("greetings.bye"));
                System.exit(0);
            }
        }
    }
}