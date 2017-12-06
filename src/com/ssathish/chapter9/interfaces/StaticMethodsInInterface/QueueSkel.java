package src.com.ssathish.chapter9.interfaces.StaticMethodsInInterface;

public interface QueueSkel {
    void enqueue(String name);
    String dequeue();
    String front();
    String back();
    static void clear() {
        System.out.println("Clear() implemented now in skel as static method");
    }
}
