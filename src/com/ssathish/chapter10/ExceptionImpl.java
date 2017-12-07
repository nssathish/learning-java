package com.ssathish.chapter10;

public class ExceptionImpl {
//    public static void main(String[] args) throws ArrayIndexOutOfBoundsException {
    public static void main(String[] args) {
        try {
            int cakes = 10;
            int people = 0;
            double share = cakes / people;
            int a[] = {1};
            a[42] = 5;
        } catch (ArithmeticException ae) {
            System.out.println("Division by 0 will lead to infinity");
        } catch (ArrayIndexOutOfBoundsException aiobe) {
            System.out.println("Array overflow");
        }
    }
}
