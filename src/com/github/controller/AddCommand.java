package com.github.controller;

import com.github.model.Furniture;
import com.github.storage.MemoryStorage;
import com.github.views.Menu;

public class AddCommand extends Command {

    public void execute() {
        Input input = new Input();
        while (!input.getInputName().equals("return")) {
            Menu.showAddMenu();
            input.nextUserComand();
            String choice = input.getInputName();
            switch (choice) {
                case "1":
                    System.out.println("Add furniture type. Example: Table");
                    String type = input.nextUserComand();

                    System.out.println("Add furniture material Example: Wood");
                    String material = input.nextUserComand();

                    System.out.println("Add furniture id Example: 123");
                    int furniture_id = Integer.parseInt(input.nextUserComand());

                    Furniture furniture = new Furniture(type, material, furniture_id);
                    MemoryStorage.add(furniture);
                    System.out.println("Furniture added" + "\n");
                    break;

                case "2":
                    Command command = new ReturnCommand();
                    command.execute(input);
                   /* input.setInputName("return");*/
                    break;
                default:
                    System.out.println("Please retry!");
            }
        }

    }

}
