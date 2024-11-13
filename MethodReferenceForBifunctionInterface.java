//Reference to an Instance Method with BIFunction interface

import java.util.function.BiFunction;

class ArithmeticCalculation{
    public int add(int a,int b){
        return a+b;
    }
}

public class MethodReferenceForBifunctionInterface {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder=new ArithmeticCalculation()::add;
        System.out.println(adder.apply(10,20));
    }
}
