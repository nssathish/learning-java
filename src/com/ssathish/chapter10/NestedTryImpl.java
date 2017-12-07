package com.ssathish.chapter10;

public class NestedTryImpl {
    public static void main(String[] args) {
        try {
            int a[] = {1};
            try {
                int i = 0;
                i = i / i;
            } catch (ArrayIndexOutOfBoundsException be) {
                System.out.println("Out of bounds exception");
            }
            a[2] = 0;
        }
        catch(ArithmeticException ae) {
            System.out.println("Exception: " + ae);
        }
    }
}
