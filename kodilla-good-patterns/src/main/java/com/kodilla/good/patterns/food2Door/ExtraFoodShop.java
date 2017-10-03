package com.kodilla.good.patterns.food2Door;

public class ExtraFoodShop implements Provider {

    String infoAboutShop;
    String typeOfShopProducts;
    double quantityOfProducts;
    boolean orderInformation;

    public ExtraFoodShop(String infoAboutShop, String typeOfShopProducts, double quantityOfProducts, boolean orderInformation) {
        this.infoAboutShop = infoAboutShop;
        this.typeOfShopProducts = typeOfShopProducts;
        this.quantityOfProducts = quantityOfProducts;
        this.orderInformation = orderInformation;
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
        return "ExtraFoodShop{" +
                "infoAboutShop='" + infoAboutShop + '\'' +
                ", typeOfShopProducts='" + typeOfShopProducts + '\'' +
                ", quantityOfProducts=" + quantityOfProducts +
                ", orderInformation=" + orderInformation +
                '}';
    }
}