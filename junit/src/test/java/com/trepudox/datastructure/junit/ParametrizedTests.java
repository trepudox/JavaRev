package com.trepudox.datastructure.junit;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ParametrizedTests {

    private static List<String> stringValues() {
        return List.of("valor", "valor", "valor", "valor");
    }

    @ParameterizedTest(name = "Teste {index}")
    @MethodSource("stringValues")
    void teste1(String valorRetornado) {
        String valorEsperado = "valor";

        assertEquals(valorEsperado, valorRetornado);
    }

    @ParameterizedTest(name = "Teste {index}")
    @MethodSource("stringValues")
    void teste2(String valorRetornado) {
        String valorEsperado = "valor".toUpperCase();

        assertEquals(valorEsperado, valorRetornado.toUpperCase());
    }

}
