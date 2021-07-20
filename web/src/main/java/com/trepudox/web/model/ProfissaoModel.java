package com.trepudox.web.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ProfissaoModel {

    private Long id;

    private String nome;

    private Double salario;

}
