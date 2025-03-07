package com.exercicios.utils;

public class Menu {

    private Menu() {
    }

    public static void saudacao() {
        System.out.println("Bem vindo ao sistema de calculos");
        System.out.println("Escolha a opção desejada");
        System.out.println("Digite o numero correspondente");
    }
    
    
    public static void exibirMenu() {
        System.out.println("Escolha uma opção:");
        System.out.println("1. Operações matematicas");
        System.out.println("2. Converções");
        System.out.println("3. Calculos Corporais");
        System.out.println("4. Calculos Especificos");
        System.out.print("Opção: ");
    }

    public static void operacoesMatematicas() {
        System.out.println("Escolha uma opção");
        System.out.println("1. Somar dois numeros.");
        System.out.println("2. Media aritimetica");
        System.out.println("0. Voltar");
                
    }

    public static void conversoes() {
        System.out.println("Escolha uma opção");
        System.out.println("1. Converter de Celsius para Fahrenheit");
        System.out.println("2. Converter de Fahrenheit para Celsius");
        System.out.println("3. Converter de Metros para Centimetros");
        System.out.println("4. Converter de Centimetros para Metros");
        System.out.println("0. Voltar");
    }
    
    public static void calculosCorporais() {
        System.out.println("Escolha uma opção");
        System.out.println("1. Calcular IMC");
        System.out.println("2. Calcular Peso Ideal");
        System.out.println("0. Voltar");
    }

    public static void calculosEspecificos() {
        
    }


}
