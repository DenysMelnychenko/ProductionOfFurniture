package com.github.storage;

import java.util.HashMap;
import java.util.Map;

import com.github.controller.Command;
import com.github.controller.ExitCommand;
import com.github.controller.PrintCommand;
import com.github.controller.ReturnCommand;
import com.github.controller.addCommands.*;

public class AddCommandsHolder {

	private static Map<String, Command> command2Action = new HashMap<String, Command>();

	Command addChairCmd = new AddChairCommand();
	Command addTableCmd = new AddTableCommand();
	Command addWardrobeCmd = new AddWardrobeCommand();
	Command printCmd = new PrintCommand();
	Command returnCmd = new ReturnCommand();
	Command exitCmd = new ExitCommand();

	public AddCommandsHolder() {
		command2Action.put("table", addTableCmd);
		command2Action.put("chair", addChairCmd);
		command2Action.put("wardrobe", addWardrobeCmd);
		command2Action.put("print", printCmd);
		command2Action.put("return", returnCmd);
		command2Action.put("exit", exitCmd);
	}

	public Command get(String inputName) {
		Command command = command2Action.get(inputName);
		return command;
	}

	public Map<String, Command> getAll() {
		return command2Action;
	}

}
