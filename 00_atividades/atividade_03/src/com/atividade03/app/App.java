package com.atividade03.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // atividade 3
        /*
         * Crie um programa que receba do usuário:
         * - Nome
         * - Peso em kg
         * - Altura em metros
         * E depois, calcule e exiba na tela o IMC.
         * Após exibir o IMC, exiba o diagnóstico de acordo com a tabela do IMC.
         */

        // scanner
        Scanner leia = new Scanner(System.in);

        // variáveis
        String nome;
        double peso;
        double altura;
        double imc;

        // imputs
        System.out.println("Insira o seu nome: ");
        nome = leia.nextLine();
        System.out.println("Insira o seu peso em kg: ");
        peso = leia.nextDouble();
        System.out.println("Insira a sua altura em metros: ");
        altura = leia.nextDouble();

        // calculo do imc

        imc = peso / Math.pow(altura,2);
        System.out.println("O seu imc será de: " + imc);

        // diagnóstico

        if (imc < 18.5){
            System.out.println("O diagnóstico de" + nome + " é de um intervalo ABAIXO do peso.");
        }
        else if(imc >= 18.5 && imc <= 25){
            System.out.println("O diagnóstico de " + nome + " é de um intervalo de peso NORMAL.");
        }

        else if(imc > 25){
            System.out.println("O diagnóstico de " + nome + " é de um intervalo de SOBREPESO.");
        }

        // fecha o objeto leia
        leia.close();
    }
}
