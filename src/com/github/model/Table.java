package com.github.model;

public class Table extends Furniture {


    private int numberOfPerson;
    private int numberOfLegs;
    private int heightOfLegs;
    private Countertop top;

    public Table(String productType, String productMaterial, int numberOfPerson, int numberOfLegs, int heightOfLegs) {
        super(productType, productMaterial);
        this.numberOfPerson = numberOfPerson;
        this.numberOfLegs = numberOfLegs;
        this.heightOfLegs = heightOfLegs;

    }


}
