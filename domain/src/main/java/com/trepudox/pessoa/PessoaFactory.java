package com.trepudox.factory;

import com.trepudox.pessoa.Pessoa;

public class PessoaFactory {

    private PessoaFactory() {}

    public static Pessoa create(String nome, int idade) {
        return new Pessoa(nome, idade);
    }

}
