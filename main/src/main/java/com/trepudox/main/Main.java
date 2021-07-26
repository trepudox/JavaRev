package com.trepudox.datastructure.main;

import com.trepudox.pessoa.Pessoa;
import com.trepudox.pessoa.PessoaFactory;

public class Main {

    public static void main(String[] args) {

        Pessoa p = PessoaFactory.create("Marco", 19);
        System.out.println(p);

    }

}
