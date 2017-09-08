package com.kodilla.stream.world;

import java.math.BigDecimal;

public class Country {

    private final String countryName;
    private final BigDecimal PeopleQuantity;

    public Country(final String countryName, final BigDecimal PeopleQuantity) {
        this.countryName = countryName;
        this.PeopleQuantity = PeopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return PeopleQuantity;
    }
}