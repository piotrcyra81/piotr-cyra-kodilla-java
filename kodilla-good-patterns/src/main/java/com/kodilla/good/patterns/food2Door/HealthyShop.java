package com.kodilla.good.patterns.food2Door;

public class HealthyShop {

    public void process() {
        infoAboutProvider();
        productType();
        quantityOfProduct();
        successOrder();
    }

    public void infoAboutProvider() {
        System.out.println("HealthyShop");
    }

    public void productType() {
        System.out.println("Healthy Food");
    }

    public void quantityOfProduct() {
        System.out.println("Healthy Food Quantity");
    }

    public boolean successOrder() {
        System.out.println("Healthy Food Delivered");
        return true;
    }
}
