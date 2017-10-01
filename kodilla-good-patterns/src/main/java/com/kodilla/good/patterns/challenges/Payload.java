package com.kodilla.good.patterns.challenges;
import java.util.ArrayList;

public class Payload {

    public boolean productAvailable(ArrayList<String> productList, String product) {

        boolean availableStuff = false;

        for(int n = 0; n < productList.size(); n++) {
            if (product.equals(productList.get(n))) {
                availableStuff = true;
            }
        }
        return availableStuff;
    }
}
