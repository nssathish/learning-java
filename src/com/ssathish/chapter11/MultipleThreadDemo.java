package com.ssathish.chapter11;

class MultipleThread implements Runnable {

    Thread t;

    public MultipleThread(String threadName) {
        t = new Thread(this, threadName);
        System.out.println("Starting " + threadName + " thread");
        t.start();
    }
    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(t.getName() + " : " + i);
                Thread.sleep(300);
            }
        } catch (InterruptedException ie) {
            System.out.println(t.getName() + " thread interrupted");
        }
        System.out.println(t.getName() + " thread run completed");
    }
}
public class MultipleThreadDemo {
    public static void main(String[] args) {
        new MultipleThread("one");
        new MultipleThread("two");
        new MultipleThread("three");

        try {
            System.out.println("Starting main thread");
            for (int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ie) {
            System.out.println("Main thread interrupted");
        }
        System.out.println("Main thread completed");
    }
}
