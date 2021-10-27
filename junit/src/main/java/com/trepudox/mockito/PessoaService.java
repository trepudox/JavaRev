package com.trepudox.mockito;

import com.trepudox.pessoa.Pessoa;
import lombok.RequiredArgsConstructor;

import java.util.Optional;

@RequiredArgsConstructor
public class PessoaService {

    private final PessoaRepository pessoaRepository;

    public Pessoa save(Pessoa p) {
        if (p.getNome() == null) {
            throw new PessoaException("Nome nulo!");
        }

        if (p.getIdade() < 0) {
            throw new PessoaException("Idade negativa!");
        }

        return pessoaRepository.save(p);
    }

    public Pessoa getPessoaByNome(String nome) {
        if (nome == null) {
            throw new PessoaException("Nome nulo!");
        }

        Optional<Pessoa> pessoa = pessoaRepository.getByNome(nome);

        return pessoa.orElseThrow(() -> new PessoaException("Pessoa não encontrada!"));
    }

}
