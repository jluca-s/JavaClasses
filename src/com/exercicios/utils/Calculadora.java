package com.exercicios.utils;

import java.util.HashMap;
import java.util.Map;

public class Calculadora {

    private Calculadora() {
    }

    // 1. Faça um Programa que peça dois números e imprima a soma.
    
    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int potencia(int a, int b) {
        return (int) Math.pow(a, b);
    }

    public static int raizQuadrada(int a) {
        return (int) Math.sqrt(a);
    }

    // 2. Faça um Programa que peça as 4 notas bimestrais e mostre a média.

    public static double mediaAritmetica(double[] numeros) {
        double soma = 0;
        for (double numero : numeros) {
            soma += numero;
        }
        return Math.round((soma / numeros.length) * 100.0) / 100.0;
    }

    // 3. Faça um Programa que converta metros para centímetros.

    public static double metrosToCentimetros(double metros) {
        return Math.round((metros * 100) * 100.0) / 100.0;
    }

    public static double centimetrosToMetros(double centimetros) {
        return Math.round((centimetros / 100) * 100.0) / 100.0;
    }

    // 4. Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.

    public static double areaCirculo(double raio) {
        return Math.round((Math.PI * Math.pow(raio, 2)) * 100.0) / 100.0;
    }

    // 5. Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

    public static double areaQuadradoDobrada(double lado) {
        return Math.round(((Math.pow(lado, 2)) * 2) * 100.0) / 100.0;
    }

    // 6. Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário no referido mês.

    public static double salario(double valorHora, double horasTrabalhadas) {
        return Math.round((valorHora * horasTrabalhadas) * 100.0) / 100.0;
    }

    // 7. Faça um Programa que peça a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.

    public static double fahrenheitToCelsius(double fahrenheit) {
        return Math.round(((fahrenheit - 32) * 5 / 9) * 100.0) / 100.0;
    }
    
    // 8. Faça um Programa que peça a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
    
    public static double celsiusToFahrenheit(double celsius) {
        return Math.round(((celsius * 9 / 5) + 32) * 100.0) / 100.0;
    }

    // 9. Faça um Programa que peça 2 números inteiros e um número real. Calcule e
    // mostre:
    // 1. o produto do dobro do primeiro com metade do segundo .
    // 2. a soma do triplo do primeiro com o terceiro.
    // 3. o terceiro elevado ao cubo.

    public static Map<String, Double> variosCalculos(int a, int b, double c) {
        Map<String, Double> resultados = new HashMap<>();
        resultados.put("(a * 2) * (b / 2)", Math.round(((a * 2) * ((double) b / 2)) * 100.0) / 100.0);
        resultados.put("(a * 3) + c", Math.round(((a * 3) + c) * 100.0) / 100.0);
        resultados.put("c ^ 3", Math.round((Math.pow(c, 3)) * 100.0) / 100.0);
        return resultados;
    }

    // 10. Tendo como dados de entrada a altura de uma pessoa, construa um
    // algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura)
    // - 58

    // 11. Tendo como dado de entrada a altura (h) de uma pessoa, construa um
    // algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
    // 1. Para homens: (72.7*h) - 58
    // 2. Para mulheres: (62.1*h) - 44.7

    public static double pesoIdeal(double altura, char sexo) {
        return Math.round((switch (sexo) {
            case 'M' -> (72.7 * altura) - 58;
            case 'F' -> (62.1 * altura) - 44.7;
            default -> 0;
        }) * 100.0) / 100.0;
    }

    // 12. João Papo-de-Pescador, homem de bem, comprou um microcomputador
    // para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um
    // peso de peixes maior que o estabelecido pelo regulamento de pesca do
    // estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo
    // excedente. João precisa que você faça um programa que leia a variável peso
    // (peso de peixes) e calcule o excesso. Gravar na variável excesso a
    // quantidade de quilos além do limite e na variável multa o valor da multa que
    // João deverá pagar. Imprima os dados do programa com as mensagens
    // adequadas.

    public static Map<String, Double> validarPesca(double peso) {
        Map<String, Double> resultado = new HashMap<>();
        if (peso > 50) {
            double excesso = peso - 50;
            double multa = excesso * 4;
            resultado.put("excesso", Math.round(excesso * 100.0) / 100.0);
            resultado.put("multa", Math.round(multa * 100.0) / 100.0);
        } else {
            resultado.put("excesso", 0.0);
            resultado.put("multa", 0.0);
        }
        return resultado;
    }

    // 13. Faça um programa para uma loja de tintas. O programa deverá pedir o
    // tamanho em metros quadrados da área a ser pintada. Considere que a
    // cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a tinta é
    // vendida em latas de 18 litros, que custam R$ 80,00. Informe ao usuário a
    // quantidades de latas de tinta a serem compradas e o preço total.

    public static Map<String, Double> tintaNecessaria(double area) {
        Map<String, Double> resultado = new HashMap<>();
        double litros = area / 3;
        double latas = Math.ceil(litros / 18);
        double preco = latas * 80;
        resultado.put("latas: ", Math.round(latas * 100.0) / 100.0);
        resultado.put("preco: ", Math.round(preco * 100.0) / 100.0);
        return resultado;
    }

    // 14. Faça um programa que peça o tamanho de um arquivo para download (em
    // MB) e a velocidade de um link de Internet (em Mbps), calcule e informe o
    // tempo aproximado de download do arquivo usando este link (em minutos).

    public static double tempoDownload(double tamanho, double velocidade) {
        return Math.round(((tamanho / velocidade) / 60) * 100.0) / 100.0;
    }
}
