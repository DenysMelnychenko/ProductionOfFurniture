package com.github.storage;

import com.github.controller.Command;
import com.github.controller.EditCommand;
import com.github.controller.ExitCommand;
import com.github.controller.PrintCommand;
import com.github.controller.addCommand.Add;
import com.github.controller.addCommand.AddChairCommand;
import com.github.controller.addCommand.AddFurniture;
import com.github.controller.addCommand.AddTableCommand;

import java.util.HashMap;
import java.util.Map;

public class CommandHolder {
	private static Map<String, Command> command2Action = new HashMap<String, Command>();

	Command addCmd = new Add();
	Command addTable = new AddTableCommand();
	Command addChair = new AddChairCommand();
	Command editCmd = new EditCommand();
	Command printCmd = new PrintCommand();
	Command returnCmd = new PrintCommand();
	Command exitcmd = new ExitCommand();

	public CommandHolder() {
		command2Action.put("add", addCmd);
		command2Action.put("table", addTable);
		command2Action.put("chair", addChair);
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
