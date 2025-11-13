package com.atividade5.app;

import javax.swing.JOptionPane;

import com.atividade5.models.Imc;

public class App {
    public static void main(String[] args) throws Exception {
        Imc imc = new Imc();

        // array
        String[] opcoes = {"Valores Corporais", "Sair do programa."};
        Object opcao;

        do {
            // entrada dos dados
            opcao = JOptionPane.showInputDialog(
                null,
                "Selecione uma das opções:",
                "Cálculo do IMC",
                JOptionPane.INFORMATION_MESSAGE,
                null,
                opcoes,
                opcoes[0]
            );

            if ( opcao != "Sair do programa.") {
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
                imc.resultadoImc()
                );
            }
        } while( opcao != "Sair do programa.");
        
    }
}

// TODO: atividade 05:
/*
 * Recrie o programa do IMC, deta vez usando os conceitos de Orientação a Objetos, encapsulamento e
 * Interface Gráfica com JOptionPane.
 * O programa deverá ter a opção de sair.
 * Ao terminar, gere o executável.
 */