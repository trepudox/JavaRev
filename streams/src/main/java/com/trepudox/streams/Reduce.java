package com.trepudox.streams;

import com.trepudox.pessoa.Pessoa;
import com.trepudox.pessoa.PessoaFactory;

import java.util.stream.Stream;

public class Reduce {

    public static void main(String[] args) {
        reduceNumeros();
        System.out.println();
        reducePessoas();
    }

    private static void reduceNumeros() {
        Stream<Integer> numeros1 = Stream.of(1000, 50, 200, 100);
        Stream<Integer> numeros2 = Stream.of(1, 2, 3);

        Integer reduce1 = numeros1.reduce(0, (acc, num) -> acc + num);
        Integer reduce2 = numeros2.reduce(0, Integer::sum);

        System.out.println("numeros1: " + reduce1);
        System.out.println("numeros2: " + reduce2);
    }

    private static void reducePessoas() {
        Stream<Pessoa> pessoas = Stream.of(PessoaFactory.create("Marco", 19),
                PessoaFactory.create("Raúl", 21), PessoaFactory.create("Sônia", 60));

        Pessoa reduce = pessoas.reduce(PessoaFactory.create("", 0), (acc, pessoa) -> {
            acc.setNome(acc.getNome() + pessoa.getNome());
            acc.setIdade(acc.getIdade() + pessoa.getIdade());
            return acc;
        });

        System.out.println("pessoas: " + reduce);
    }

}
