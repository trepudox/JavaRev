package com.trepudox.lambdas;

import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Runner2 {

    public static void main(String[] args) {
        consumer();

    }

    private static void consumer() {
        Consumer<String> printaString = System.out::println;
        printaString.accept("STRING!");
    }

    private static void predicate() {

    }

    private static void function() {

    }

    private static void biFunction() {
        BiFunction<String, Integer, String> stringConcatNumero = (str, num) -> str + String.valueOf(num);
    }

}
