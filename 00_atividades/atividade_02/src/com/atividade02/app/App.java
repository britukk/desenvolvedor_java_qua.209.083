package com.atividade02.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         // atividade 2
        /*
         * Crie um programa que calcule a equação do 1º grau. ( ax + b = 0 )
        */

        // scanner
        Scanner leia = new Scanner(System.in);

        // declaracao das variáveis
        double a;
        double b;
        double x;

        // imputs
        System.out.println("Insira o primeiro coeficiente (a): ");
        a = leia.nextDouble();
        System.out.println("Insira o segundo coeficiente(b): ");
        b = leia.nextDouble();

        // calculos
        if(a != 0){
            x = -b / a;
            // saída dos dados
            System.out.println("O resultado da sua equação será: " + x);
        }
        else {
            System.out.println("Não existe raíz real para a equação! Tente novamente.");
        }


        // fecha o objeto leia
        leia.close();
    }
}
