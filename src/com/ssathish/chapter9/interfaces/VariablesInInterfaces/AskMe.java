package com.ssathish.chapter9.interfaces.VariablesInInterfaces;

public class AskMe implements SharedConstants {
    static void answer(int result) {
        switch (result) {
            case NO:
                System.out.println("Result is: 'NO'");
                break;
            case YES:
                System.out.println("Result is: 'YES'");
                break;
            case MAYBE:
                System.out.println("Result is: 'MAYBE'");
        }
    }

    public static void main(String[] args) {
        Question q = new Question();

        AskMe.answer(q.ask());
        AskMe.answer(q.ask());
    }
}
