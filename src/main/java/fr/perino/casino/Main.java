package fr.perino.casino;


import fr.perino.casino.service.GameService;
import fr.perino.casino.ui.console.MainMenu;
import fr.perino.casino.ui.lanterna.MenuLanterna;

public class Main {
    static void main() {
        GameService GameService = new GameService();
        boolean useLanterna = false;

        if (useLanterna) {
            new MenuLanterna(GameService).display();
        } else {
            new MainMenu(GameService).display();
        }
    }
}