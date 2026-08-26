package com.thread;

public class HelloThread2 implements Runnable {
    @Override
    public void run() {
        System.out.println("hello from thread class 2");
    }
}
