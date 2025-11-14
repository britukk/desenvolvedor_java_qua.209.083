package com.bank.app;

import javax.swing.JOptionPane;

import com.bank.models.Conta;

public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new Conta(null, null, "1234-5", "12345-6", 0.0);

        // array
        String[] opcoes = {
        "Consultar Dados",
         "Depositar",
         "Sacar",
         "Sair do Programa."
        };
        Object opcao;

        // entrada de dados
        cc.setTitular(JOptionPane.showInputDialog(
            "Informe o nome do titular da conta: "
            ));
        cc.setCpf(JOptionPane.showInputDialog(
            "Informe o CPF do titular da conta: "
            ));

            // TODO: Fazer o laço de repetição para terminar o código do banco.
    }
}
