package com.ssathish.chapter10;

public class ThrowsExceptionEx {
    static void ThrowsNpe() {
        try {
            throw new NullPointerException("Thrown");
        } catch (NullPointerException ne) {
            System.out.println("Null pointer exceptu " + ne);
            throw ne;
        } finally {
            System.out.println("Reached out to finally block");
        }
    }

    public static void main(String[] args) {
        ThrowsNpe();
    }
}
