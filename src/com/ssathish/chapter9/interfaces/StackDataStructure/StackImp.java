package com.ssathish.chapter9.interfaces.StackDataStructure;
import com.ssathish.chapter9.interfaces.StackDataStructure.StackOp;

class StackImp implements StackOp {

    private String stack[];
    private int top;

    StackImp (int stackSize) {
        top = -1;
        stack = new String[stackSize];
    }

    @Override
    public void push (String docName) {
        if (top < stack.length) {
            stack[++top] = docName;
            System.out.println("successfully pushed!!");
        }
        else {
            System.out.println("Stack filled!!");
        }
    }

    @Override
    public String pop () {
        if (top < 0) {
            return "Stack empty!!";
        }
        else {
            return stack[top--];
        }
    }

    @Override
    public String peep () {
        if (top >= 0) {
            return stack[top];
        }
        else {
            return "Stack Empty!!";
        }
    }

}