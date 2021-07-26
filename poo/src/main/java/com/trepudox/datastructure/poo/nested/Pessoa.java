package com.trepudox.datastructure.poo.nested;

import java.text.Collator;

public class Pessoa implements Comparable<Pessoa> {

    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return nome + ":" + idade;
    }

    @Override
    public int compareTo(Pessoa o) {
        int compareNome = Collator.getInstance().compare(this.nome, o.getNome());
        int compareIdade = Integer.compare(this.idade, o.getIdade());

        return compareNome == 0 ? compareIdade : compareNome;
    }

    class Filho {

        private String nome;

        public Filho(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }
    }

}