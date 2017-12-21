package com.ssathish.chapter11.InterThreadCommunication;

class Q {
    int n;
    boolean isProduced = false;
    synchronized int get() {
        System.out.println("Got: " + n);
        this.isProduced = false;
        return n;
    }
    synchronized void put(int item) {
        System.out.println("Put: " + n);
        this.n = item;
        this.isProduced = true;
    }
}

class Producer implements Runnable {

    int item = 0;
    Q q = new Q();
    public Producer() {
        new Thread(this, "Producer").start();
    }
    @Override
    public void run() {
        while (true)
            q.put(item++);
    }
}

class Consumer implements Runnable {
    Q q = new Q();
    public Consumer () {
        new Thread(this,"Consumer").start();
    }
    @Override
    public void run() {
        while (true)
            q.get();
    }
}
public class InterThreadCommunication {
    public static void main(String[] args) {
        new Producer();
        new Consumer();
    }
}
