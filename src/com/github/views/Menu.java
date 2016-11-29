package com.github.views;

import com.github.model.Furniture;
import com.github.storage.*;
import com.github.controller.Input;

import java.util.List;

public class Menu {

   /* private Input input = new Input();
    private MemoryStorage dao = new MemoryStorage();*/

    public void showMainMenu() {
        System.out.println("Commands:");
        System.out.println("|add  |	- add product to Order");
        System.out.println("|edit| - edit products in Order");
        System.out.println("|print|	- print Order to display");
        System.out.println("|exit| - exit program");
    }

    private void showAddMenu() {
        System.out.println("Chose added product");
        System.out.println("|1 - Furniture| |2 - return|");
    }

    private void showEditMenu() {
        System.out.println("|1 - change name of product|");
        System.out.println("|2 - return|");
    }


    /*public void chooseFromMainMenu(String choice) {
        switch (choice) {
            case "add":
                while (!input.getInputName().equals("return")) {
                    showAddMenu();
                    chooseFromAddMenu(input.nextUserComand());
                }
                break;
            case "print":
                System.out.println("Added Product to Order: ");
                System.out.println("------------------------");
                List<Furniture> list = dao.getAll();
                for (Furniture furniture : list) {
                    System.out.println(furniture.getTypeOfProduct());
                }
                if (list.size() == 0) {
                    System.out.println("No products were found");
                }
                System.out.println("------------------------");
                break;
            case "edit":
                while (!input.getInputName().equals("return")) {
                    showEditMenu();
                    chooseFromEditMenu(input.nextUserComand());
                }
                break;
            case "exit":
                System.out.println("Program shutdown");
                input.setInputName("exit");
                break;
            default:
                System.out.println("Please retry");
        }
    }

    private void chooseFromEditMenu(String choice) {
        switch (choice) {
            case "1":
                int idNumber;
                String newName;
                System.out.println("choose id of the product");
                idNumber = Integer.parseInt(input.nextUserComand());

                System.out.println("type new name of the product");
                newName = input.nextUserComand();

                dao.changeTypeById(idNumber, newName);
                System.out.println("Name changed");
                break;
            case "2":
                input.setInputName("return");
                break;
            default:
                System.out.println("Please retry");
                break;
        }
    }

    private void chooseFromAddMenu(String choice) {
        switch (choice) {
            case "1":
                System.out.println("Add furniture type. Example: Table");
                String type = input.nextUserComand();

                System.out.println("Add furniture material Example: Wood");
                String material = input.nextUserComand();

                System.out.println("Add furniture id Example: 123");
                int furniture_id = Integer.parseInt(input.nextUserComand());

                Furniture furniture = new Furniture(type, material, furniture_id);
                dao.add(furniture);
                System.out.println("Furniture added");
                System.out.println();
                break;
            case "2":
                input.setInputName("return");
                System.out.println();
                break;
            default:
                System.out.println("Please retry");
                System.out.println();
                break;
        }
    }

    public Input getInput() {
        return this.input;
    }

    public void setInput(Input input) {
        this.input = input;
    }
*/
}
