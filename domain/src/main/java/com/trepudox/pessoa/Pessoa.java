package com.trepudox.pessoa;

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

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        Pessoa pessoa = (Pessoa) o;

        if (idade != pessoa.idade)
            return false;

        return nome != null && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        int result = nome != null ? nome.hashCode() : 0;
        result = 31 * result + idade;
        return result;
    }

}
