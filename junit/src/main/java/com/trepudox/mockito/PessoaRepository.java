package com.trepudox.mockito;

import com.trepudox.pessoa.Pessoa;

import java.util.Optional;

public interface PessoaRepository {

    Pessoa save(Pessoa p);

    Optional<Pessoa> getByNome(String nome);

}
