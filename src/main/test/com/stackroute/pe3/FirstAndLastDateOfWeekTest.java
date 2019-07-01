package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FirstAndLastDateOfWeekTest {
    FirstAndLastDateOfWeek firstAndLastDateOfWeek;


    @Before
    public void setUp() {
        System.out.println("Inside setup");
        firstAndLastDateOfWeek=new FirstAndLastDateOfWeek();
    }

    @After
    public void tearDown() {
        System.out.println("Inside teardown");
        firstAndLastDateOfWeek=null;
    }

    @Test
    public void startDate() {
        //Arrange
        boolean expectedValue = true;
        //Act
        boolean actualValue = firstAndLastDateOfWeek.startDate();
        assertEquals(expectedValue, actualValue);
        assertNotNull(actualValue);
    }

    @Test
    public void endDate() {
        //Arrange
        boolean expectedValue1 = true;
        //Act
        boolean actualValue1 = firstAndLastDateOfWeek.endDate();
        assertEquals(expectedValue1, actualValue1);
        assertNotNull(actualValue1);
    }


}