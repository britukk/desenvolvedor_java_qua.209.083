package com.uml.app.models;

public class Pessoa {

    private long idPessoa;
    private String email;
    private String telefone;


    public long getIdPessoa() {
        return this.idPessoa;
    }

    public void setIdPessoa(long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Pessoa(long idPessoa, String email, String telefone) {
        this.idPessoa = idPessoa;
        this.email = email;
        this.telefone = telefone;
    }

}
