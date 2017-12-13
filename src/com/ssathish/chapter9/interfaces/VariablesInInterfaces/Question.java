package com.ssathish.chapter9.interfaces.VariablesInInterfaces;

import java.util.Random;

public class Question implements SharedConstants {
    Random rand = new Random();

    int ask() {
        int prob = rand.nextInt();
        if (prob < 30) {
            return NO;
        }
        else if ((prob > 30) && (prob < 50)) {
            return YES;
        }
        else if ((prob > 60 && (prob < 80))) {
            return MAYBE;
        }
        return NEVER;
    }
}
