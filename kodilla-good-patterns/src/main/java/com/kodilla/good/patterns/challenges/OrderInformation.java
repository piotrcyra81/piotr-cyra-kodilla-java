package com.kodilla.good.patterns.challenges;
import java.util.ArrayList;

public class OrderInformation {

    public SellingInformation sellingInformation;


    public OrderInformation(final SellingInformation informationService) {
        this.sellingInformation = informationService;
    }

    public void process(String buyProducts, ArrayList<String> productList)
    {
        Payload payload = new Payload();
        boolean availableStuff = payload.productAvailable(productList, buyProducts);
        sellingInformation.sendingMessage("Buying", availableStuff);
    }
}