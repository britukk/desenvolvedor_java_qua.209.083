package com.heranca.app;

// classe Java importada
import java.util.Scanner;

// classes criadas por mim
import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {

        // instancias
        Scanner leia = new Scanner(System.in);

        PessoaFisica usuario = new PessoaFisica(
            null,
            null,
            null,
            null,
            0
        );

        PessoaJuridica empresa = new PessoaJuridica (
            null,
            null,
            null,
            null,
            null
        );

        // entrada de dados (usuario)
        System.out.println("Informe os dados do usuário: \n");
        System.out.println("Informe o nome: ");
        usuario.nome = leia.nextLine();
        System.out.println("Informe o CPF: ");
        usuario.cpf = leia.nextLine();
        System.out.println("Informe o e-mail: ");
        usuario.email = leia.nextLine();
        System.out.println("Informe o telefone: ");
        usuario.telefone = leia.nextLine();
        System.out.println("Informe a sua idade: ");
        usuario.idade = leia.nextInt();

        // limpeza de buffer
        leia.nextLine();

        // entrada de dados(empresa)
        System.out.println("\nInforme os dados da empresa\n");
        System.out.println("Informe a sua razão social: ");
        empresa.razaoSocial = leia.nextLine();
        System.out.println("Informe o nome fantasia: ");
        empresa.nomeFantasia = leia.nextLine();
        System.out.println("Informe o seu CNPJ: ");
        empresa.cnpj = leia.nextLine();
        System.out.println("Informe o e-mail: ");
        empresa.email = leia.nextLine();
        System.out.println("Informe o telefone: ");
        empresa.telefone = leia.nextLine();

        // saída de dados (usuario)
        System.out.println("\n----DADOS DO USUÁRIO----\n");
        usuario.exibirDados();
        System.out.println("\n----DADOS DA EMPRESA----\n");
        empresa.exibirDados();


        // fecha o objeto leia
        leia.close();

        /*  CODIGO ANTIGO (TROCAMOS)
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        usuario.nome = "João Pedro";
        usuario.email = "joaopedro@gmail.com";
        usuario.telefone = "(61)9 9803-8596";
        usuario.cpf = "746.930.432-54";
        usuario.idade = 20;



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

        */

    }
}
