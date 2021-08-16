package com.trepudox.jpa.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "pessoa")
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class PessoaModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    @Column(name = "data_nasc")
    private LocalDate dataNasc;

    @ManyToOne(optional = false)
    private ProfissaoModel profissao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        PessoaModel that = (PessoaModel) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 1795418818;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.nome + " " + (2021 - this.getDataNasc().getYear());
    }
}
