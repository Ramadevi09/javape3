package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {
    MatrixSum matrixSum;
    @Before
    public  void setUp(){
        System.out.println("Before");
        matrixSum=new MatrixSum();

    }
    @After
    public void tearDown(){
        System.out.println("After");


        matrixSum=null;
    }
    @Test
    public void sumOfMatrixElements(){
        int[][] result=MatrixSum.sumOfMatrixElements(new int[][] {{1,3},{2,4},{3,4}},new int[][] {{1,3},{2,4},{1,2}});
        assertArrayEquals(new int[][] {{2,6},{4,8},{4,6}},result);


    }
    @Test
    public void sumOfMatrixElementsIf_a_MatrixLengthIsZeroReturnZero(){
        int[][] result=MatrixSum.sumOfMatrixElements(new int[][] {{}},new int[][] {{1,3},{2,4},{1,2}});
        assertArrayEquals(new int[][] {},result);


    }
   /* @Test
    public void sumOfMatrixElements(){
        int[][] result=MatrixSum.sumOfMatrixElements(new int[][] {{1,3,4},{2,4,3},{3,4,5}},new int[][] {{1,3,4},{2,4,3},{1,2,4}});
        assertArrayEquals(new int[][] {{2,6,8},{4,8,6},{4,6,9}},result);


    }*/

}