package com.github.storage;

import java.util.HashMap;
import java.util.Map;

import com.github.controller.*;
import com.github.controller.editCommands.*;

public class EditCommandsHolder {
	private static Map<String, Command> command2Action = new HashMap<String, Command>();

	Command editCmd = new EditCommand();
	Command editNameCmd = new EditNameCommand();
	Command editMaterCmd = new EditMaterialCommand();
	Command printCmd = new PrintCommand();
	Command returnCmd = new ReturnCommand();
	Command exitCmd = new ExitCommand();

	public EditCommandsHolder() {
		command2Action.put("edit", editCmd);
		command2Action.put("name", editNameCmd);
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
