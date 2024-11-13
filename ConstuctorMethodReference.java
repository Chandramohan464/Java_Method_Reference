//Reference to a Constructor
interface Messagable{
    Message getMessage(String msg);
}

class Message{
    Message(String msg){
        System.out.println(msg);
    }
}

public class ConstuctorMethodReference {
    public static void main(String[] args) {
        Messagable hello=Message::new;
        hello.getMessage("Hello");
    }
}
