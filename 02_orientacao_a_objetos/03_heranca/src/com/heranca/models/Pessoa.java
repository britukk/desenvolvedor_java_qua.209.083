package com.heranca.models;

public class Pessoa { // classe pai

    // atributos
    public String email;
    public String telefone;

    // construtor

    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    public void exibirDados() {
        System.out.println("E-mail: " + this.email);
        System.out.println("Telefone: " + this.telefone);
    }
}
