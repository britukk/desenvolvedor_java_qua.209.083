package com.objeto.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa();

        // entrada de dados
        System.out.println("Informe o seu nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o seu cpf: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o seu e-mail: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe a sua idade: ");
        usuario.idade = leia.nextInt();
        System.out.println("Informe a sua altura em metros: ");
        usuario.altura = leia.nextDouble();

        // saída de dados
        usuario.exibirDados();
        
        // fecha o objeto leia
        leia.close();
    }
}