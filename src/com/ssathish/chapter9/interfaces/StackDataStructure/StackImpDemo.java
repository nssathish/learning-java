package src.com.ssathish.chapter9.interfaces.StackDataStructure;
public class StackImpDemo {
    public static void main(String[] args) {
        StackImp si = new StackImp(10);
        si.push("drivers license");
        si.push("voter id");
        si.push("Aadhaar id");

        System.out.println(si.peep());
        System.out.println(si.pop());
        System.out.println(si.peep());
        System.out.println(si.pop());
    }
}
