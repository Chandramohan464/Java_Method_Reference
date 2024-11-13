//Reference to a Static Method for predifined method

public class MethodReference2StaicPreDefinedMethod {
    public static void ThreadStatus(){
        System.out.println("Thread is running");
    }

    public static void main(String[] args) {
        Thread t=new Thread((MethodReference2StaicPreDefinedMethod::ThreadStatus));
        t.start();
    }
}
