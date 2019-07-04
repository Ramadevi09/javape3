package com.stackroute.pe3;

import java.util.Arrays;

public class ConsecutiveCheck {
    //check given numbers are consecutive
    public static String consecutiveCheck(String arr) {
        String result="";
        if(arr==""){
            result ="enter string";
            //return result;
        }
//split the input string based on ','
String[] result1=arr.split(",");
        for (int i = 0; i <result1.length-1 ; i++) {
            //int[] differ=Integer.parseInt();

            int difference=Integer.parseInt(result1[i+1])-Integer.parseInt(result1[i]);
if(i<0){
    result +="values should not be nagative";
}
        else if (difference==1 || difference==-1) {


                result += "consecutive";
                return result;

            }

            else {

                result += "not consecutive";

                //break;
                return result;

            }

        }
        return result ;
    }
}