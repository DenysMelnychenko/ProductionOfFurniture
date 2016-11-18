package com.github.controller;

import java.util.Scanner;

public class Command {

    private String commandName = "";
    private Scanner scan = new Scanner(System.in);

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }

    public String nextUserCommand() {
        return this.commandName = scan.nextLine();
    }
}
