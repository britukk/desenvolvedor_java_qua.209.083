package com.tremfantasma.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

    Scanner leia = new Scanner(System.in);

    // declaração de variáveis

    String nome;
    double altura;
    int idade;

    // entrada de dados (imput)

    System.out.println("Informe o seu nome: ");
    nome = leia.nextLine();
    System.out.println("Informe a sua altura: ");
    altura = leia.nextDouble();
    System.out.println("Informe a sua idade: ");
    idade = leia.nextInt();

    // estrutura de decisão

    if(altura >= 1.5 && idade >= 14){
        System.out.println(nome + " pode entrar no trem!");
    }
    else {
        System.out.println(nome + " não pode entrar no trem! :(");
    }

    // fecha objeto scanner
    leia.close();
    }
}
