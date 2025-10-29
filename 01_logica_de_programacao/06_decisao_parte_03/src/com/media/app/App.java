package com.media.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia da classe scanner
        Scanner leia = new Scanner(System.in);
        
        // declaração das variáveis
        String nome;
        double nota;
        
        
        // recebimento dos dados
        System.out.println("Informe seu nome: ");
        nome = leia.nextLine();
        System.out.println("Informe sua nota de 0 a 10: ");
        nota = leia.nextDouble();

        // aceitando apenas notas compatíveis
        if (nota >= 0 && nota <= 10) {

            // estrutura de decisao

            if (nota >= 7) {
                System.out.println(nome + " foi aprovado! Parabéns :D");
            }
            else if (nota >= 5) {
                System.out.println(nome + " está de recuperação!");
            }

            else {
                System.out.println(nome + " foi reprovado!! :(");
            }
        }

        // notas incompatíveis
    else {
            System.out.println("Nota inválida.");
        }


        // fechando o objeto leia
        leia.close();
    }
}
