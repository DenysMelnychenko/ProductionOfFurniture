package com.github.controller.editCommands;

import com.github.controller.*;
import com.github.storage.MemoryStorage;
import com.github.views.Menu;

public class EditNameCommand implements Command {

	private int idNumber;
	private String newName;

	@Override
	public void execute() {
		Input input = new Input();
		PrintCommand printProd = new PrintCommand();

		Menu.showEditMenu();
		input.nextUserCommand();

		printProd.execute();
		System.out.println("choose id of the product");
		idNumber = Integer.parseInt(input.nextUserCommand());

		System.out.println("type new name of the product");
		newName = input.nextUserCommand();

		MemoryStorage.changeTypeById(idNumber, newName);
		System.out.println("Name has been changed");
		System.out.println("------------------------");

	}

	@Override
	public void execute(Input input) {

	}
}
