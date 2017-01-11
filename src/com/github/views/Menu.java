package com.github.views;

import java.util.Map;

import com.github.controller.Command;
import com.github.storage.AddCommandsHolder;
import com.github.storage.EditCommandsHolder;

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
        System.out.println("|table| |chair| |wardrobe| |return|");
    }

    public static void showEditMenu() {
        System.out.println("|name - change type of product|");
        System.out.println("|material - change material of product|");
        /*System.out.println("|4 - change id of product|");*/       // Нужно ли иметь возможность изменять id?
        System.out.println("|3 - return|");
    }

	public static String showMenu(Map<String, Command> map) {
		if (map.entrySet().equals(new AddCommandsHolder().getAll().entrySet())) {
			Menu.showAddMenu();
			return "";
		} else if (map.entrySet().equals(new EditCommandsHolder().getAll().entrySet())) {
			Menu.showEditMenu();
		return "";
		}
		  else {return "typical";
		  } 
	}
}
