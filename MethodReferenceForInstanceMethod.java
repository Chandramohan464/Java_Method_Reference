//Reference to an Instance Method
interface Sayable{
    void say();
}

public class MethodReferenceForInstanceMethod {
    public void saySomething(){
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        MethodReferenceForInstanceMethod obj = new MethodReferenceForInstanceMethod();
        Sayable sayable=obj::saySomething;
        sayable.say();
    }
}
