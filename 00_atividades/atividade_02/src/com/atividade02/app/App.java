package com.atividade02.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         // atividade 2
        /*
         * Crie um programa que calcule a equação do 1º grau.
        */

        // scanner
        Scanner leia = new Scanner(System.in);

        // declaracao das variáveis
        int a;
        int b;
        int c;
        double delta;
        double x1;
        double x2;

        // imputs
        System.out.println("Insira o primeiro coeficiente (a): ");
        a = leia.nextInt();
        System.out.println("Insira o segundo coeficiente(b): ");
        b = leia.nextInt();
        System.out.println("Insira o terceiro coeficiente(c): ");
        c = leia.nextInt();

        delta = Math.pow(b, 2) - 4 * a * c;

        x1 = (-b) + Math.sqrt(delta) / 2 * a;

        x2 = (-b) - Math.sqrt(delta) / 2 * a;

        // saída de dados
        System.out.println("O seus resultados");


        // fecha o objeto leia
        leia.close();

    }
}
