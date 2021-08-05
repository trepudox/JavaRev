package com.trepudox.lambdas;

import com.trepudox.datastructure.lambdas.interfaces.PrintaString;
import com.trepudox.datastructure.lambdas.interfaces.IntegerCalculator;

public class Runner {

    public static void main(String[] args) {
//        fun1();
        fun2();
    }

    private static void fun1() {
        PrintaString impressora = System.out::println;

        impressora.print("aaa");
    }

    private static void fun2() {
        IntegerCalculator somar = (x, y) -> x + x;
        IntegerCalculator subtrair = (x, y) -> x - y;
        IntegerCalculator multiplicar = (x, y) -> x * x;
        IntegerCalculator dividir = (x, y) -> x / y;

        int x = 10;
        int y = 5;

        System.out.println(somar.calculate(x, y));
        System.out.println(subtrair.calculate(x, y));
        System.out.println(multiplicar.calculate(x, y));
        System.out.println(dividir.calculate(x, y));
    }

}
