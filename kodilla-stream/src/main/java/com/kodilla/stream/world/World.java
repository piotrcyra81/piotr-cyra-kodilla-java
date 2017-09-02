package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class World implements PeopleStorage{
    @Override
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("1234567890");
        return peopleQuantity;
    }
}