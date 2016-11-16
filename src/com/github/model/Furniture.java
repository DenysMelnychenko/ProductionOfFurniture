package com.github.model;

public class Furniture {

    private static int counter = 0;
    private int idCounter = 0;
    private int id = 0;
    private String typeOfProduct;
    private String typeOfMaterial;

    public Furniture(String name) {
        this.id = +idCounter;
        typeOfProduct = name;
        counter++;
    }

    public Furniture() {
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
        this.typeOfProduct = typeOfMaterial;
    }


}
