package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia class Scanner
        Scanner leia = new Scanner(System.in);

        // declaração das variáveis
        double x;
        double y;
        double resultado;
        String operador;

        // imputs

        System.out.println("Insira o primeiro número (X): ");
        x = leia.nextDouble();
        System.out.println("Insira o segundo número (Y): ");
        y = leia.nextDouble();

        // limpeza de buffer
        leia.nextLine();

        // menu (gui)

        System.out.println("Selecione uma das opções de operação:");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        operador = leia.nextLine();

        // switch case para receber diferentes entradas

        switch (operador) {

            case "1":
                resultado = x+y;
                System.out.println("O valor da soma será: " + resultado);
                break;

            case "2":
                resultado = x-y;
                System.out.println("O valor da subtração será: " + resultado);
                break;

            case "3":
                resultado = x*y;
                System.out.println("O valor da multiplicação será: " + resultado);
                break;

            case "4":
                resultado = x/y;
                System.out.println("O valor da divisão será: " + resultado);
                break;

            default:
                System.out.println("Opção inválida.");

        }
        // shift + alt + seta para baixo -- duplica a parte selecionada logo abaixo

        // fecha o objeto leia
        leia.close();
    }
}
