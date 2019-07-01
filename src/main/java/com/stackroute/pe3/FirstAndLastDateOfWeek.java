package com.stackroute.pe3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.text.DateFormat;



public class FirstAndLastDateOfWeek {
    public static boolean startDate() {
        Calendar c = Calendar.getInstance();

// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
       // System.out.println(df.format(c.getTime()));
        String s1 = df.format(c.getTime());
        if (s1.equals("Mon 01/07/2019"))
            return true;
        else
            return false;

    }

    public static boolean endDate() {
        Calendar c = Calendar.getInstance();
        String s2 = "";
// Set the calendar to monday of the current week
        c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);

        DateFormat df = new SimpleDateFormat("EEE dd/MM/yyyy");
        c.add(Calendar.DATE, 6);
        //  System.out.println( c.add(Calendar.DATE,1));
        s2 = (df.format(c.getTime()));
        if (s2.equals("Sun 07/07/2019"))
            return true;
        else
            return false;

    }
}

