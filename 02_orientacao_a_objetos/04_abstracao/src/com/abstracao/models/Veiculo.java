package com.abstracao.models;

abstract public class Veiculo {  // ABSTRACT = deixa a classe protegida - invisível para o resto do código / FINAL = deixa não extendível - não é possível herdá-la

    // atributos

    public String fabricante;
    public String modelo;
    public String ano;
    public String cor;
    public String placa;


    // construtor

    public Veiculo (String fabricante, String modelo, String ano, String cor, String placa) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.placa = placa;
    }

    public Veiculo() {
    }

    public void exibirDados () {
        System.out.println("Fabricante: " + this.fabricante);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ano: " + this.ano);
        System.out.println("Coloração: " + this.cor);
        System.out.println("Placa: " + this.placa);
    }
}
