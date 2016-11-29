package com.github.controller;

import com.github.model.Furniture;
import com.github.storage.MemoryStorage;

public class AddCommand extends Command {
    public void execute() {
        Input input = new Input();
        System.out.println("Add furniture type. Example: Table");
        String type = input.nextUserComand();

        System.out.println("Add furniture material Example: Wood");
        String material = input.nextUserComand();

        System.out.println("Add furniture id Example: 123");
        int furniture_id = Integer.parseInt(input.nextUserComand());

        Furniture furniture = new Furniture(type, material, furniture_id);
        MemoryStorage.add(furniture);
        System.out.println("Furniture added");
        System.out.println();
    }
}
