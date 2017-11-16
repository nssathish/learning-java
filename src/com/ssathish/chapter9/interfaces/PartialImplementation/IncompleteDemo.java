package com.ssathish.chapter9.interfaces.PartialImplementation;

import com.ssathish.chapter9.interfaces.PartialImplementation.Incomplete;

public class IncompleteDemo extends Incomplete {
    @Override
    public int height(String brand) {
        return 0;
    }

    @Override
    public int width(String brand) {
        return 0;
    }

    public static void main(String[] args) {
    }
}
