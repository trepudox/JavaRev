package com.trepudox.collections.queue;

import com.trepudox.pessoa.Pessoa;
import com.trepudox.pessoa.PessoaFactory;

import java.util.PriorityQueue;
import java.util.Queue;

// a classe PriorityQueue organiza os elementos através de comparação, ordenando-os de forma crescente
public class PriorityQueueRev {

    public static void main(String[] args) {
        Queue<Pessoa> priorityQueue = new PriorityQueue<>();

        System.out.println(priorityQueue.poll());

        priorityQueue.add(PessoaFactory.create("Zenilda", 50));
        priorityQueue.add(PessoaFactory.create("Marco", 19));
        priorityQueue.add(PessoaFactory.create("Joao", 66));
        priorityQueue.add(PessoaFactory.create("Marco", 18));

        System.out.println(priorityQueue);

        System.out.println(priorityQueue.poll());
    }

}
