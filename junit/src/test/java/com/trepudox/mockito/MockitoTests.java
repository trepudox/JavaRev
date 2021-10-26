package com.trepudox.mockito;

import com.trepudox.pessoa.Pessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Optional;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class MockitoTests {

    @InjectMocks
    private PessoaService pessoaService;

    @Mock
    private PessoaRepository pessoaRepository;

    @Test
    void saveTest() {
        String nome = "Marco";
        int idade = 19;

        when(pessoaRepository.save(new Pessoa("Marco", 19))).thenReturn(new Pessoa("Marco", 19));

        System.out.println(pessoaService.save(new Pessoa(nome, idade)));
    }

    @Test
    void getByNomeTest() {
        String nome = "Marco";

        when(pessoaRepository.getByNome(anyString())).thenReturn(Optional.of(new Pessoa(nome, 19)));

        System.out.println(pessoaService.getPessoaByNome("aaqw"));
    }

}
