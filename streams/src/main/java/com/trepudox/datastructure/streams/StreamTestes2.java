package com.trepudox.datastructure.streams;

import com.trepudox.datastructure.pessoa.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTestes2 {

    private static final List<Pessoa> listaPessoas = new ArrayList<>();

    static {
        listaPessoas.add(new Pessoa("Marco", 19));
        listaPessoas.add(new Pessoa("Alex", 60));
        listaPessoas.add(new Pessoa("Carol", 44));
        listaPessoas.add(new Pessoa("Giulianne", 38));
        listaPessoas.add(new Pessoa("Rob", 26));
        listaPessoas.add(new Pessoa("Marcela", 101));
        listaPessoas.add(new Pessoa("Ana", 55));
        listaPessoas.add(new Pessoa("Osvaldoson", 82));
    }

    public static void main(String[] args) {

        System.out.println(
                listaPessoas.stream()
                .flatMap(e -> Stream.of(e.getIdade(), e.getIdade() * 2))
                .collect(Collectors.toList()));

    }

}
