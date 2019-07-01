package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentMarksTest {
    StudentMarks studentMarks;
    @Before
    public  void setUp(){
        System.out.println("Before");
        studentMarks=new StudentMarks();
    }
    @After
    public void tearDown(){
        System.out.println("After");
        studentMarks=null;
    }
    @Test
    public void givenStudentGradesAsInputs(){
        String result=StudentMarks.studentGrades(new int[] {40,50,60,70});
        assertEquals("40506070",result);

    }
    @Test
    public void givenStudentGradesIsGraterThan100PrintErrMsg(){
        String result=StudentMarks.studentGrades(new int[] {40,50,60,170});
        assertEquals("405060grades should be 0to100",result);

    }
    @Test
    public void givenStudentGradesIslessthanZeroPrintErrMsg(){
        String result=StudentMarks.studentGrades(new int[] {-40,50,60,170});
        assertEquals("grades should be 0to1005060grades should be 0to100",result);

    }



}