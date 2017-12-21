package com.ssathish.chapter11;

class CallMeNow {
    void call (String msg) {
        System.out.print("[");
        try {
            Thread.sleep(1000);
            System.out.print(msg);
        } catch (InterruptedException ie) {
            System.out.println("Thread exec interrupted");
        }
        System.out.println("]");
    }
}

class NewThreadDepot implements Runnable {

    String threadName;
    CallMeNow callObj;
    Thread t;

    NewThreadDepot(CallMeNow cmn, String nameofThread) {
        callObj = cmn;
        threadName = nameofThread;
        t = new Thread(this, threadName);
        System.out.println("Thread: " + t);
        t.start();
    }
    @Override
    public void run() {
        synchronized (callObj) {
            callObj.call(threadName);
        }
    }
}

public class SynchStatementDemo {
    public static void main(String[] args) {
        CallMeNow cmn = new CallMeNow();
        NewThreadDepot ntd1 = new NewThreadDepot(cmn, "Hello");
        NewThreadDepot ntd2 = new NewThreadDepot(cmn,"Synchronized");
        NewThreadDepot ntd3 = new NewThreadDepot(cmn,"World");

        try {
            ntd1.t.join();
            ntd2.t.join();
            ntd3.t.join();
        } catch (InterruptedException ie) {
            System.out.println("Exception: " + ie);
        }
    }
}
