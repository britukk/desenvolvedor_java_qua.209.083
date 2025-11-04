package com.atividade01.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // atividade 1
        /*
         * Crie um programa que receba do usuário:
         * - Nome
         * - Data nascimento
         * - CPF
         * - E-mail
         * - Telefone
         * Exibe os dados na tela 
         */

        //  instancia da classe scanner
        Scanner leia = new Scanner(System.in);


        // declaracao das variáveis
        String nome;
        String data_nasc;
        String cpf;
        String email;
        String telefone;

        // imputs

        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua data de nascimento: ");
        data_nasc = leia.nextLine();
        System.out.println("Informe seu cpf: ");
        cpf = leia.nextLine();
        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();
        System.out.println("Informe o seu telefone: ");
        telefone = leia.nextLine();

        // Saída de dados
        System.out.println("Os seus dados são :");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + data_nasc);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);

        // fechando o scanner
        leia.close();
    }
}
