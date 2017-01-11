package com.github.storage;

import com.github.controller.*;

import java.util.HashMap;
import java.util.Map;

public class TypicalCommandsHolder {
	private static Map<String, Command> command2Action = new HashMap<String, Command>();

	Command printCmd = new PrintCommand();
	Command returnCmd = new ReturnCommand();
	Command exitCmd = new ExitCommand();

	public TypicalCommandsHolder() {
		command2Action.put("print", printCmd);
		command2Action.put("return", returnCmd);
		command2Action.put("exit", exitCmd);
	}

	public  Command get(String inputName) {
		Command command = command2Action.get(inputName);
		return command;
	}

	public  Map<String, Command> getAll() {
		return command2Action;
	}
}
