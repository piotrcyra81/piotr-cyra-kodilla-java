package com.kodilla.good.patterns.challenges;
import java.util.ArrayList;

public class ApplicationStore {

    public static void main(String[] args) throws java.lang.Exception {

        ArrayList<String> products = new Product().productList();

        String order = "Czapka";

        Payload payload = new Payload();
        boolean availableStuff = payload.productAvailable(products, order);

        SellingInformation informationService = new SellingInformation(order, availableStuff);
        ProductOrderService orderInformation = new ProductOrderService(informationService);

        orderInformation.process(order, products);
    }
}