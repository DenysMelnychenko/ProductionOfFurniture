package com.github.storage;

import java.util.Map;
import java.util.HashMap;
import com.github.controller.*;

public class CommandsHolder {

	private static Map<String, Map<String, Command>> command2Action = new HashMap<>();
	Map<String, Command> addAction = new AddCommandsHolder().getAll();
	Map<String, Command> editAction = new EditCommandsHolder().getAll();
	Map<String, Command> typicalCmd = new TypicalCommandsHolder().getAll();

	public CommandsHolder() {
		command2Action.put("add", addAction);
		command2Action.put("edit", editAction);
		command2Action.put("print", typicalCmd);
		command2Action.put("return", typicalCmd);
		command2Action.put("exit", typicalCmd);
	}

	public Command getCommand(String input, Map<String, Command> map) {
		Map<String, Command> newMap = map;
		Command cmd = newMap.get(input);
		return cmd;
	}

	public Map<String, Command> getAll(String inputName) {
		return command2Action.get(inputName);
	}

}
