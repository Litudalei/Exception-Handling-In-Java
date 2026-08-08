package com.doho.exception;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        Division d=new Division();
        try
        {
            double d1=d.devide("10","0");
            System.out.println(d1);
        }
        catch(ArithmeticException|NumberFormatException ex)
        {
            System.out.println("enter the number in valid format");
        }
    }
}
