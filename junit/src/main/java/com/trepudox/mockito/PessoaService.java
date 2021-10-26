package com.trepudox.mockito;

import com.trepudox.pessoa.Pessoa;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public Pessoa save(Pessoa p) {
        if (p.getNome() == null) {
            throw new IllegalArgumentException("Nome nulo!");
        }

        if (p.getIdade() < 0) {
            throw new IllegalArgumentException("Idade negativa!");
        }

        return pessoaRepository.save(p);
    }

    public Optional<Pessoa> getPessoaByNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("Nome nulo!");
        }

        return pessoaRepository.getByNome(nome);
    }

}
