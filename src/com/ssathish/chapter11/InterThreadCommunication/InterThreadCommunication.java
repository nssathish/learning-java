package com.ssathish.chapter11.InterThreadCommunication;

class Q {
    int n;
    boolean isConsumed = false;
    synchronized int get() {
        while (!isConsumed)
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println("Interrupted get process");
            }

        this.isConsumed = false;
        System.out.println("Got: " + n);
        notify();
        return n;
    }

    synchronized void put(int item) {
        while(isConsumed)
            try {
                wait();
            } catch (InterruptedException ie) {
                System.out.println("Interrupted put process");
            }

        this.n = item;
        this.isConsumed = true;
        System.out.println("Put: " + n);
        notify();
    }
}

class Producer implements Runnable {
    Q q ;

    public Producer(Q q) {
        this.q = q;
        new Thread(this, "Producer").start();
    }

    @Override
    public void run() {
        int item = 0;
        while (true) {
            q.put(item);
            item++;
        }
    }
}

class Consumer implements Runnable {
    Q q;

    public Consumer (Q q) {
        this.q = q;
        new Thread(this,"Consumer").start();
    }

    @Override
    public void run() {
        while (true) {
            q.get();
        }
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        Q q = new Q();
        new Producer(q);
        new Consumer(q);
    }
}