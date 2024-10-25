//Reference to an Instance Method with Runnable interface

public class MethodReference6 {
    public void printMsg(){
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        Thread t=new Thread(new MethodReference6()::printMsg);
        t.start();
    }
}
