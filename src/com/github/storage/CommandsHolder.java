package com.github.storage;

import java.util.Map;
import java.util.HashMap;
import com.github.controller.*;
import com.github.views.Menu;

public class CommandsHolder {

	private static Map<String, Map<String, Command>> command2Action = new HashMap<>();
	AddCommandsHolder addCmdHolder = new AddCommandsHolder();
	Map<String, Command> addAction = addCmdHolder.getAll();
	EditCommandsHolder editCmdHolder = new EditCommandsHolder();
	Map<String, Command> editAction = editCmdHolder.getAll();
	TypicalCommandsHolder typicalCmdHolder = new TypicalCommandsHolder();
	Map<String, Command> typicalCmd = typicalCmdHolder.getAll();

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

	public String showMenu(Map<String, Command> map) {
		if (map.entrySet().equals(addAction.entrySet())) {
			Menu.showAddMenu();
			return "";
		} else if (map.entrySet().equals(editAction.entrySet())) {
			Menu.showEditMenu();
		return "";
		}
		  else {return "typical";
		  } 
	}
}
