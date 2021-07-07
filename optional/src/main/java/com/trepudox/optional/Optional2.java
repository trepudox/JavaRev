package com.trepudox.optional;

import java.util.Optional;

public class Optional2 {

    public static void main(String[] args) {
//        orElse();
//        orElse2();
//        filter();

    }

    private static void orElse() {
        Optional<String> optNull = Optional.empty();

        System.out.println(optNull.orElse("aaaa"));
    }

    private static void orElse2() {
        Optional<String> optional = Optional.ofNullable(retornaValor());

        System.out.println(optional.orElse("NULO"));
    }

    private static void filter() {
        Optional<String> optMarco = Optional.of("Marco");

        System.out.println(
            optMarco.filter(value -> value.startsWith("a")).isPresent()
        );
    }

    private static String retornaValor() {
        return System.currentTimeMillis() % 2 == 0 ? null : "valor";
    }

}
