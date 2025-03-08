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
        System.out.println("-----------------------------");
        System.out.println("Escolha uma opção:");
        System.out.println("1. Operações matematicas");
        System.out.println("2. Converções");
        System.out.println("3. Calculos Corporais");
        System.out.println("4. Calculos Especificos");
        System.out.println("0. Sair");
        System.out.println("Opção: ");
        System.out.println("-----------------------------");
    }
    
    public static void operacoesMatematicas() {
        System.out.println("-----------------------------");
        System.out.println("Operações matematicas:");
        System.out.println("1. Somar dois numeros.");
        System.out.println("2. Media aritimetica");
        System.out.println("3. Area de um circulo");
        System.out.println("0.  Voltar");                
        System.out.println("-----------------------------");
    }
    
    public static void conversoes() {
        System.out.println("-----------------------------");
        System.out.println("Converções:");
        System.out.println("1. Converter de Celsius para Fahrenheit");
        System.out.println("2. Converter de Fahrenheit para Celsius");
        System.out.println("3. Converter de Metros para Centimetros");
        System.out.println("4. Converter de Centimetros para Metros");
        System.out.println("0.  Voltar");
        System.out.println("-----------------------------");
    }
    
    public static void calculosCorporais() {
        System.out.println("-----------------------------");
        System.out.println("Calculos Corporais:");
        System.out.println("1. Calcular IMC");
        System.out.println("2. Calcular Peso Ideal");
        System.out.println("0. Voltar");
        System.out.println("-----------------------------");
    }
    
    public static void calculosEspecificos() {
        System.out.println("-----------------------------");
        System.out.println("Calculos Especificos:");
        System.out.println("1. Realizar varios calculos");
        System.out.println("2. Calcular area de um quadradado e mostrar o dobro");
        System.out.println("3. Calcular salario liquido");
        System.out.println("4. Velocidade media de download");
        System.out.println("5. Calcular a quantidade de tinta necessaria");
        System.out.println("6. Calcular excedente de peso de pesca");
        System.out.println("0. Voltar");
        System.out.println("-----------------------------");
    }


}
