package com.stackroute.pe3;

public class MyException {
    MyException(String message){
        message="number should be positive";
    }
    public static void main(String[]args)throws Exception{
        try{
          throw new Exception();
        }
        catch (Exception e){
            e.printStackTrace();
        }
        finally {
            System.out.println("I will get printed");
        }

    }
}
