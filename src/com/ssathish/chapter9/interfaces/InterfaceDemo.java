package src.com.ssathish.chapter9.interfaces;

public class InterfaceDemo implements CustomCallBack {
    @Override
    public void callBack() {
        System.out.println("calling back here..!!");
    }

    public void doSomething() {
        System.out.println("Doing something here..!!");
    }
    public static void main (String[] args) {
//        InterfaceDemo id = new InterfaceDemo();
        CustomCallBack id = new InterfaceDemo();
//        id.docCount = 100; //cannot modify a final value...
        System.out.println("Doc count: " + id.docCount);
        id.callBack();
//        id.doSomething(); //this is not possible since "doSomething" is not
        // defined in CustomCallBack interface
        AnotherClient ac = new AnotherClient();
        ac.callBack();
    }
}
