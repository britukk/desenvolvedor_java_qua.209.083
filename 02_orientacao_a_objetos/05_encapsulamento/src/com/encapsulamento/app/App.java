package com.encapsulamento.app;

import java.util.Scanner;

import com.encapsulamento.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia das classes
        Pessoa usuario = new Pessoa();
        Scanner leia = new Scanner(System.in);
        
        // atribuição de dados ( para fazer este encapsulamento, devemos fazer os gets e sets para conseguir fazer a atribuição de dados, não podemos simplesmente chegar e declarar String nome )
        System.out.println("Informe seu nome: ");
        usuario.setNome(leia.nextLine());
        System.out.println("Informe seu CPF: ");
        usuario.setCPF(leia.nextLine());
        System.out.println("Informe seu e-mail: ");
        usuario.setEmail(leia.nextLine());
        System.out.println("Informe sua idade: ");
        usuario.setIdade(leia.nextInt());

        // saída de dados
        System.out.println("\n---DADOS DO USUÁRIO---\n");
        System.out.println("Nome: " + usuario.getNome());
        System.out.println("CPF: " + usuario.getCpf());
        System.out.println("E-mail: " + usuario.getEmail());
        System.out.println("Idade: " + usuario.getIdade());

        // fechando o objeto leia
        leia.close();
    }
}
