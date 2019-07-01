package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessboardTest {
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
    public void givenInputHasStringOfDigitsShouldPrintConsecutiveDigits() {
        String expected[][] = {{"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}, {"WW", "BB", "WW", "BB", "WW", "BB", "WW", "BB"}, {"BB", "WW", "BB", "WW", "BB", "WW", "BB", "WW"}};

        String[][] actual = Chessboard.display(8, 8);

        assertNotEquals("Following is chessPattern output", expected, actual);

    }

}