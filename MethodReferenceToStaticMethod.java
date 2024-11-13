//Reference to a Static Method
interface Sayable{
    void say();
}

public class MethodReferenceToStaticMethod {
    public static void saySomething(){
        System.out.println("Hello there!");
    }

    public static void main(String[] args) {
        Sayable sayable=MethodReferenceToStaticMethod::saySomething;
        sayable.say();
    }
}
