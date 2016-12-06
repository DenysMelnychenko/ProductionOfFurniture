package com.github.controller;

import com.github.storage.MemoryStorage;
import com.github.views.Menu;

public class EditCommand extends Command {       // Здесь создать switch с выбором того что нужно изменять или создать мар с командами по примеру главного меню?

    private int idNumber;
    private String newName;

    public void execute() {
        Input input = new Input();
        while (!input.getInputName().equals("return")) {
            if (MemoryStorage.getAll().size() == 0){
                System.out.println("------------------------");
                System.out.println("Nothing to Change");
                System.out.println("------------------------");
                input.setInputName("return");
                break;
            }
            Menu.showEditMenu();
            input.nextUserComand();
            String choice = input.getInputName();
            switch (choice) {
                case "1":
                    System.out.println("choose id of the product");
                    idNumber = Integer.parseInt(input.nextUserComand());

                    System.out.println("type new name of the product");
                    newName = input.nextUserComand();

                    MemoryStorage.changeTypeById(idNumber, newName);
                    System.out.println("Name has been changed");
                    System.out.println("------------------------");
                    break;

                case "2":
                    System.out.println("choose id of the product");
                    idNumber = Integer.parseInt(input.nextUserComand());

                    System.out.println("type new material of the product");
                    newName = input.nextUserComand();

                    MemoryStorage.changeMaterialById(idNumber, newName);
                    System.out.println("Material has been changed");
                    System.out.println("------------------------");
                    break;

                case "3":
                    Command command = new ReturnCommand();
                    command.execute(input);
                   /* input.setInputName("return");*/       // Или просто реализовать так как я закомитил? Без лишних классов?
                    break;
                default:
                    System.out.println("Please retry!");
            }
        }

    }

}
