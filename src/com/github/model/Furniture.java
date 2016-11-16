package com.github.model;

public class Furniture {


    private int id = -1;
    private String typeOfProduct;
    private String typeOfMaterial;

    public Furniture(String productName, String productType) {

        typeOfProduct = productName;
        typeOfMaterial = productType;
        this.id = id++;
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

    public String toString() {
        return String.format("%s", this.getTypeOfProduct());
    }


}
