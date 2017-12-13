package com.ssathish.chapter9.interfaces.ExtensibleInterfaces;

public class WBookPro implements Laptop {
    @Override
    public void batteryBackUp() {
        System.out.println("Wbookpro's batter backup: 8 hrs");
    }

    @Override
    public void motherBoard() {
        System.out.println("Intel's core i5");
    }

    @Override
    public void physicalMemory() {
        System.out.println("RAM hardware provided is 8G");
    }
}
