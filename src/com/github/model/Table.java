package com.github.model;

public class Table extends Furniture {

	private int numberOfPerson;
	private int numberOfLegs;
	private int heightOfLegs;
	private Countertop top;

	public Table(String productType, String productMaterial, int numberOfPerson, int numberOfLegs, int heightOfLegs,
			Countertop top) {
		super(productType, productMaterial);
		this.setNumberOfPerson(numberOfPerson);
		this.setNumberOfLegs(numberOfLegs);
		this.setHeightOfLegs(heightOfLegs);
		this.top = top;

	}

	public int getNumberOfPerson() {
		return numberOfPerson;
	}

	public void setNumberOfPerson(int numberOfPerson) {
		this.numberOfPerson = numberOfPerson;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	public int getHeightOfLegs() {
		return heightOfLegs;
	}

	public void setHeightOfLegs(int heightOfLegs) {
		this.heightOfLegs = heightOfLegs;
	}

}
