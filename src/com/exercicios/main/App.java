package com.exercicios.main;
import com.exercicios.utils.Calculadora;

public class App {
    public static void main(String[] args) {

        // 1. Faça um Programa que peça dois números e imprima a soma.
        System.out.println(Calculadora.somar(10, 20));

        // 2. Faça um Programa que peça as 4 notas bimestrais e mostre a média.
        double[] notas = { 7.5, 8.0, 9.0, 6.5 };
        System.out.println(Calculadora.mediaAritmetica(notas));

        // 3. Faça um Programa que converta metros para centímetros.
        System.out.println(Calculadora.metrosToCentimetros(1.75));

        // 4. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        System.out.println(Calculadora.areaCirculo(5));        

    }
}
