package com.ssathish.chapter11;

class ProducerConsumerThread implements Runnable {
    Thread t;
    public ProducerConsumerThread() {
        t = new Thread(this,"Producer");
        System.out.println("Starting production");
        t.start();
    }

    @Override
    public void run() {
        try {
            for(int i = 30; i > 0; i--) {
                System.out.println("Production left: " + i + "kg");
                Thread.sleep(300);
            }
        } catch (InterruptedException ie) {
            System.out.println("Production interrupted");
        }
        System.out.println("Production complete");
    }
}
public class ProducerConsumer {
    public static void main(String[] args) {
        new ProducerConsumerThread();
        try {
            for (int i = 30; i > 0; i--) {
                System.out.println("Consuming: " + i + "kg");
                Thread.sleep(500);
            }
        } catch (InterruptedException ie) {
            System.out.println("Consumption interrupted");
        }
        System.out.println("Consumption complete");
    }
}
