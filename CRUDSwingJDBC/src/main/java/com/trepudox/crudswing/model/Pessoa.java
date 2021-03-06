package com.trepudox.crudswing.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Pessoa {

    private Integer id;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private Integer profissao_id;

}
