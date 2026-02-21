package com.uml.app.models;

import java.time.LocalDate;
import java.util.Scanner;

public class PessoaJuridica extends Pessoa{

    private String razaoSocial;
    private String nomeFantasia;
    private String cnpj;

    Scanner leia = new Scanner (System.in);

    //getters e setters

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public Scanner getLeia() {
        return this.leia;
    }

    public void setLeia(Scanner leia) {
        this.leia = leia;
    }



public PessoaJuridica(String razaoSocial, String nomeFantasia, String cnpj) {
    super(Pessoa);

    this.razaoSocial = razaoSocial;
    this.nomeFantasia = nomeFantasia;
    this.cnpj = cnpj;

    //entrada de dados

    System.out.println("Informe sua razão social: ");
    this.razaoSocial = leia.nextLine();

    System.out.println("Informe o seu nome fantasia: ");
    this.nomeFantasia = leia.nextLine();

    System.out.println("Informe o seu cnpj: ");
    this.cnpj = leia.nextLine();

    //saída de dados

    System.out.println("Razão Social: " + razaoSocial);
    System.out.println("Nome fantasia: " + nomeFantasia);
    System.out.println("CNPJ: " + cnpj);

    leia.close();
    }
}
