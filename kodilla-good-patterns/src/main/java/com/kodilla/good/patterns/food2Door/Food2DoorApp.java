package com.kodilla.good.patterns.food2Door;

public class Food2DoorApp {

    public static void main(String[] args) {

        ProviderCollector providerCollector = new ProviderCollector();

        Provider extraFoodShop = new ExtraFoodShop("Extra Food Shop","Extra Food",500, true);
        Provider glutenFreeShop = new GlutenFreeShop("Gluten Free Shop","Gluten Free Food",800, true);
        Provider healthyShop = new HealthyShop("Healthy Shop","Healthy Free Food",352, false);

        providerCollector.addProvider(extraFoodShop);
        providerCollector.addProvider(glutenFreeShop);
        providerCollector.addProvider(healthyShop);

        System.out.println("Provider list = " +"\n"+ providerCollector.providerList);

    }
}