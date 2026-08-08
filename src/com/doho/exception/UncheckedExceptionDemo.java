package com.doho.exception;

public class UncheckedExceptionDemo {
    public static void main(String[] args) {
        Division demo = new Division();
        try {
            demo.devide("10", "10.5");
        } catch (Exception e) {
            System.out.println("enter the number in a correct format");
        }
    }
}
