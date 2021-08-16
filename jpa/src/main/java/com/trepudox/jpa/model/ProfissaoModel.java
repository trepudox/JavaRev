package com.trepudox.jpa.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "profissao")
@Builder
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
public class ProfissaoModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

    private Double salario;

    @OneToMany(mappedBy = "profissao", cascade = CascadeType.ALL)
    private List<PessoaModel> pessoas;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ProfissaoModel that = (ProfissaoModel) o;

        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return 495592502;
    }

    @Override
    public String toString() {
        return this.id + ". " + this.nome + " " + this.salario;
    }
}
