package com.github.controller.addCommand;

import com.github.controller.Command;
import com.github.controller.Input;
import com.github.controller.ReturnCommand;
import com.github.model.Furniture;
import com.github.storage.MemoryStorage;
import com.github.views.Menu;

public class AddFurniture implements Command {

    @Override
    public void execute() {
        Input input = new Input();
        while (!input.getInputName().equals("return")) {
            Menu.showAddMenu();
            input.nextUserCommand();
            String choice = input.getInputName();
            switch (choice) {
                case "1":
                    System.out.println("Add furniture type. Example: Table");
                    String type = input.nextUserCommand();

                    System.out.println("Add furniture material Example: Wood");
                    String material = input.nextUserCommand();

                    Furniture furniture = new Furniture(type, material);
                    MemoryStorage.add(furniture);
                    System.out.println("Furniture added" + "\n");
                    break;

                case "2":
                    Command command = new ReturnCommand();
                    command.execute(input);
                    break;
                default:
                    System.out.println("Please retry!");
            }
        }
    }

    @Override
    public void execute(Input input) {

    }

}
