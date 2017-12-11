package com.ssathish.chapter11;

class ThreadAliveJoin implements Runnable {

    Thread t;
    String nameofThread;

    ThreadAliveJoin(String threadName) {
        nameofThread = threadName;
        t = new Thread(this,nameofThread);
        System.out.println(t.getName() + " is starting");
        t.start();
    }
    @Override
    public void run() {
        try {
            for(int i = 5; i > 0; i--) {
                System.out.println(t.getName() + ": " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException ie) {
            System.out.println("Thread " + t.getName() + " interrupted");
        }
        System.out.println("Thread " + t.getName() + " completed");
    }
}
public class ThreadExecImpl {
    public static void main(String[] args) {
        ThreadAliveJoin taj1 = new ThreadAliveJoin("one");
        ThreadAliveJoin taj2 = new ThreadAliveJoin("two");
        ThreadAliveJoin taj3 = new ThreadAliveJoin("three");

        System.out.println(taj1.t.getName() + " is alive? " + taj1.t.isAlive());
        System.out.println(taj2.t.getName() + " is alive? " + taj2.t.isAlive());
        System.out.println(taj3.t.getName() + " is alive? " + taj3.t.isAlive());

        try {
            System.out.println("Threads waiting to finish");

            taj1.t.join();
            taj2.t.join();
            taj3.t.join();
        } catch (InterruptedException ie) {
            System.out.println("Main thread interrupted");
        }

        System.out.println(taj1.t.getName() + " after the join() is alive? " + taj1.t.isAlive());
        System.out.println(taj2.t.getName() + " after the join() is alive? " + taj2.t.isAlive());
        System.out.println(taj3.t.getName() + " after the join() is alive? " + taj3.t.isAlive());
    }
}
