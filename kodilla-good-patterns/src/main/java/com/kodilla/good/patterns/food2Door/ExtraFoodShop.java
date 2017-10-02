package com.kodilla.good.patterns.food2Door;

public class ExtraFoodShop {

    public void process() {
        infoAboutProvider();
        productType();
        quantityOfProduct();
        successOrder();
    }

    public void infoAboutProvider() {
        System.out.println("ExtraFoodShop");
    }

    public void productType() {
        System.out.println("Extra Food");
    }

    public void quantityOfProduct() {
        System.out.println("Extra Food Quantity");
    }

    public boolean successOrder() {
        System.out.println("Extra Food Delivered");
        return true;
    }
}