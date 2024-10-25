//Reference to an Instance Method
interface Sayable{
    void say();
}

public class MethodReference5 {
    public void saySomething(){
        System.out.println("Hello, World!");
    }

    public static void main(String[] args) {
        MethodReference5 obj = new MethodReference5();
        Sayable sayable=obj::saySomething;
        sayable.say();
    }
}
