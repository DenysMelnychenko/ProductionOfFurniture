package com.github.views;

import com.github.model.Chair;
import com.github.model.Table;
import com.github.model.Wordrobe;
import com.github.controller.Command;
import com.github.model.Order;

/**
 * Created by aspir on 12.11.2016.
 */
public class Menu {

    private Command command = new Command();
    private Order order = null;

    public Command getCommand() {
        return command;
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
        System.out.println("|1 - table|   |2 - chair|   |3 - wardrobe|  |4 - return|");
    }

    public void showEditMenu() {
        System.out.println("|1 - change name of product|");
        System.out.println("|2 - return|");
    }


    public void chooseFromMainMenu(String choice) {
        switch (choice) {
            case "add":
                order = new Order();
                while (!command.getCommandName().equals("return")) {
                    showAddMenu();
                    chooseFromAddMenu(command.nextUserCommand());
                }
                break;
            case "print":
                System.out.println("Added Product to Order: ");
                order.printOrder();
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
                order.changeName(idNumber,newName );
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
                order.add(new Table("Test Table"));
                System.out.println("Table added ID = " );
                System.out.println();
                break;
            case "2":
                order.add(new Chair("Test Chair"));
                System.out.println("Chair added");
                System.out.println();
                break;
            case "3":
                order.add(new Wordrobe("Test Wardrobe"));
                System.out.println("Wardrobe added");
                System.out.println();
                break;
            case "4":
                command.setCommandName("return");
                break;
            default:
                System.out.println("Please retry");
                break;
        }
    }



}
