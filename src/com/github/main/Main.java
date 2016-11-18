package com.github.main;

import com.github.views.Menu;

public class Main {

    public static void main(String[] args) {

        Menu menu = new Menu();

        while (!menu.getCommand().getCommandName().equals("exit")) {
            menu.showMainMenu();
            menu.chooseFromMainMenu(menu.getCommand().nextUserCommand());
        }
    }
}


