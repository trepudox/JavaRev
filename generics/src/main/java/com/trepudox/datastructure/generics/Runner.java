package com.trepudox.datastructure.generics;

import com.trepudox.datastructure.generics.response.ErrorRev;
import com.trepudox.datastructure.generics.response.ResponseWithError;

public class Runner {

    public static void main(String[] args) {
        ErrorRev errorPadrao = new ErrorRev("Não encontrado", "404");
        ResponseWithError<Integer> r1 = new ResponseWithError<>(1, errorPadrao);
        ResponseWithError<String> r2 = new ResponseWithError<>("aaaa", errorPadrao);

        System.out.println(r1);
        System.out.println(r2);
    }

}
