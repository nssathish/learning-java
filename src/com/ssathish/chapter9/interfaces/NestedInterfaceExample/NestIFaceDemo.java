package com.ssathish.chapter9.interfaces.NestedInterfaceExample;
import com.ssathish.chapter9.interfaces.NestedInterfaceExample.A;

public class NestIFaceDemo implements A.build {
    @Override
    public void buildNote() {
        System.out.println("NestIfaceDemo's buildnote");
    }

    public static void main(String[] args) {
        A.build b = new B();
        b.buildNote();
        b = new NestIFaceDemo();
        b.buildNote();
    }
}
