package com.example.codingmounrtain.addtocartbadgecount.ModelClasses;

/**
 * Created by chintu gandhwani on 1/22/2018.
 */

public class Products {

    private String productName;
    private int productImageId;
    private String productdesc;
    private boolean addedTocart = false;

    public  Products(String productName,String productdesc,int productImageId)
    {
        this.productName=productName;
        this.productdesc=productdesc;
        this.productImageId=productImageId;
    }

    public boolean isAddedTocart() {
        return addedTocart;
    }

    public void setAddedTocart(boolean addedTocart) {
        this.addedTocart = addedTocart;
    }

    public String getProductName() {
        return productName;
    }

    public String getProductdesc() {
        return productdesc;
    }

    public int getProductImageId() {
        return productImageId;
    }

}
