package com.trepudox.web.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class PessoaModel {

    private Long id;

    private String nome;

    private String dataNasc;

    private ProfissaoModel profissao;

}
