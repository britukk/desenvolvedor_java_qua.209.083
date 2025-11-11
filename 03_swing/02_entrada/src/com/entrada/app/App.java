package com.entrada.app;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        
        // declaração de variáveis
        String nome;
        String resultado;
        int idade;

        // entrada de dados
        nome = JOptionPane.showInputDialog("Informe seu nome: ");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade:"));

        // saída de dados

        // para lembrar (sysout normal)

        /* 
         * JOptionPane.showMessageDialog(null, "Seu nome é " + nome + ".");
        */


        // verificando a maioridade através de um if else tradicional

        /*
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, nome + " é maior de idade.");
        }
        else {
            JOptionPane.showMessageDialog(null, nome + " é menor de idade.");
        }
        */
        

        // verificando a maioridade através de um operador ternário
        resultado = (idade >= 18) ? "é maior de idade" : "é menor de idade";

        // saída de dados do ternário
        JOptionPane.showMessageDialog(null, nome + " " + resultado + ".");
    }
}
