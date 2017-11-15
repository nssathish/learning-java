package src.com.ssathish.chapter9.interfaces;

public class AnotherClient implements CustomCallBack {

    @Override
    public void callBack() {
        System.out.println("Anotherclient's callback..");
    }
}
