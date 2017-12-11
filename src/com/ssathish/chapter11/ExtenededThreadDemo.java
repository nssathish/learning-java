package com.ssathish.chapter11;

import org.omg.PortableServer.THREAD_POLICY_ID;

class ExtendingThread extends Thread {
    public ExtendingThread() {
        super("Production Thread");
        System.out.println("Starting production thread");
        start();
    }

    @Override
    public void run() {
        try {
            for(int i = 1; i <= 30; i++) {
                System.out.println("Production left: " + i + "kg");
                Thread.sleep(300);
            }
        } catch (InterruptedException ie) {
            System.out.println("Production interrupted");
        }
        System.out.println("Production completed");
    }

}

public class ExtenededThreadDemo {
    public static void main(String[] args) {
        new ExtendingThread();

        try {
            for(int i = 30; i > 0; i--) {
                System.out.println("Consuming " + i + "kg");
                Thread.sleep(500);
            }
        } catch (InterruptedException ie) {
            System.out.println("Consumption interrupted");
        }
        System.out.println("Consumption completed");
    }
}
