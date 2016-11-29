package com.github.storage;

import com.github.controller.*;

import java.util.*;

public class CommandHolder {
    private static Map<String, Command> command2Action = new HashMap<String, Command>();

    Command addCmd = new AddCommand();
    Command editCmd = new EditCommand();
    Command printCmd = new PrintCommand();
    Command returnCmd = new PrintCommand();
    Command exitcmd = new ExitCommand();
    public CommandHolder() {
        command2Action.put("add", addCmd);
        command2Action.put("edit", editCmd);
        command2Action.put("print", printCmd);
        command2Action.put("return", returnCmd);
        command2Action.put("exit", exitcmd);
    }


    public Command get(String inputName) {
        Command command = command2Action.get(inputName);
        return command;
    }
}
