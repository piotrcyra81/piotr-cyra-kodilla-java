package com.kodilla.good.patterns.food2Door;

public class Food2DoorApp {

    public static void main(String[] args) {

        ExtraFoodShop extraFoodShop = new ExtraFoodShop();
        extraFoodShop.process();

        HealthyShop healthyShop = new HealthyShop();
        healthyShop.process();

        GlutenFreeShop glutenFreeShop = new GlutenFreeShop();
        glutenFreeShop.process();

        NewShop newShop = new NewShop();
        newShop.process();

    }
}