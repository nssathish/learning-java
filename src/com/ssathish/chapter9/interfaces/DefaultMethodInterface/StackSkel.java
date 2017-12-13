package com.ssathish.chapter9.interfaces.DefaultMethodInterface;

public interface StackSkel {
    void push(String name);
    String pop();
    String peep();
    default void clear() {
        System.out.println("Clear() not implemented for StackSkel");
    }
}
