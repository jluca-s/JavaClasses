package com.exercicios.main;

import com.exercicios.utils.Calculadora;
import com.exercicios.utils.Menu;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        Menu.saudacao();

        while (continuar) {
            Menu.exibirMenu();
            int escolha = scanner.nextInt();

            switch (escolha) {
                case 1 -> operacoesMatematicas(scanner);
                case 2 -> conversoes(scanner);
                case 3 -> calculosCorporais(scanner);
                case 4 -> calculosEspecificos(scanner);
                case 0 -> {
                    continuar = false;
                    System.out.println("Saindo do programa...");
                }
                default -> System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }

    private static void operacoesMatematicas(Scanner scanner) {
        Menu.operacoesMatematicas();
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.println("Digite dois números para somar:");
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                System.out.println("Resultado: " + Calculadora.somar(a, b));
            }
            case 2 -> {
                System.out.println("Digite a quantidade de notas:");
                int quantidade = scanner.nextInt();
                double[] notas = new double[quantidade];
                System.out.println("Digite as notas:");
                for (int i = 0; i < quantidade; i++) {
                    notas[i] = scanner.nextDouble();
                }
                System.out.println("Média: " + Calculadora.mediaAritmetica(notas));
            }
            case 3 -> {
                System.out.println("Digite o raio do círculo:");
                double raio = scanner.nextDouble();
                System.out.println("Área do círculo: " + Calculadora.areaCirculo(raio));
            }
            case 0 -> {
                break;
            }
            default -> System.out.println("Opção inválida.");
        }
    }

    private static void conversoes(Scanner scanner) {
        Menu.conversoes();
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.println("Digite a temperatura em Celsius:");
                double celsius = scanner.nextDouble();
                System.out.println("Fahrenheit: " + Calculadora.celsiusToFahrenheit(celsius));
            }
            case 2 -> {
                System.out.println("Digite a temperatura em Fahrenheit:");
                double fahrenheit = scanner.nextDouble();
                System.out.println("Celsius: " + Calculadora.fahrenheitToCelsius(fahrenheit));
            }
            case 3 -> {
                System.out.println("Digite o valor em metros:");
                double metros = scanner.nextDouble();
                System.out.println("Centímetros: " + Calculadora.metrosToCentimetros(metros));
            }
            case 4 -> {
                System.out.println("Digite o valor em centímetros:");
                double centimetros = scanner.nextDouble();
                System.out.println("Metros: " + Calculadora.centimetrosToMetros(centimetros));
            }
            case 0 -> {
                break;
            }
            default -> System.out.println("Opção inválida.");
        }
    }

    private static void calculosCorporais(Scanner scanner) {
        Menu.calculosCorporais();
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.println("Digite sua altura em metros:");
                double altura = scanner.nextDouble();
                System.out.println("Digite seu peso em kg:");
                double peso = scanner.nextDouble();
                double imc = peso / (altura * altura);
                System.out.println("Seu IMC é: " + imc);
            }
            case 2 -> {
                System.out.println("Digite sua altura:");
                double altura = scanner.nextDouble();
                System.out.println("Digite seu sexo (M/F):");
                char sexo = scanner.next().toUpperCase().charAt(0);
                System.out.println("Peso ideal: " + Calculadora.pesoIdeal(altura, sexo));
            }
            case 0 -> {
                break;
            }
            default -> System.out.println("Opção inválida.");
        }
    }

    private static void calculosEspecificos(Scanner scanner) {
        Menu.calculosEspecificos();
        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1 -> {
                System.out.println("Digite dois números inteiros e um número real:");
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                double num3 = scanner.nextDouble();
                System.out.println("Resultados: " + Calculadora.variosCalculos(num1, num2, num3));
            }
            case 2 -> {
                System.out.println("Digite o lado do quadrado:");
                double lado = scanner.nextDouble();
                System.out.println("O dobro da área: " + Calculadora.areaQuadradoDobrada(lado));
            }
            case 3 -> {
                System.out.println("Digite seu salário por hora:");
                double valorHora = scanner.nextDouble();
                System.out.println("Digite suas horas trabalhadas no mês:");
                double horasTrabalhadas = scanner.nextDouble();
                System.out.println("Salário do mês: " + Calculadora.salario(valorHora, horasTrabalhadas));
            }
            case 4 -> {
                System.out.println("Digite o tamanho do arquivo (MB):");
                double tamanho = scanner.nextDouble();
                System.out.println("Digite a velocidade da internet (Mbps):");
                double velocidade = scanner.nextDouble();
                System.out.println("Tempo de download (minutos): " + String.format("%.2f", Calculadora.tempoDownload(tamanho, velocidade)));
            }
            case 5 -> {
                System.out.println("Digite a área a ser pintada (m²):");
                double area = scanner.nextDouble();
                System.out.println("Litros de tinta necessários: " + Calculadora.tintaNecessaria(area));
            }
            case 6 -> {
                System.out.println("Digite o peso do peixe (kg):");
                double pesoPeixe = scanner.nextDouble();
                System.out.println("Excesso de peso: " + Calculadora.validarPesca(pesoPeixe));
            }
            case 0 -> {
                break;
            }
            default -> System.out.println("Opção inválida.");
        }
    }
}
