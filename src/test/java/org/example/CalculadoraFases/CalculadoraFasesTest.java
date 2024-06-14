package org.example.CalculadoraFases;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculadoraFasesTest {

    private CalculadoraFases calculadora;

        @Before
        public void setUp() {
            calculadora = new CalculadoraFases();
        }

        @Test
        public void testSumas() {
            int resultado = calculadora.sumas(2, 3);
            assertEquals("2 + 3 deberia ser 5", 5, resultado);
        }

        @Test
        public void testRestas() {
            int resultado = calculadora.restas(2, 3);
            assertEquals("2 - 3 deberia ser -1", -1, resultado);
        }

        @Test
        public void testMultiplicaciones() {
            int resultado = calculadora.multiplicaciones(6, 3);
            assertEquals("6 * 3 deberia ser 18", 18, resultado);
        }

        @Test
        public void testDivisiones() {
            float resultado = calculadora.divisiones(6, 3);
            assertEquals("6 / 3 deberia ser 2", 2.0, resultado, 0.0);
        }
    }