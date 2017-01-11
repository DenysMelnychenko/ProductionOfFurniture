package com.github.model;

import java.util.Arrays;

public class Wardrobe extends Furniture {

	private int height;
	private int width;
	private int depth;
	private int numberOfSections;
	private boolean isDoor;
	private Door[] doors;
	private int numberOfDoors;

	public Wardrobe(String productType, String productMaterial, int height, int width, int depth, int numberOfSections,
			boolean isDoor, Door[] doors, int numberOfDoors) {
		super(productType, productMaterial);
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.numberOfSections = numberOfSections;
		this.isDoor = isDoor;
		this.doors = doors;
		this.numberOfDoors = numberOfDoors;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}

	public int getNumberOfSections() {
		return numberOfSections;
	}

	public void setNumberOfSections(int numberOfSections) {
		this.numberOfSections = numberOfSections;
	}

	public boolean isWithDoor() {
		return isDoor;
	}

	public void setWithDoor(boolean withDoor) {
		this.isDoor = withDoor;
	}

	public Door[] getDoor() {
		return doors;
	}

	public void setDoor(Door[] door) {
		this.doors = door;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	@Override
	public String toString() {
		return super.getTypeOfProduct() + " - material = " + super.getTypeOfMaterial() + ", h= " + height + ", w= " + width + ", d= " + depth +  ", " + "\n" + "numberOfSections="
				+ numberOfSections + ", isDoor=" + isDoor + ", numberOfDoors=" + numberOfDoors + ", doors = " + Arrays.toString(doors) + "]";
	}
	
	
	

}
