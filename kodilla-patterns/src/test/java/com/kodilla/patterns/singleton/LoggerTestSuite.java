package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.Test;

public class LoggerTestSuite {

    @Test
    public void testLog() {
        //Given
        //When
        Logger.getInstance().log("User login");
        //Then
        //do nothing
    }

    @Test
    public void testGetLastLog() {
        //Given
        //When
        String loginInfo = Logger.getInstance().getLastLog();
        System.out.println("Login info: " + loginInfo);
        //Then
        Assert.assertEquals("User login", loginInfo);
    }
}