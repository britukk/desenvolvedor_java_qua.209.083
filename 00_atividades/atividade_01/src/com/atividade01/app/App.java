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
        double cpf;
        String email;
        double telefone;

        // imputs

        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua data de nascimento: ");
        data_nasc = leia.nextLine();
        System.out.println("Informe seu cpf: ");
        cpf = leia.nextDouble();
        
        // limpeza de buffer
        leia.nextLine();

        System.out.println("Informe seu e-mail: ");
        email = leia.nextLine();
        System.out.println("Informe o seu telefone: ");
        telefone = leia.nextDouble();

        // Saída de dados
        System.out.println("Os seus dados são :");
        System.out.println("Nome: " + nome);
        System.out.println("Data de Nascimento: " + data_nasc);
        System.out.println("CPF: " + cpf);
        System.out.println("E-mail: " + email);
        System.out.println("Telefone: " + telefone);


        // fechando o scanner
        leia.close();
        // atividade 4
        /*
         * Crie um programa que receba do usuário: o nome e a idade.
         * Depois, exiba um menu com 5 filmes, suas respectivas salas de cinema e suas respectivas classificações indicativas.
         * O usuário deve escolher o filme, e se caso ele tiver a idade mínima para ver o filme, o programa imprime o ingreso e encerra. Caso o usuário não otenha a idade mínima, o programa bloqueia a entrada do usuário e exibe novamente os filmes.
         * Filmes em cartaz:
         * - Sala 1 - A Roda Quadrada - Livre
         * - Sala 2 - A Volta Dos Que Não Foram - 12 anos
         * - Sala 3 - Poeira em Alto Mar - 14 anos
         * - Sala 4 - As Tranças do Rei Careca - 16 anos
         * - Sala 5 - A Vingança do Peixe Frito - 18 anos
         */

        // fechando o scanner
        leia.close();
    }
}
