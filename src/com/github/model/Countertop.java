package com.github.model;

public class Countertop {

	private int width;
	private int length;
	private int height;
	private String typeOfCountertop;

	public Countertop(String typeOfCountertop, int width, int length, int height) {
		this.typeOfCountertop = typeOfCountertop;
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public Countertop() {

	}

	public int getWidth() {
		return width;
	}

	public int getLength() {
		return length;
	}

	public int getHeight() {
		return height;
	}

	public String getTypeOfCountertop() {
		return typeOfCountertop;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public void setTypeOfCountertop(String typeOfCountertop) {
		this.typeOfCountertop = typeOfCountertop;
	}
}
