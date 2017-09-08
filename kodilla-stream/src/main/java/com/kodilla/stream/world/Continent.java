package com.kodilla.stream.world;

import java.util.HashSet;

public class Continent {
    private final HashSet<Country> countries;
    private final String continentName;

    public Continent(String continentName, HashSet<Country> countries ) {
        this.continentName = continentName;
        this.countries = countries;
    }
    public HashSet<Country> getCountries() {
        return new HashSet<>(countries);
    }
}