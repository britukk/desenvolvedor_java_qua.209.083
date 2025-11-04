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
        String resultado;
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
        System.out.println("O seu imc será de: " + String.format("%.2f", imc));

        // diagnóstico

        /*
        if (imc < 18.5){
            System.out.println("O diagnóstico de" + nome + " é de um intervalo ABAIXO do peso.");
        }
        else if(imc >= 18.5 && imc <= 25){
            System.out.println("O diagnóstico de " + nome + " é de um intervalo de peso NORMAL.");
        }

        else if(imc > 25){
            System.out.println("O diagnóstico de " + nome + " é de um intervalo de SOBREPESO.");
        }
            */

        // refazendo e complementando o if else com TERNARIO (adição da variável resultado)
        resultado = (imc < 18.5) ? nome + " está abaixo do peso." :
        (imc < 25) ? nome + " está no peso ideal." :
        (imc < 30) ? nome + " está acima do peso." :
        (imc < 35) ? nome + " está obeso." :
        (imc < 40) ? nome + " está com obesidade nível 2." :
        "está com obesidade mórbida.";

        // exibe o resultado
        System.out.println(resultado);

        // fecha o objeto leia
        leia.close();
    }
}
