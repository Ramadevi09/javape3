package com.stackroute.pe3;

public class MyException {
    MyException(String message){
        message="number should be positive";
    }
    public String exceptionraising(int number)throws Exception{
        try{
            int sum=number/0;
        }
        catch (Exception arthemeticException){
            arthemeticException.printStackTrace();
        }
        finally {
            System.out.println("I will get printed");
        }
return "exception raised";
    }
}
