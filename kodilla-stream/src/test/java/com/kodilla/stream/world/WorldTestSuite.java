package com.kodilla.com.kodilla.stream.world;

import com.kodilla.stream.world.Continent;
import com.kodilla.stream.world.Country;
import com.kodilla.stream.world.World;
import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.HashSet;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {

        HashSet<Country> Europe = new HashSet<>();
        HashSet<Country> America = new HashSet<>();
        HashSet<Country> Asia = new HashSet<>();

        Country Poland = new Country("Poland", new BigDecimal("10000000000"));
        Country Czech = new Country("Czech", new BigDecimal("10000000000"));
        Country Austria = new Country("Austria", new BigDecimal("10000000000"));

        Europe.add(Poland);
        Europe.add(Czech);
        Europe.add(Austria);

        Country Columbia = new Country("Columbia", new BigDecimal("10000000000"));
        Country Wenezuela = new Country("Wenezuela", new BigDecimal("10000000000"));
        Country Cuba = new Country("Cuba", new BigDecimal("10000000000"));

        America.add(Columbia);
        America.add(Wenezuela);
        America.add(Cuba);

        Country China = new Country("China", new BigDecimal("10000000000"));
        Country Korea = new Country("Korea", new BigDecimal("10000000000"));
        Country Malesia = new Country("Malesia", new BigDecimal("10000000000"));

        Asia.add(China);
        Asia.add(Korea);
        Asia.add(Malesia);

        HashSet<Continent> continents = new HashSet<>();

        continents.add(new Continent("Europe", Europe));
        continents.add(new Continent("America", America));
        continents.add(new Continent("Asia", Asia));

        World world = new World(continents);

        BigDecimal totalPeople = world.getPeopleQuantity();
        BigDecimal expectedPeople = new BigDecimal("90000000000");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}