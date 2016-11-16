package com.github.views;

import com.github.storage.*;
import com.github.controller.Command;


/**
 * Created by aspir on 12.11.2016.
 */
public class Menu {

    private Command command = new Command();
    private MemoryStorage list = new MemoryStorage();

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
               /* list.add();*/
                while (!command.getCommandName().equals("return")) {
                    showAddMenu();
                    chooseFromAddMenu(command.nextUserCommand());
                }
                break;
            case "print":
                System.out.println("Added Product to Order: ");
                list.print();
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
                list.changeName(idNumber, newName);
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
                list.add();
                System.out.println("Furniture added");
                break;
            case "2":
                command.setCommandName("return");
                break;
            default:
                System.out.println("Please retry");
                break;
        }
    }


}
