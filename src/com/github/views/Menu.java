package com.github.views;

import com.github.model.Furniture;
import com.github.storage.*;
import com.github.controller.Command;

import java.util.ArrayList;


/**
 * Created by aspir on 12.11.2016.
 */
public class Menu {

    private Command command = new Command();
    private MemoryStorage dao = new MemoryStorage();

    public Command getCommand() {
        return this.command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }


    public void showMainMenu() {
        System.out.println("Commands:");
        System.out.println("|add  |	- add product to Order");
        System.out.println("|edit| - edit products in Order");
        System.out.println("|print|	- print Order to display");
        System.out.println("|exit| - exit program");

    }

    public void showAddMenu() {
        System.out.println("Chose added product");
        System.out.println("|1 - Furniture| |2 - return|");
    }

    public void showEditMenu() {
        System.out.println("|1 - change name of product|");
        System.out.println("|2 - return|");
    }


    public void chooseFromMainMenu(String choice) {
        switch (choice) {
            case "add":
               /* dao.add();*/
                while (!command.getCommandName().equals("return")) {
                    showAddMenu();
                    chooseFromAddMenu(command.nextUserCommand());
                }
                break;
            case "print":
                System.out.println("Added Product to Order: ");
                System.out.println("------------------------");
                ArrayList<Furniture> list = dao.getAll();
                for (Furniture furniture : list) {
                    System.out.println(furniture.getTypeOfProduct());
                }
                System.out.println("------------------------");
                break;
            case "edit":
                while (!command.getCommandName().equals("return")) {
                    showEditMenu();
                    chooseFromEditMenu(command.nextUserCommand());
                }
                break;
            case "exit":
                System.out.println("Program shutdown");
                command.setCommandName("exit");
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
                idNumber = Integer.parseInt(command.nextUserCommand());
                System.out.println("type new name of the product");
                newName = command.nextUserCommand();
                dao.changeName(idNumber, newName);
                System.out.println("Name changed");
                break;
            case "2":
                command.setCommandName("return");
                break;
            default:
                System.out.println("Please retry");
                break;
        }
    }

    public void chooseFromAddMenu(String choice) {

        switch (choice) {
            case "1":
                System.out.println("Add furniture type");
                String type = command.nextUserCommand();
                System.out.println("Add furniture material");
                String material = command.nextUserCommand();
                System.out.println("Add furniture id");
                int furniture_id = Integer.parseInt(command.nextUserCommand());
                Furniture furniture = new Furniture(type, material, furniture_id);
                dao.add(furniture);
                System.out.println("Furniture added");
                System.out.println();
                break;
            case "2":
                command.setCommandName("return");
                System.out.println();
                break;
            default:
                System.out.println("Please retry");
                System.out.println();
                break;
        }
    }


}
