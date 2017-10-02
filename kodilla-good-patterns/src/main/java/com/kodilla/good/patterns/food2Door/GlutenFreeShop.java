package com.kodilla.good.patterns.food2Door;

public class GlutenFreeShop {

    public void process() {
        infoAboutProvider();
        productType();
        quantityOfProduct();
        successOrder();
    }

    public void infoAboutProvider() {
        System.out.println("GlutenFreeShop");
    }

    public void productType() {
        System.out.println("Gluten Free Food");
    }

    public void quantityOfProduct() {
        System.out.println("Gluten Free Food Quantity");
    }

    public boolean successOrder() {
        System.out.println("Gluten Free Food Delivered");
        return true;
    }
}
