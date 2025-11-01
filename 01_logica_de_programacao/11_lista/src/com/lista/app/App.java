package com.lista.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancias
        Scanner leia = new Scanner(System.in);
        String[] nomes = new String[10]; // array

        // entrada de dados (imputs)
        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o " + (i+1) + "º nome: ");
            nomes[i] = leia.nextLine();
        }

        // saída de dados
        for (String nome : nomes) {
            System.out.println(nome);
        }


        // fecha o objeto leia
        leia.close();
    }
}
