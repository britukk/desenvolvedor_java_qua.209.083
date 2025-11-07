package com.heranca.models;

public class PessoaFisica extends Pessoa{ // classe filha

    // atributos exclusivos desta classe
    public String nome;
    public String cpf;
    public int idade;

    public PessoaFisica (String email, String telefone, String nome, String cpf, int idade) {

        super(email, telefone); // polimorfismo - é necessário deixar claro para o código que estes atributos pertencem a super classe
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Idade: " + this.idade);
        super.exibirDados();
    }
}
