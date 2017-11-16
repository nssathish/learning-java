package com.ssathish.chapter9.interfaces.CarSpecExample;

import com.ssathish.chapter9.interfaces.CarSpecExample.CarSpec;
import com.ssathish.chapter9.interfaces.CarSpecExample.Honda;

public class CarSpecDemo {
    public static void main(String[] args) {
        CarSpec cs = new Honda();
        System.out.println("heigth of Honda City: " + cs.height("City"));
        System.out.println("width of Honda City: " + cs.width("City"));
        cs.engine("City");
    }
}
