package com.trepudox.crudswing.model;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
public class Profissao {

    private Integer id;
    private String nome;
    private Double salario;

}
