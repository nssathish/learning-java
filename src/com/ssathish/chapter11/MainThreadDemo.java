package com.ssathish.chapter11;

public class MainThreadDemo {
    public static void main(String[] args) {
        Thread t = new Thread();
        System.out.println("Thread name: " + t);
        t.setName("Main Thread");
        t.setPriority(1);
        System.out.println("After the name change: " + t);
        try {
            for (int i = 0; i < 10; ++i) {
                System.out.println(i);
                t.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.out.println("Caught interrupted exception");
        }
    }
}