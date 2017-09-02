package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country implements PeopleStorage {
    @Override
    public BigDecimal getPeopleQuantity() {
        BigDecimal peopleQuantity = new BigDecimal("1234567");
        return peopleQuantity;
    }
}