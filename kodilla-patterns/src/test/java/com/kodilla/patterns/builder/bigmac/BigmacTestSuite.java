package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

    @Test
    public void testNewBimac() {

        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .setRoll("Sesame")
                .setBurgers(2)
                .setSauce("Barbecue")
                .setIngredients("Mushrooms")
                .setIngredients("Cheese")
                .setIngredients("Pickled Cucumber")
                .setIngredients("Onion")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();

        //Then
        Assert.assertEquals(4, howManyIngredients);
    }
}