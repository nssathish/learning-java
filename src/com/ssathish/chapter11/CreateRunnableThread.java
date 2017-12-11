package com.ssathish.chapter11;

class CreateThreadFromRunnable implements Runnable {

    Thread t;

    public CreateThreadFromRunnable() {
        t = new Thread(this, "Demo Thread");
        System.out.println("Child thread" + t);
        t.start();
    }

    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--) {
                System.out.println("child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException ie) {
            System.out.println("Child Thread interrupted!!");
        }

        System.out.println("Exiting child thread");
    }
}

public class CreateRunnableThread {
    public static void main(String[] args) {
        new CreateThreadFromRunnable();

        try {
            for(int i = 5; i > 0; i--) {
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
            System.out.println("Main Thread interrupted");
        }
        System.out.println("Main thread exiting");
    }
}