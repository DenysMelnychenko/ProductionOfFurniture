package com.github.controller;

import com.github.model.Furniture;
import com.github.storage.MemoryStorage;

import java.util.List;

public class PrintCommand extends Command {

    public void execute() {
        System.out.println("Added Product to Order: ");
        System.out.println("------------------------");
        List<Furniture> list = MemoryStorage.getAll();
        for (Furniture furniture : list) {
            System.out.println(furniture.getTypeOfProduct());
        }
        if (list.size() == 0) {
            System.out.println("No products were found");
        }
        System.out.println("------------------------");
    }
}
