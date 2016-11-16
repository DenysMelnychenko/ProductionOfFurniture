package com.github.controller;

import java.util.Scanner;

/**
 * Created by aspir on 08.11.2016.
 */
public class Command {
    private String commandName = "";
    Scanner scan = new Scanner(System.in);

    public String getCommandName() {
        return commandName;
    }

    public void setCommandName(String commandName) {
        this.commandName = commandName;
    }



    public String nextUserCommand() {
        return this.commandName = scan.next();
    }
}
