package com.github.controller;

import com.github.model.*;
import com.github.storage.MemoryStorage;
import java.util.List;

public class PrintCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Added Product to Order: ");
		System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		List<Furniture> list = MemoryStorage.getAll();

		if (list.size() == 0) {
			System.out.println("No products were found" + "\n");
		}

		else if (list.size() != 0) {
			System.out.printf("%-6s%-17s%-17s%-1s%n","|ID  " , "| NAME " , "| MATERIAL", "|");
			System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
			for (Furniture furniture : list) {
				System.out.printf("%-1s%-5d%-1s%-15s%-1s%-15s%-1s%n","|", furniture.getId(), "| ", furniture.getTypeOfProduct(),  "| ", furniture.getTypeOfMaterial(), "|" );
				}
			}
			System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
		}

	@Override
	public void execute(Input input) {

	}
}
