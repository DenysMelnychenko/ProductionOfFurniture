package com.github.controller;

import com.github.storage.MemoryStorage;

public class EditCommand extends Command { // Здесь создать switch с выбором того что нужно изменять или создать отдельные команды на разные изменения?

    public void execute() {
        Input input = new Input();
        int idNumber;
        String newName;
        System.out.println("choose id of the product");
        idNumber = Integer.parseInt(input.nextUserComand());

        System.out.println("type new name of the product");
        newName = input.nextUserComand();

        MemoryStorage.changeTypeById(idNumber, newName);
        System.out.println("Name changed");
    }

}
