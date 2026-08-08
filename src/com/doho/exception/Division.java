package com.doho.exception;

public class Division {
    public double devide(String num1,String num2)throws NumberFormatException,ArithmeticException
    {
        Integer n1 =Integer.parseInt(num1);
        Integer n2=Integer.parseInt(num2);
        return n1/n2;
    }

}
