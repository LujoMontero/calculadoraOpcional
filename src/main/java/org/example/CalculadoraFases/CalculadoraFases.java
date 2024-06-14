package org.example.CalculadoraFases;

public class CalculadoraFases {
    public int sumas(int a, int b) {
        int suma = a + b;
        return suma;
    }
    public int restas(int a, int b) {
        int resta = a - b;
        return resta;
    }
    public int multiplicaciones(int a, int b) {
        int multiplicacion = a * b;
        return multiplicacion;
    }
    public float divisiones(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("no se puede dividir por cero");
        }
        float division =(float) a / b;
        return division;
    }
}