package com.abstracao.models;

final public class Carro extends Veiculo {
    // atributos
    public boolean motorEletrico;
    public boolean motorFlex;
    public boolean motorDiesel;
    public boolean motorGasolina;
    public boolean motorEtanol;

    public Carro () {
    }

    public void exibirDados() {
        super.exibirDados();
        if (motorEletrico == true) {
            System.out.println("Motor: Elétrico.");
        }
        if(motorDiesel == true) { // NÃO USAR ELSE IF -- SÃO DUAS ESTRUTURAS DIFERENTES, NÃO SE CONECTAM
            System.out.println("Motor: Óleo Diesel.");
        }
        if(motorFlex == true) {
            System.out.println("Motor: Flexível.");
        }
        if(motorGasolina == true) {
            System.out.println("Motor: Gasolina.");
        }
        if(motorEtanol == true) {
            System.out.println("Motor: Etanol.");
        }
    }

}
