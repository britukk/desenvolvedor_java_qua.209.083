package com.contador.app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // scanner
        Scanner leia = new Scanner(System.in);

        // declarando as variáveis
        int n;


        // entrada de dados
        System.out.println("Informe o número inteiro a ser contado: ");
        n = leia.nextInt();

        // laço de repetição (loop)
        while(n >= 0){
            System.out.println(n);
            n--;
        }

        // fechando o objeto leia
        leia.close();
    }
}
