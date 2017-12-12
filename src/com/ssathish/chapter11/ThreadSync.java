package com.ssathish.chapter11;

import jdk.nashorn.internal.codegen.CompilerConstants;

class CallMe {
    //void call(String msg) {
    synchronized void call(String msg) {
        try {
            System.out.print("[");
            Thread.sleep(1000);
            System.out.print(msg);
        } catch (InterruptedException ie) {
            System.out.println("Thread interrupted");
        }
        System.out.println("]");
    }
}

class NewThread implements Runnable {
    String msg;
    CallMe callIt;
    Thread t;
    NewThread (CallMe cm, String nameofThread) {
        callIt = cm;
        msg = nameofThread;
        t = new Thread(this,nameofThread);
        System.out.println("New thread: " + t);
        t.start();
    }
    @Override
    public void run() {
        callIt.call(msg);
    }
}
public class ThreadSync {
    public static void main(String[] args) {
        CallMe cm = new CallMe();
        NewThread hello = new NewThread(cm,"Hello");
        NewThread synch = new NewThread(cm,"Synchronized");
        NewThread world = new NewThread(cm,"World");
        try {
            hello.t.join();
            world.t.join();
            synch.t.join();
        } catch (InterruptedException ie) {
            System.out.println("Thread exec interrupted");
        }

    }
}
