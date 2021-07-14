package com.trepudox.collections.deque;

import com.trepudox.pessoa.Pessoa;
import com.trepudox.pessoa.PessoaFactory;

import java.util.LinkedList;
import java.util.Deque;

public class DequeRev {

    public static void main(String[] args) {
        Deque<Pessoa> deque = new LinkedList<>();

        deque.add(PessoaFactory.create("Amanda", 25));
        deque.add(PessoaFactory.create("Ronaldo", 20));
        deque.add(PessoaFactory.create("Jorge", 30));

        deque.addFirst(PessoaFactory.create("Carol", 40));
        deque.addLast(PessoaFactory.create("Marco", 19));

        System.out.println(deque);


        System.out.println("Primeiro: " + deque.getFirst());
        System.out.println("Último: " + deque.getLast());
    }

}
