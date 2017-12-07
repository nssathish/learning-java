package com.ssathish.chapter10;

public class ThrowExample {
    static void NullPtrExcept () {
        try {
            throw new NullPointerException("demo");
        } catch (NullPointerException ne) {
            System.out.println("null pointer demo: " + ne);
            throw ne;
        }
    }

    public static void main(String[] args) {
        try {
            NullPtrExcept();
        } catch (NullPointerException ne) {
            System.out.println("Caught NPE");
        }
    }
}
