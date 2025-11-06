package com.construtor.app;
import java.util.Scanner;
import com.construtor.models.Pessoa; // sempre colocar a classe específica que você irá utilizar, não use .* (programa fica pesado demais)

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);
        Pessoa usuario = new Pessoa("", "", "", "", 0);

        // entrada de dados
        System.out.println("Informe o seu nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o seu CPF: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o seu email: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe o seu telefone: ");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a sua idade: ");
        usuario.idade = leia.nextInt();
        
        // saída de dados
        System.out.println(usuario.apresentar());

        // fecha o objeto leia
        leia.close();
    }
}
