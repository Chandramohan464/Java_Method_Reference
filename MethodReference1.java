//Reference to a Static Method
interface Sayable{
    void say();
}

public class MethodReference1 {
    public static void saySomething(){
        System.out.println("Hello there!");
    }

    public static void main(String[] args) {
        Sayable sayable=MethodReference1::saySomething;
        sayable.say();
    }
}
