package com.atividade5.app;

import javax.swing.JOptionPane;

import com.atividade5.models.Imc;

public class App {
    public static void main(String[] args) throws Exception {
        Imc imc = new Imc();

        // array
        String[] opcoes = {"Valores Corporais", "Sair do programa."};
        Object opcao;

        // laço de repetição
        do {
            opcao = JOptionPane.showInputDialog(
                null,
                "Selecione uma das opções:",
                "Cálculo do IMC",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );
            // verificar a opção do usuário
            if ( opcao == "Valores Corporais") {
            // entrada dos dados
                imc.setNome(
                    JOptionPane.showInputDialog(
                        "Informe o seu nome: "
                    )
                );
                imc.setAltura(
                        Double.parseDouble(
                            JOptionPane.showInputDialog(
                                "Informe a sua altura em metros: "
                            ).replace(",",".")
                        )
                    );
                imc.setPeso(
                        Double.parseDouble(
                            JOptionPane.showInputDialog(
                                "Informe o seu peso em kg: "
                            ).replace(",",".")
                        )
                    );

                // saída de dados

                JOptionPane.showMessageDialog(
                null,
                imc.getNome() + ", seu IMC é: " +
                String.format("%.2f", imc.calculoImc()) +
                ".\n" +
                imc.getNome() +
                imc.resultadoImc()
                );
            }
        } while( opcao != "Sair do programa.");
        
    }
}

// atividade 05:
/*
 * Recrie o programa do IMC, desta vez usando os conceitos de Orientação a Objetos, encapsulamento e
 * Interface Gráfica com JOptionPane.
 * O programa deverá ter a opção de sair.
 * Ao terminar, gere o executável.
 */