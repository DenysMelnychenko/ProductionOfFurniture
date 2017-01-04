package com.github.controller;

import com.github.storage.MemoryStorage;
import com.github.views.Menu;

public class EditCommand implements Command {       // Здесь создать switch с выбором того что нужно изменять или создать мар с командами по примеру главного меню?

    private int idNumber;
    private String newName;

    @Override
    public void execute() {
        Input input = new Input();
        PrintCommand printProd = new PrintCommand();
        while (!input.getInputName().equals("return")) {
            if (MemoryStorage.getAll().size() == 0){
                System.out.println("------------------------");
                System.out.println("Nothing to Change");
                System.out.println("------------------------");
                input.setInputName("return");
                break;
            }
            Menu.showEditMenu();
            input.nextUserCommand();
            String choice = input.getInputName();
            switch (choice) {
                case "1":
                    printProd.execute();
                    System.out.println("choose id of the product");
                    idNumber = Integer.parseInt(input.nextUserCommand());

                    System.out.println("type new name of the product");
                    newName = input.nextUserCommand();

                    MemoryStorage.changeTypeById(idNumber, newName);
                    System.out.println("Name has been changed");
                    System.out.println("------------------------");
                    break;

                case "2":
                    printProd.execute();
                    System.out.println("choose id of the product");
                    idNumber = Integer.parseInt(input.nextUserCommand());

                    System.out.println("type new material of the product");
                    newName = input.nextUserCommand();

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

    @Override
    public void execute(Input input) {

    }

}
