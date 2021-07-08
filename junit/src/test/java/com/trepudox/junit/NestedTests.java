package com.trepudox.junit;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class NestedTests {

    @Nested
    class Categoria1 {

        @Test
        void teste1() {
            assertTrue(true);
        }

        @Test
        void teste2() {
            assertTrue(true);
        }

    }

    @Nested
    class Categoria2 {

        @Test
        void teste1() {
            assertTrue(true);
        }

        @Test
        void teste2() {
            assertTrue(true);
        }

    }

}
