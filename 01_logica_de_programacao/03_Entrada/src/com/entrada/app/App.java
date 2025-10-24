package com.entrada.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instância (criação) do objeto leia
        Scanner leia = new Scanner(System.in);

        // Declaração das variáveis

        String nome;
        int idade;
        double altura;
        String email;

        // Entrada de dados utilizando o scanner 
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();

        System.out.println("Informe sua idade: ");
        idade = leia.nextInt();

        System.out.println("Informe a sua altura: ");
        altura = leia.nextDouble();

        // Limpeza de buffer (Caso você faça um nextDouble ou nextInt antes do String, ele irá dar erro)
        leia.nextLine();

        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();

        // nextLine -> função do java para RECEBER o String
        // Note que cada variável recebe um next DIFERENTE para cada tipo diferente

        // Saída dos dados
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + "anos");
        System.out.println("Altura: " + altura + "metros");
        System.out.println("E-mail: " + email);

        // Fecha o objeto close
        leia.close();
    }
}
