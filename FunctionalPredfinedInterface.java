//Reference to a Static Method for predefined functional interface
import java.util.function.BiFunction;

class Arithmetic{
    public static int add(int a, int b) {
        return a + b;
    }
}

public class FunctionalPredfinedInterface {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder=Arithmetic::add;
        System.out.println(adder.apply(10,20)); 
    }
}
