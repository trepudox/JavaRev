package com.trepudox.generics.function;

import com.trepudox.pessoa.Pessoa;

public class AnyDataType {

    public static void main(String[] args) {

        function("aaa");
        function(1);
        function(new Pessoa("Marco", 19));

    }

    private static <T> void function(T objeto) {
        System.out.println(objeto);
    }

}
