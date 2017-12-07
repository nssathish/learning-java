package com.ssathish.chapter9.interfaces.StaticMethodsInInterface;

public class QueueImpl implements QueueSkel {
    int tableCount;
    int back;
    int front = 0;
    String[] tableReservation;

    public QueueImpl(int tables) {
        tableReservation = new String[tables];
        back = front;
    }

    @Override
    public void enqueue(String name) {
        if (back >= 0 && back < tableReservation.length) {
            tableReservation[back++] = name;
        }
        else if(back > tableReservation.length) {
            System.out.println("Queue overflow");
        }
        else {
            System.out.println("Queue underflow");
        }
    }

    @Override
    public String dequeue() {
        if (front <= back) {
            return tableReservation[front++];
        }
        return "Queue empty";
    }

    @Override
    public String front() {
        return tableReservation[front];
    }

    @Override
    public String back() {
        return tableReservation[back];
    }
}
