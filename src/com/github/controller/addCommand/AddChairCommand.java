package com.github.controller.addCommand;

import com.github.controller.Command;
import com.github.controller.Input;
import com.github.model.Chair;
import com.github.model.Furniture;
import com.github.storage.MemoryStorage;

public class AddChairCommand implements Command {

    @Override
    public void execute() {
        Input input = new Input();

        System.out.println("Add furniture type. Example: Table");
        String type = input.nextUserCommand();

        System.out.println("Add furniture material. Example: Wood");
        String material = input.nextUserCommand();

        System.out.printf("Add height of Legs. Example: 65");
        int height = Integer.parseInt(input.nextUserCommand());

        System.out.println("Add type of Cover. Example: Leather");
        String cover = input.nextUserCommand();

        System.out.printf("Add backrest. Example: true");
        boolean backrest = Boolean.parseBoolean(input.nextUserCommand());

        Furniture furniture = new Chair(type, material, height, cover, backrest);
        MemoryStorage.add(furniture);
        System.out.println("Furniture added" + "\n");
    }

    @Override
    public void execute(Input input) {

    }

}
