package com.kodilla.good.patterns.food2Door;

import java.util.ArrayList;
import java.util.List;

public class NewShop {

    String newShopName;

    public List<String> products = new ArrayList<>();

    public void process() {
        newShopName();
        infoAboutProvider();
        successOrder();
    }

    public boolean successOrder() {
        return true;
    }

    public void infoAboutProvider(){
        System.out.println("Provider");
    }

    public String newShopName() {
        System.out.println("New Provider");
        return newShopName;
    }

    public  List<String> getProducts() {
        return products;
    }

}