package com.github.main;

import java.util.Map;
import com.github.controller.*;
import com.github.storage.*;
import com.github.views.Menu;

public class Main {

	public static void main(String[] args) {

		Input input = new Input();
		CommandsHolder commandHolder = new CommandsHolder();
		while (!input.getInputName().equals("exit")) {
			Menu.showMainMenu();
			input.nextUserCommand();
			Map<String, Command> typeOfCommandHolder = commandHolder.getAll(input.getInputName());
			String menuResult = commandHolder.showMenu(typeOfCommandHolder);
			if (menuResult.equals("typical")) {
				Command cmd = typeOfCommandHolder.get(input.getInputName());
				cmd.execute();
			} else {
				input.nextUserCommand();
				Command cmd = typeOfCommandHolder.get(input.getInputName());
				cmd.execute();
			}
		}
		System.out.println("=== Good Buy ===");

	}

}
