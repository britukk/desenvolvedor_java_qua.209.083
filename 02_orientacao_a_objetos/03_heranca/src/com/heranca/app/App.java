package com.heranca.app;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica();

        usuario.nome = "João Pedro";
        usuario.email = "joaopedro@gmail.com";
        usuario.telefone = "(61)9 9803-8596";
        usuario.cpf = "746.930.432-54";
        usuario.idade = 20;

        PessoaJuridica empresa = new PessoaJuridica();

        empresa.razaoSocial = "Brito LTDA";
        empresa.nomeFantasia = "BritoComp Systems";
        empresa.cnpj = "64.475.090/1437-35";
        empresa.email = "britocomp@org.com";
        empresa.telefone = "456-0909";

        System.out.println("\n----Informações do usuário----\n");
        System.out.println("Nome do usuário: " + usuario.nome);
        System.out.println("E-mail do usuário: " + usuario.email);
        System.out.println("Telefone do usuário: " + usuario.telefone);
        System.out.println("CPF do usuário: " + usuario.cpf);
        System.out.println("Idade do usuário: " + usuario.idade + " anos");

        System.out.println("\n----Informações da empresa----\n");
        System.out.println("Razão Social da Empresa: " + empresa.razaoSocial);
        System.out.println("Nome Fantasia da Empresa: " + empresa.nomeFantasia);
        System.out.println("CNPJ da Empresa: " + empresa.cnpj);
        System.out.println("E-mail da Empresa: " + empresa.email);
        System.out.println("Telefone da Empresa: " + empresa.telefone);

    }
}
