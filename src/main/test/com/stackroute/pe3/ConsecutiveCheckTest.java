package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveCheckTest {
    ConsecutiveCheck consecutiveCheck;
    @Before
    public  void setUp(){
        System.out.println("Before");

        consecutiveCheck=new ConsecutiveCheck();

    }
    @After
    public void tearDown(){
        System.out.println("After");
        consecutiveCheck=null;

    }
    @Test
    public void checkGivenInputArrayIsConsecutive(){
        String result=ConsecutiveCheck.consecutiveCheck("47,46,45,44,43,42,41");
        assertEquals("consecutive",result);
    }
    @Test
    public void checkGivenInputArrayIsConsecutivePrintErrMsg(){
        String result=ConsecutiveCheck.consecutiveCheck("23,34,85,67,74,48,45");
        assertEquals("not consecutive",result);
    }
    @Test
    public void checkGivenInputArrayIsConsecutive1(){
        String result=ConsecutiveCheck.consecutiveCheck("");
        assertEquals("enter string",result);
    }

}