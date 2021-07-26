package com.trepudox.datastructure.lambdas;

import com.trepudox.datastructure.pessoa.Pessoa;
import com.trepudox.datastructure.pessoa.PessoaFactory;

import java.util.function.*;

public class Runner2 {

    public static void main(String[] args) {
//        consumer();
        supplier();
//        predicate();
//        function();
//        biFunction();
        unaryOperator();
        binaryOperator();

    }

    private static void consumer() {
        Consumer<String> printaString = System.out::println;
        printaString.accept("STRING!");
    }

    private static void supplier() {
        Supplier<Pessoa> criaMarco = () -> PessoaFactory.create("Marco", 19);

        System.out.println(criaMarco.get());
    }

    private static void predicate() {
        Predicate<String> stringMaiorQue5 = s -> s.length() > 5;
        Predicate<String> stringIsNotEmpty = s -> !s.isEmpty();

        System.out.println(stringMaiorQue5.and(stringIsNotEmpty).test("testee"));

        System.out.println("Maçã: " + stringMaiorQue5.test("Maçã"));
        System.out.println("Banana: " + stringMaiorQue5.test("Banana"));
    }

    private static void function() {
        Function<String, Integer> stringEmInteger = Integer::valueOf;

        System.out.println(stringEmInteger.apply("10") + 20);
    }

    private static void biFunction() {
        BiFunction<String, Integer, String> stringConcatNumero = (str, num) -> str + String.valueOf(num);

        System.out.println(stringConcatNumero.apply("OI", 10));
    }

    private static void unaryOperator() {
        UnaryOperator<String> stringToUppercase = String::toUpperCase;

        System.out.println(stringToUppercase.apply("aaaaa"));
    }

    private static void binaryOperator() {
        BinaryOperator<String> somaDeString = (s1, s2) -> s1 + s2;
        BinaryOperator<String> somaDeString2 = String::concat;

        System.out.println(somaDeString2.apply(somaDeString.apply("a", "b"), "c"));
    }

}
