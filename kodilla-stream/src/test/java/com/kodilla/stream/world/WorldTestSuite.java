package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity() {
        //Given
        List<PeopleStorage> world = new ArrayList<>();
        world.add(new America());
        world.add(new AustraliaAndOceania());

        //When
        BigDecimal totalPeople = world.stream()
                .map(PeopleStorage::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));

        //Then
        BigDecimal expectedPeople = new BigDecimal("24691356");
        Assert.assertEquals(expectedPeople, totalPeople);
    }
}