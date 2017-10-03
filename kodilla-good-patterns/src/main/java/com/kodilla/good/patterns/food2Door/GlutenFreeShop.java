package com.kodilla.good.patterns.food2Door;

public class GlutenFreeShop implements Provider{

    String infoAboutShop;
    String typeOfShopProducts;
    double quantityOfProducts;
    boolean orderInformation;

    public GlutenFreeShop(String infoAboutShop, String typeOfShopProducts, double quantityOfProducts, boolean orderInformation) {
        this.infoAboutShop = infoAboutShop;
        this.typeOfShopProducts = typeOfShopProducts;
        this.quantityOfProducts = quantityOfProducts;
        this.orderInformation = orderInformation;
    }

    public void process() {
        System.out.println("Gluten Free Shop - Check status");
        System.out.println("Gluten Free Shop - Prepare products");
        System.out.println("Gluten Free Shop - Delivery");
    }

    public String infoAboutProvider() {
        return infoAboutShop;
    }

    public String productType() {
        return typeOfShopProducts;
    }

    public double quantityOfProduct() {
        return quantityOfProducts;
    }

    public boolean successOrder() {
        return orderInformation;
    }

    @Override
    public String toString() {
        return "GlutenFreeShop{" +
                "infoAboutShop='" + infoAboutShop + '\'' +
                ", typeOfShopProducts='" + typeOfShopProducts + '\'' +
                ", quantityOfProducts=" + quantityOfProducts +
                ", orderInformation=" + orderInformation +
                '}';
    }
}
