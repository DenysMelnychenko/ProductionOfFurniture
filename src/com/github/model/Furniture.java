package com.github.model;

public class Furniture {

	private static int idCounter;
	private int id;
	private String typeOfProduct;
	private String typeOfMaterial;

	public Furniture(String productType, String productMaterial) {

		idCounter++;
		typeOfProduct = productType;
		typeOfMaterial = productMaterial;
		this.id = idCounter;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypeOfProduct() {
		return typeOfProduct;
	}

	public void setTypeOfProduct(String typeOfProduct) {
		this.typeOfProduct = typeOfProduct;
	}

	public String getTypeOfMaterial() {
		return typeOfMaterial;
	}

	public void setTypeOfMaterial(String typeOfMaterial) {
		this.typeOfMaterial = typeOfMaterial;
	}

	public String toString() {
		return String.format("%s", this.getId(), this.getTypeOfProduct(), this.getTypeOfMaterial());
	}
	
	public String getFurnitureName(Furniture furniture) {
		return furniture.getClass().getSimpleName() + "(" + getTypeOfMaterial() + ")";
	}
}
