package com.github.controller.editCommands;

import com.github.controller.Command;
import com.github.controller.Input;
import com.github.controller.PrintCommand;
import com.github.storage.MemoryStorage;

public class EditMaterialCommand implements Command {

	private int idNumber;
	private String newMaterial;
	
	@Override
	public void execute() {
		Input input = new Input();
		PrintCommand printProd = new PrintCommand();

		printProd.execute();

		System.out.println("choose id of the product");
		idNumber = Integer.parseInt(input.nextUserCommand());

		System.out.println("type new material of the product");
		newMaterial = input.nextUserCommand();

		MemoryStorage.changeMaterialById(idNumber, newMaterial);
		System.out.println("Material has been changed");
		System.out.println("------------------------");

	}

	@Override
	public void execute(Input input) {

	}

}
