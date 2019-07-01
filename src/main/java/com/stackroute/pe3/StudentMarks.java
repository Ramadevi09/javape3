package com.stackroute.pe3;

public class StudentMarks {
    public static String studentGrades(int[]grades){
        String result="";
        for(int i=0;i<grades.length;i++){
            if(grades[i]<=100 & grades[i]>0){
                result +=grades[i]+"";
               // return result;
            }
            else {
                result +="grades should be 0to100";
               // return result;
            }
        }
return result;
    }
}
