package com.abstracao.app;

import java.util.Scanner;

import com.abstracao.models.Carro;
import com.abstracao.models.Moto;

public class App {
    public static void main(String[] args) throws Exception {

        // instancia do objeto de entrada de dados ( scanner )
        Scanner leia = new Scanner(System.in);

        // instancia das classes
        Carro carro = new Carro();
        Moto moto = new Moto();

        // declaração de variáveis
        String combustivel;

        // entrada de dados para o carro
        System.out.println("\n--INFORME OS DADOS DO CARRO--\n");
        System.out.println("Informe o fabricante: ");
        carro.fabricante = leia.nextLine();
        System.out.println("Informe o modelo: ");
        carro.modelo = leia.nextLine();
        System.out.println("Informe a cor: ");
        carro.cor = leia.nextLine();
        System.out.println("Informe o ano do carro: ");
        carro.ano = leia.nextLine();
        System.out.println("Informe a placa do carro: ");
        carro.placa = leia.nextLine();

        // padrões de combustível para o motor
        carro.motorFlex = false;
        carro.motorEletrico = false;
        carro.motorDiesel = false;
        carro.motorGasolina = false;
        carro.motorEtanol = false;

        // informando o tipo de combustível
        System.out.println("\nInforme o tipo de combustível:\n");
        System.out.println("1 - Gasolina");
        System.out.println("2 - Etanol.");
        System.out.println("3 - Tanto Gasolina quanto Etanol");
        System.out.println("4 - Diesel");
        System.out.println("5 - Elétrico");


        combustivel = leia.nextLine();

        // definindo o combustível

        switch (combustivel) {
            case "1":
            carro.motorGasolina = true;
            System.out.println("Certo, seu motor é movido à Gasolina.");
                break;
            case "2":
            carro.motorEtanol = true;
            System.out.println("Certo, seu motor é movido a Etanol.");
            case "3":
            carro.motorFlex = true;
            System.out.println("Certo, seu motor é um flex.");
                break;
            case "4":
            carro.motorDiesel = true;
            System.out.println("Certo, seu motor é movido a Diesel.");
                break;
            case "5":
            carro.motorEletrico = true;
            System.out.println("Certo, seu motor é movido a eletricidade.");
                break;
            default:
            System.out.println("Motor inexistente");
        }

        // entrada de dados para a moto
        System.out.println("\n--INFORME OS DADOS DA MOTO--\n");
        System.out.println("Informe o fabricante: ");
        moto.fabricante = leia.nextLine();
        System.out.println("Informe o modelo: ");
        moto.modelo = leia.nextLine();
        System.out.println("Informe a cor: ");
        moto.cor = leia.nextLine();
        System.out.println("Informe o ano do carro: ");
        moto.ano = leia.nextLine();
        System.out.println("Informe a placa do carro: ");
        moto.placa = leia.nextLine();


        // saída de dados
        System.out.println("/n====DADOS DO CARRO:====/n");
        System.out.println("                       ____________________                              \r\n" + //
                        "                     //|           |        \\                            \r\n" + //
                        "                   //  |           |          \\                          \r\n" + //
                        "      ___________//____|___________|__________()\\__________________      \r\n" + //
                        "    /__________________|_=_________|_=___________|_________________{}    \r\n" + //
                        "    [           ______ |           | .           | ==  ______      { }   \r\n" + //
                        "  __[__        /##  ##\\|           |             |    /##  ##\\    _{# }_ \r\n" + //
                        " {_____)______|##    ##|___________|_____________|___|##    ##|__(______}\r\n" + //
                        "             /  ##__##                              /  ##__##        \\   ");
        carro.exibirDados();

        System.out.println("/n====DADOS DA MOTO====/n");
        System.out.println("                                                  \r\n" + //
                        "                          __  __                  \r\n" + //
                        "                                \\               \r\n" + //
                        "                                  --  __          \r\n" + //
                        "                              ##########          \r\n" + //
                        "      ##################################          \r\n" + //
                        "    ##################################            \r\n" + //
                        "                  ##################    --        \r\n" + //
                        "    ============  ####################==  ======  \r\n" + //
                        "  ====        ====  ################==  ||    ====\r\n" + //
                        "  ==            ==    ##########  ==    ||      ==\r\n" + //
                        "  ==      ======    ##########  ====    ||      ==\r\n" + //
                        "  ==      ======    ########    ====            ==\r\n" + //
                        "  ==            ==                ==            ==\r\n" + //
                        "  ====        ====                ==        ====\r\n" + //
                        "    ============                    ===========");
        moto.exibirDados();


        /* PROVANDO A ABSTRAÇÃO
        Veiculo veiculo = new Veiculo (
            null,
            null,
            null,
            null,
            null
        ); */


        // fecha o objeto close
        leia.close();
    }
}
