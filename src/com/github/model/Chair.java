package com.github.model;

public class Chair extends Furniture {

    private int heightOfLegs;
    private String coverMaterial;
    private Boolean isBackrest;

    public Chair(String productType, String productMaterial, int heightOfLegs, String coverMaterial, boolean isBackrest) {

        super(productType, productMaterial);
        this.heightOfLegs = heightOfLegs;
        this.coverMaterial = coverMaterial;
        this.isBackrest = isBackrest;
    }

    public int getHeightOfLegs() {
        return heightOfLegs;
    }

    public String getCoverMaterial() {
        return coverMaterial;
    }

    public Boolean getIsBackrest() {
        return isBackrest;
    }

    public void setHeightOfLegs(int heightOfLegs) {
        this.heightOfLegs = heightOfLegs;
    }

    public void setCoverMaterial(String cover) {
        this.coverMaterial = cover;
    }

    public void setIsBackrest(Boolean isBackrest) {
        this.isBackrest = isBackrest;
    }


}