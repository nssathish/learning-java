package com.ssathish.chapter10.MyCustomException;

public class TakeCustomException {

    public static void main(String[] args) {
        try {
            throw new CustomException("wrong!! wrong!!");
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
