package com.github.main;

import com.github.controller.*;
import com.github.storage.CommandHolder;
import com.github.views.Menu;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Input input = new Input();
        Menu menu = new Menu();
        CommandHolder commandHolder = new CommandHolder();


        while(!input.getInputName().equals("exit")){

            menu.showMainMenu();
            input.nextUserComand();

            Command cmd = commandHolder.get(input.getInputName());

            cmd.execute();

        }



    }

}


