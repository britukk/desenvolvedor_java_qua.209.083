// identação automática - alt + shift + f
package com.variaveis.app;

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Britochad";
        int idade = 20;
        double altura = 1.73;  //MELHOR NÃO USAR FLOAT, A NÃO SER Q SEJA VALOR MONETÁRIO ( so tem duas casas depois da vírgula!! )

        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Altura: " + altura + " metros");
    }
}
