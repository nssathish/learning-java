package com.ssathish.chapter10.MyCustomException;

public class CustomException extends Exception {

    String msg;
    public CustomException(String text) {
        msg = text;
    }

    @Override
    public String toString() {
        return "My custom exception message: " + msg;
    }
}
