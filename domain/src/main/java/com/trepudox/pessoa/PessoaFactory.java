package com.trepudox.pessoa;

public class PessoaFactory {

    private PessoaFactory() {}

    public static Pessoa create(String nome, int idade) {
        return new Pessoa(nome, idade);
    }

}
