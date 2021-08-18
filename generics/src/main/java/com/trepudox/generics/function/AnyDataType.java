package com.trepudox.generics.function;

import com.trepudox.generics.response.Response;
import com.trepudox.pessoa.Pessoa;

public class AnyDataType {

    public static void main(String[] args) {

        function("aaa");
        function(1);
        function(new Pessoa("Marco", 19));

        function2("WA");

    }

    private static <T> void function(T objeto) {
        System.out.println(objeto);
    }

    private static <T> Response<T> function2(T data) {
        Response<T> response = new Response<>(data);
        System.out.println(response);
        return response;
    }

}
