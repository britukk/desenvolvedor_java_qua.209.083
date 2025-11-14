package com.bank.repository;

public interface IConta {
    // INTERFACE != CLASSES - APENAS POSSUI MÉTODOS, NÃO ATRIBUTOS; MÉTODOS NÃO SÃO CALCULÁVEIS, APENAS "CHAMADOS"
    public String consultarDados();
    public double depositar(double valor);
    public double sacar(double valor);
}
