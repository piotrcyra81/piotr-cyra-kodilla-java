package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Continent implements PeopleStorage {
    @Override
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("123456789");
        return peopleQuantity;
    }
}