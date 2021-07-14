package com.trepudox.collections.queue;

import com.trepudox.pessoa.Pessoa;
import com.trepudox.pessoa.PessoaFactory;

import java.util.LinkedList;
import java.util.Queue;

// Queue == Fila, First In First Out
public class LinkedListQueueRev {

    public static void main(String[] args) {
        Queue<Pessoa> queue = new LinkedList<>();

        queue.add(PessoaFactory.create("Marco", 19));
        queue.add(PessoaFactory.create("Amanda", 25));
        queue.add(PessoaFactory.create("Ronaldo", 20));
        queue.add(PessoaFactory.create("Jorge", 30));
        queue.add(PessoaFactory.create("Carol", 40));
        System.out.println(queue);

        // peek() retorna o primeiro elemento sem retirá-lo da fila
        System.out.println(queue.peek() + " " + queue.peek());

        // element() retorna o primeiro elemento sem retirá-lo da fila
        System.out.println(queue.element() + " " + queue.element());
        // a diferença entre o peek() e o element() é sobre o tratamento quando a fila está vazia, o peek() retornará
        // nulo, o element() lançará um NullPointerException


        // poll() retorna o primeiro elemento, retirando-o da fila
        System.out.println(queue.poll());

        // remove() retorna o primeiro elemento, retirando-o da fila
        System.out.println(queue.remove());
        // a diferença entre o poll() e o remove() é sobre o tratamento quando a fila está vazia, o poll() retornará
        // nulo, o remove() lançará um NullPointerException
    }

}
