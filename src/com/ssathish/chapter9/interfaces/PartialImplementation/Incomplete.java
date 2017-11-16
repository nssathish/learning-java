package com.ssathish.chapter9.interfaces.PartialImplementation;

import com.ssathish.chapter9.interfaces.CarSpecExample.CarSpec;

public abstract class Incomplete implements CarSpec {
    @Override
    public void engine(String brand) {
        if(brand.equalsIgnoreCase("Brio"))
            System.out.println("3000");
        else
            System.out.println("4400");
    }
}