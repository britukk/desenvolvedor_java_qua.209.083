package com.alfandega.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia da classe scanner
        Scanner leia = new Scanner(System.in);

        // declaração das variáveis
        String nomePassageiro;
        String resultado;
        double valorTotal;

        // entrada dos dados
        System.out.println("Insira o nome do passageiro: ");
        nomePassageiro = leia.nextLine();
        System.out.println("Insira o valor total de sua bagagem em dólares: ");
        valorTotal = leia.nextDouble();

        // estrutura de decisao SEM o operador ternário


        /*
        if(valorTotal <= 1000) {
            System.out.println("Objeto de" + nomePassageiro + "liberado para entrega.");
        }
        else {
            System.out.println("Objeto de " + nomePassageiro + "retido na alfandega!");
        }
        */


        // operador ternário

        resultado = (valorTotal <= 1000) ? " está liberado para entrega!" : " está retido.";

        // mostrando o resultado
        System.out.println(nomePassageiro + resultado);

        // fechando o objeto leia
        leia.close();
    }
}
