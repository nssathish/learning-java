package com.ssathish.chapter9.interfaces.MultiCatchExceptions;

public class MultipleCatchExceptDemo {
    public static void main(String[] args) {
        try {
            throw new ArrayIndexOutOfBoundsException("throwing null");
//            throw new NullPointerException("throwing null");
        } catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            System.out.println("which exception type chosen: " + e.toString());
        }
    }
}
