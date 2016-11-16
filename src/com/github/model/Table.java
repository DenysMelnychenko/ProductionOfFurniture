package com.github.model;

/**
 * Created by aspir on 08.11.2016.
 */
public class Table extends Furniture {

    private int idCounter = 0;
    private int id = 0;
    private String typeOfProduct;
    private String typeOfMaterial;


    public Table(String name) {
        this.id = +idCounter;
        typeOfProduct = name;
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
        return typeOfProduct;
    }

    public void setTypeOfMaterial(String typeOfProduct) {
        this.typeOfProduct = typeOfProduct;
    }
}
