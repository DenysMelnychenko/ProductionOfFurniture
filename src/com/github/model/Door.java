package com.github.model;

public class Door {
	

	private int height;
	private int width;
	private String typeOfDoor;
	private String typeOfOpen;

	public Door(String typeOfDoor, String typeOfOpen, int height, int width) {
		this.typeOfDoor = typeOfDoor;
		this.typeOfOpen = typeOfOpen;
		this.height = height;
		this.width = width;
	}
	
	public Door() {
		
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

	public String getTypeOfDoor() {
		return typeOfDoor;
	}

	public void setTypeOfDoor(String typeOfDoor) {
		this.typeOfDoor = typeOfDoor;
	}

	public String getTypeOfOpen() {
		return typeOfOpen;
	}

	public void setTypeOfOpen(String typeOfOpen) {
		this.typeOfOpen = typeOfOpen;
	}
	
	
}
