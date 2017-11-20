package src.com.ssathish.chapter9.interfaces.StackDataStructure;
public class StackImpDemo {
    public static void main(String[] args) {
        StackImp si = new StackImp(10);
        si.push("drivers license");
        si.push("voter id");
        si.push("Aadhaar id");

        System.out.println(si.pop());
        System.out.println(si.pop());
        System.out.println(si.peep());

        //Dynamic stack
        DynStackImp dsi = new DynStackImp(4);
        dsi.push("sathish");
        dsi.push("kumar");
        dsi.push("athena");
        dsi.push("health");
        dsi.push("network");
        System.out.println(dsi.peep());

    }
}
