package com.kodilla.patterns.Strategy.social;

import com.kodilla.patterns.strategy.social.User;
import com.kodilla.patterns.strategy.social.Millenials;
import com.kodilla.patterns.strategy.social.ZGeneration;
import com.kodilla.patterns.strategy.social.YGeneration;
import com.kodilla.patterns.strategy.social.SnapchatPublisher;
import org.junit.Assert;
import org.junit.Test;

public class UserTestSuite {
    @Test
    public void testDefaultSharingStrategies() {
        //Given
        User steven = new Millenials("Steven Links");
        User john = new YGeneration("John Hemerald");
        User kodilla = new ZGeneration("Kodilla");

        //When
        String stevenShouldBe = steven.predict();
        System.out.println("Steven should be: " + stevenShouldBe);
        String johnShouldBe = john.predict();
        System.out.println("John should be : " + johnShouldBe);
        String kodillaShouldBe = kodilla.predict();
        System.out.println("Kodilla should be: " + kodillaShouldBe);

        //Then
        Assert.assertEquals("Facebook Publisher", stevenShouldBe);
        Assert.assertEquals("Twitter Publisher", johnShouldBe);
        Assert.assertEquals("Snapchat Publisher", kodillaShouldBe);
    }

    @Test
    public void testIndividualSharingStrategy() {
        //Given
        User steven = new Millenials("Steven Links");

        //When
        String stevenShouldBe = steven.predict();
        System.out.println("Steven should be: " + stevenShouldBe);
        steven.sharePost(new SnapchatPublisher());
        stevenShouldBe = steven.predict();
        System.out.println("Steven now should be: " + stevenShouldBe);

        //Then
        Assert.assertEquals("Snapchat Publisher", stevenShouldBe);
    }
}