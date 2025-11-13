package com.atividade5.models;

public class Imc {
    // atributos
    private String nome;
    private String resultado;
    private double peso;
    private double altura;
    private double imc;

    // construtor
    public Imc () {
    
    };

    // métodos get e set
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getImc() {
        return this.imc;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public String getResultado() {
        return this.resultado;
    }

    public void setResultado(String resultado) {
        this.resultado = resultado;
    }

    public double calculoImc() {
        this.imc = this.peso / (Math.pow(this.altura, 2));
        return this.imc;
    }

    // métodos do imc
    public String resultadoImc () {
        return (this.imc <= 18.5) ? " está abaixo do peso":
        (this.imc <= 25) ? " está no peso ideal":
        (this.imc <= 30) ? " está acima do peso":
        (this.imc <= 35) ? " está obeso" :
        (this.imc <= 40) ? " está com obesidade severa":
        "está com obesidade mórbida";
    }
}
