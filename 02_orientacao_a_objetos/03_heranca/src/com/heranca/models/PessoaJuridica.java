package com.heranca.models;

public class PessoaJuridica extends Pessoa{

    // atributos exclusivos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;

    public PessoaJuridica(String email, String telefone, String razaoSocial, String nomeFantasia, String cnpj) {

        super(email, telefone);
        this.razaoSocial = razaoSocial;
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    public void exibirDados() {
        System.out.println("Nome fantasia: " + this.nomeFantasia);
        System.out.println("Razão social: " + this.razaoSocial);
        System.out.println("CNPJ: " + this.cnpj);
        super.exibirDados();
    }
}
