package src.com.ssathish.chapter9.interfaces.DefaultMethodInterface;

public class StackImpl implements StackSkel {
    int athleteCount;
    int top;
    String[] marathonReservation;
    public StackImpl (int athletes) {
        this.athleteCount = athletes;
        top = -1;
        marathonReservation = new String[athleteCount];
    }
    @Override
    public void push(String name) {
        if (top < marathonReservation.length) {
            marathonReservation[++top] = name;
        }
        else {
            System.out.println("Stack overflow");
        }
    }

    @Override
    public String pop() {
        if (top >= 0) {
            return marathonReservation[top--];
        }
        else {
            return "Stack underflow";
        }
    }

    @Override
    public String peep() {
        if (top >= 0) {
            return marathonReservation[top];
        }
        else {
            return "Stack empty";
        }
    }

    @Override
    public void clear() {
        System.out.println("Clear() not implemented in Stack implementation now");
    }
}
