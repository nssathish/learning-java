package src.com.ssathish.chapter9.interfaces.StackDataStructure;

public class DynStackImp implements StackOp {
    private String stack[];
    private int top;

    DynStackImp(int size) {
        stack = new String[size];
        top = -1;
    }
    @Override
    public String pop() {
        if (top <= 0) {
            return "Stack underflow!!";
        }
        else {
            return stack[top--];
        }
    }

    @Override
    public void push(String docName) {
        if (top == stack.length-1) {
            System.out.println("Stack size doubled");
            String temp[] = new String[stack.length * 2];
            for (int i = 0; i < stack.length; ++i) {
                temp[i] = stack[i];
            }
            stack = temp;
        }
        stack[++top] = docName;
    }

    @Override
    public String peep() {
        if (top > 0 && top < stack.length) {
            return stack[top];
        }
        else {
            return "Stack empty";
        }
    }
}