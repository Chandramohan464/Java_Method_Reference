//Reference to an Instance Method with BIFunction interface

import java.util.function.BiFunction;

class Arithmetic{
    public int add(int a,int b){
        return a+b;
    }
}

public class MethodReference7 {
    public static void main(String[] args) {
        BiFunction<Integer,Integer,Integer> adder=new Arithmetic()::add;
        System.out.println(adder.apply(10,20));
    }
}
