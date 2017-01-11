package com.github.controller.addCommands;

import com.github.controller.Input;
import com.github.controller.Command;
import com.github.model.Chair;
import com.github.model.Door;
import com.github.model.Furniture;
import com.github.model.Wardrobe;
import com.github.storage.MemoryStorage;

public class AddWardrobeCommand implements Command{
	@Override
	public void execute() {
		Input input = new Input();

		System.out.println("Add specification name. Example: My Wardrobe");
		String type = input.nextUserCommand();

		System.out.println("Add Wardrobe material. Example: Wood");
		String material = input.nextUserCommand();

		System.out.println("Add height of a Wardrobe. Example: 165");
		int height = Integer.parseInt(input.nextUserCommand());

		System.out.println("Add width of a Wardrobe. Example 100");
		int width = Integer.parseInt(input.nextUserCommand());
		
		System.out.println("Add depth of a Wardrobe. Example 75");
		int depth = Integer.parseInt(input.nextUserCommand());

		System.out.println("Add number of sections. Example: 2");
		int numberOfSections = Integer.parseInt(input.nextUserCommand());
		
		System.out.println("Does wardrobe has a door?. Example: true");
		boolean isDoor = Boolean.parseBoolean(input.nextUserCommand());
		
		System.out.println("Add number of doors. Example: 2");
		int numberOfDoors = Integer.parseInt(input.nextUserCommand());
		
		Door[] doors = new Door[numberOfDoors];
		for (int i = 0; i < doors.length; i++) {
			
			System.out.println("Add type of Door. Example: With mirrow.");
			String typeOfDoor = input.nextUserCommand();
			
			System.out.println("Add type of Open. Example: Slide to side.");
			String typeOfOpen = input.nextUserCommand();
			
			System.out.println("Add height of Door. Example: 160.");
			int heightOfDoor = Integer.parseInt(input.nextUserCommand());
			
			System.out.println("Add width of Door. Example: 50.");
			int widthOfDoor = Integer.parseInt(input.nextUserCommand());
			
			doors[i] = new Door(typeOfDoor, typeOfOpen, heightOfDoor, widthOfDoor);
		}
		
		Furniture furniture = new Wardrobe(type, material, height, width, depth, numberOfSections, isDoor, doors, numberOfDoors);
		MemoryStorage.add(furniture);
		System.out.println("Wardrobe added" + "\n");
	}

	@Override
	public void execute(Input input) {

	}
}
