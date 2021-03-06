package com.trepudox.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AssertThrowsTests {

    @Test
    void throwsTest() {
        Exception e = assertThrows(IllegalStateException.class, AssertThrowsTests::doesThrow);

        assertEquals("Mensagem esperada", e.getMessage());
    }

    @Test
    void doesNotThrowTest() {
        String str = assertDoesNotThrow(AssertThrowsTests::doesNotThrow);

        assertEquals("Mensagem esperada", str);
    }

    private static void doesThrow() {
        throw new IllegalStateException("Mensagem esperada");
    }

    private static String doesNotThrow() {
        return "Mensagem esperada";
    }

}
