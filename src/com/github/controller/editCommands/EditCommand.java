package com.github.controller.editCommands;

import com.github.storage.MemoryStorage;
import com.github.controller.*;

public class EditCommand implements Command { 

	@Override
	public void execute() {

		if (MemoryStorage.getAll().size() == 0) {
			System.out.println("------------------------");
			System.out.println("Nothing to Change");
			System.out.println("------------------------");

		}

	}

	@Override
	public void execute(Input input) {

	}

}
