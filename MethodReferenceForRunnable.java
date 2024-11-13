//Reference to an Instance Method with Runnable interface

public class MethodReferenceForRunnable {
    public void printMsg(){
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        Thread t=new Thread(new MethodReferenceForRunnable()::printMsg);
        t.start();
    }
}
