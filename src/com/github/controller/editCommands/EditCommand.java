package com.github.controller.editCommands;

import com.github.storage.MemoryStorage;
import com.github.views.Menu;
import com.github.controller.*;

public class EditCommand implements Command { // Здесь создать switch с выбором
												// того что нужно изменять или
												// создать Mар с командами по
												// примеру главного меню?

	@Override
	public void execute() {

		if (MemoryStorage.getAll().size() == 0) {
			System.out.println("------------------------");
			System.out.println("Nothing to Change");
			System.out.println("------------------------");

		}

		Menu.showEditMenu();
	}

	@Override
	public void execute(Input input) {

	}

}
