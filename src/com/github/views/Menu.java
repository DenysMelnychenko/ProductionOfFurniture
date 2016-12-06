package com.github.views;

public class Menu {


    public static void showMainMenu() {
        System.out.println("Commands:");
        System.out.println("|add  |	- add product to Order");
        System.out.println("|edit | - edit products in Order");
        System.out.println("|print|	- print Order to display");
        System.out.println("|exit | - exit program");
    }

    public static void showAddMenu() {
        System.out.println("Chose added product");
        System.out.println("|1 - Furniture| |2 - return|");
    }

    public static void showEditMenu() {
        System.out.println("|1 - change type of product|");
        System.out.println("|2 - change material of product|");
        /*System.out.println("|4 - change id of product|");*/       // Нужно ли иметь возможность изменять id?
        System.out.println("|3 - return|");
    }
}
