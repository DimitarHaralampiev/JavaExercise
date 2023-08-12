package MethodRefference.Arithmetic;

import java.util.function.BiFunction;

public class Main {

    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> add = Arithmetic::add;
        int result = add.apply(10, 20);
        System.out.println(result);
    }
}
