package com.github.controller;

import java.util.Scanner;

public class Input {

    private String commandName = "";
    private Scanner scan = new Scanner(System.in);

    public String getInputName() {
        return commandName;
    }

    public void setInputName(String commandName) {
        this.commandName = commandName;
    }

    public String nextUserComand() {
        return this.commandName = scan.nextLine();
    }
}
