package com.github.storage;

import com.github.controller.editCommands.*;
import com.github.controller.addCommands.*;
import com.github.controller.PrintCommand;
import com.github.controller.*;

import java.util.HashMap;
import java.util.Map;

public class CommandHolder {
	private static Map<String, Command> command2Action = new HashMap<String, Command>();

	Command addCmd = new AddCommand();
	Command addChairCmd = new AddChairCommand();
	Command addTableCmd = new AddTableCommand();
	Command addWardrobeCmd = new AddWardrobeCommand();
	
	Command editCmd = new EditCommand();
	Command editNameCmd = new EditNameCommand();
	
	Command printCmd = new PrintCommand();
	Command returnCmd = new ReturnCommand();
	Command exitCmd = new ExitCommand();

	public CommandHolder() {
		command2Action.put("add", addCmd);
		command2Action.put("table", addTableCmd);
		command2Action.put("chair", addChairCmd);
		command2Action.put("wardrobe", addWardrobeCmd);
		
		command2Action.put("edit", editCmd);
		command2Action.put("name", editNameCmd);
		
		command2Action.put("print", printCmd);
		command2Action.put("return", returnCmd);
		command2Action.put("exit", exitCmd);
	}

	public Command get(String inputName) {
		Command command = command2Action.get(inputName);
		return command;
	}
}
