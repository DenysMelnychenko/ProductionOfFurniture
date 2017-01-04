package com.github.controller;

import com.github.model.Furniture;
import com.github.storage.MemoryStorage;

import java.util.List;

public class PrintCommand implements Command {

    @Override
    public void execute() {
        System.out.println("Added Product to Order: ");
        System.out.println("------------------------");
        List<Furniture> list = MemoryStorage.getAll();
        if (list.size() == 0) {
            System.out.println("No products were found");
        }
        System.out.println("| ID" + "| NAME" + "| MATERIAL" + " |");
        for (Furniture furniture : list) {
            System.out.println("| " + furniture.getId() + "| " + furniture.getTypeOfProduct() + "| " + furniture.getTypeOfMaterial() + "|");
        }
        System.out.println("------------------------");
    }

    @Override
    public void execute(Input input) {

    }
}
