package com.github.model;

public class Wardrobe extends Furniture {

	private int height;
	private int width;
	private int depth;
	private int numberOfSections;
	private boolean isDoor;
	private Door door;
	private int numberOfDoors;

	public Wardrobe(String productType, String productMaterial, int height, int width, int depth, int numberOfSections,
			boolean isDoor,Door door, int numberOfDoors) {
		super(productType, productMaterial);
		this.height = height;
		this.width = width;
		this.depth = depth;
		this.numberOfSections = numberOfSections;
		this.isDoor = isDoor;
		this.door = door;
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

	public Door getDoor() {
		return door;
	}

	public void setDoor(Door door) {
		this.door = door;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

}
