package com.trepudox.datastructure.optional;

import com.trepudox.pessoa.Pessoa;
import com.trepudox.pessoa.PessoaFactory;

import java.util.Optional;

public class Optional1 {

    public static void main(String[] args) {
        Optional<Pessoa> optionalNull = Optional.empty();
        Optional<Pessoa> optionalPessoa = Optional.of(PessoaFactory.create("Marco", 19));

        System.out.println(
                optionalNull.orElseGet(() -> new Pessoa("Marco", 19))
        );

        try {
            optionalNull.orElseThrow(() -> new ArithmeticException("Qualquer exception"));
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
        }

        optionalNull.get();
    }

}
