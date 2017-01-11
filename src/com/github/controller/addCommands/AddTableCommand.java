package com.github.controller.addCommands;

import com.github.controller.Command;
import com.github.controller.Input;
import com.github.model.Countertop;
import com.github.model.Furniture;
import com.github.model.Table;
import com.github.storage.MemoryStorage;

public class AddTableCommand implements Command {

	@Override
	public void execute() {
		Input input = new Input();

		System.out.println("Add specification name. Example: My Table");
		String type = input.nextUserCommand();

		System.out.println("Add Table material. Example: Wood");
		String material = input.nextUserCommand();

		System.out.println("Add numder of person. Example: 6");
		int numOfPersons = Integer.parseInt(input.nextUserCommand());

		System.out.println("Add numder of legs. Example: 6");
		int numOfLegs = Integer.parseInt(input.nextUserCommand());

		System.out.println("Add height of legs. Example: 65");
		int heightOfLegs = Integer.parseInt(input.nextUserCommand());

		System.out.println("Add Countertop material. Example: Wood");
		String typeOfCountertop = input.nextUserCommand();

		System.out.println("Add weidth of Countertop. Example: 75");
		int width = Integer.parseInt(input.nextUserCommand());

		System.out.println("Add length of Countertop. Example: 75");
		int length = Integer.parseInt(input.nextUserCommand());

		System.out.println("Add height of Countertop. Example: 75");
		int height = Integer.parseInt(input.nextUserCommand());

		Countertop top = new Countertop(typeOfCountertop, width, length, height);
		Furniture table = new Table(type, material, numOfPersons, numOfLegs, heightOfLegs, top);

		MemoryStorage.add(table);
		System.out.println("Table added" + "\n");
	}

	@Override
	public void execute(Input input) {

	}

}
