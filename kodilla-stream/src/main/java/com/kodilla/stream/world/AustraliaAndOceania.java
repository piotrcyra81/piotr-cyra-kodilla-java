package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class AustraliaAndOceania implements PeopleStorage {
    @Override
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("12345678");
        return peopleQuantity;
    }
}