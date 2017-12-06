package src.com.ssathish.chapter9.interfaces.DefaultMethodInterface;

public class ChennaiMarathon {
    public static void main(String[] args) {
        StackImpl ledger = new StackImpl(5);
        String[] participants = {
                "Sathish",
                "Ak",
                "Hari",
                "Raj",
                "Kumar"
        };
        System.out.println("What stack has!!");
        for (String contestant : participants
             ) {
            ledger.push(contestant);
            System.out.println(ledger.peep());
        }
        System.out.println();
        System.out.println(ledger.peep());
        System.out.println(ledger.pop());
        System.out.println(ledger.pop());
        System.out.println(ledger.peep());

        ledger.clear();
    }
}
