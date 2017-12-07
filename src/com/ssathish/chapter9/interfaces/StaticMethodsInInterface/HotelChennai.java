package com.ssathish.chapter9.interfaces.StaticMethodsInInterface;

public class HotelChennai {
    public static void main(String[] args) {
        QueueImpl reservation = new QueueImpl(10);

        reservation.enqueue("Seethu");
        reservation.enqueue("Sathish");
        reservation.enqueue("Kumar");
        System.out.println("First person booked the table: " + reservation.dequeue());
        System.out.println("Who is next in the queue: " + reservation.front());
        System.out.println(reservation.dequeue() + " has got the table");
        QueueSkel.clear();
    }
}
