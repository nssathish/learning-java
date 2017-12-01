package com.ssathish.chapter9.interfaces.NestedInterfaceExample;
import com.ssathish.chapter9.interfaces.NestedInterfaceExample.A;

public class B implements A.build {
    @Override
    public void buildNote() {
        System.out.println("B's build note by using A.build");
    }
}
