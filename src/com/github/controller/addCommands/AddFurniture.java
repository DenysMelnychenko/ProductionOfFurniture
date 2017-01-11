package com.github.controller.addCommands;

import com.github.controller.Command;
import com.github.controller.Input;
import com.github.model.Furniture;
import com.github.storage.MemoryStorage;

public abstract class AddFurniture implements Command {

	@Override
	public void execute() {
		Input input = new Input();

		System.out.println("Add furniture type. Example: Table");
		String type = input.nextUserCommand();

		System.out.println("Add furniture material Example: Wood");
		String material = input.nextUserCommand();

		Furniture furniture = new Furniture(type, material);
		MemoryStorage.add(furniture);
		System.out.println("Furniture added" + "\n");

	}

	@Override
	public void execute(Input input) {

	}

}
