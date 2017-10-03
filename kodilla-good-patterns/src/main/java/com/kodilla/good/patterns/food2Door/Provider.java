package com.kodilla.good.patterns.food2Door;

interface Provider {
     String infoAboutProvider();
     String productType();
     double quantityOfProduct();
     boolean successOrder();
     void process();
}