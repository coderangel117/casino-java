package fr.perino.casino;


import fr.perino.casino.ui.console.menu.MainMenu;
import fr.perino.casino.util.Translator.Translator;

public class Main {
    static void main() {
        Translator translator = new Translator("fr");
        new MainMenu(translator).display();
    }
}