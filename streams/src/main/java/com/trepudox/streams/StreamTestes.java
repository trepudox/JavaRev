package com.trepudox.streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTestes {

    public static void main(String[] args) {
        List<String> lista = List.of("Marco", "Ricardo", "ENZO", "lucas", "katia");

//        Stream<String> stream = lista.stream();

//        System.out.println(
//                lista.stream().reduce("", (acc, e) -> {
//                    if (Character.isLowerCase(e.charAt(0))) {
//                        return acc;
//                    }
//
//                    return acc + e;
//                })
//        );

//        System.out.println(
//                lista.stream()
//                        .map(String::toLowerCase)
//                        .collect(Collectors.toList())
//        );
//
//        lista.stream().filter(e -> Character.isLowerCase(e.charAt(0)))
//                .forEach(System.out::println);

        System.out.println(
                lista.stream().filter(e -> e.contains("a"))
                        .flatMap(e -> Stream.of(separaElemento(e)))
                        .collect(Collectors.toList())
        );
    }

    private static String[] separaElemento(String s) {
        return new String[]{s, s.substring(3)};
    }

}
