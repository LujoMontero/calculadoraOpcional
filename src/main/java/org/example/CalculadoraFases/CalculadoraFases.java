package org.example.CalculadoraFases;

public class CalculadoraFases {
    public int sumas(int a, int b) {
        return a + b;
    }

    public int restas(int a, int b) {
        return a - b;
    }

    public int multiplicaciones(int a, int b) {
        return a * b;
    }

    public float divisiones(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("no se puede dividir por cero");
        }
        return (float) a / b;
    }
}