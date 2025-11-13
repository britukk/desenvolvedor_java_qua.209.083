package com.atividade5.models;

public class Imc {

    private String nome;
    private String resultado;
    private double peso;
    private double altura;
    private double imc;

    public Imc () {

    };

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
        return (this.imc = this.peso / Math.pow(this.altura, 2));
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

    // output
    public String resultadoImc () {
        return (
        this.resultado = (this.imc < 18.5) ? nome + " está abaixo do peso e seu imc é " + this.imc + ".":
        (this.imc < 25) ? nome + " está no peso ideal e seu imc é " + this.imc + ".":
        (this.imc < 30) ? nome + " está acima do peso e seu imc é " + this.imc + ".":
        (this.imc < 35) ? nome + " está obeso e seu imc é " + this.imc :
        (this.imc < 40) ? nome + " está com obesidade nível 2 e seu imc é " + this.imc + ".":
        "está com obesidade mórbida e seu imc é " + this.imc + "."
        );
    }
}
