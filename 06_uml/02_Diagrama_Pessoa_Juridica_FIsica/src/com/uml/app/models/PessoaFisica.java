package com.uml.app.models;

import java.time.LocalDate;
import java.util.Scanner;

public class PessoaFisica extends Pessoa{

    private String nome;
    private LocalDate dataNascimento;
    private String cpf;

    Scanner leia = new Scanner (System.in);

    //getters e setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Scanner getLeia() {
        return this.leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }


public PessoaFisica(String nome, LocalDate dataNascimento, String cpf, Scanner leia) {
    super(Pessoa);

    this.nome = nome;
    this.dataNascimento = dataNascimento;
    this.cpf = cpf;

    //entrada de dados

    System.out.println("Informe o seu nome: ");
    this.nome = leia.nextLine();

    System.out.println("Informe a data de nascimento (dd/MM/yyyy): ");
    this.dataNascimento = LocalDate.parse(leia.nextLine());

    System.out.println("Informe o seu cpf: ");
    this.cpf = leia.nextLine();

    //saída de dados

    System.out.println("Nome: " + nome);
    System.out.println("Data de nascimento: " + dataNascimento);
    System.out.println("CPF: " + cpf);

    leia.close();
    }
}
