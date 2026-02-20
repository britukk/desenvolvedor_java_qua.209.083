package com.uml.app.models;

public class Usuario {

    private long idUsuario;
    private String nome;
    private int dataNascimento;
    private String email;
    private String login;
    private String senha;

    // getters e setters


    public long getIdUsuario() {
        return this.idUsuario;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNascimento() {
        return this.dataNascimento;
    }

    public void setDataNascimento(int dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return this.senha;
    }    

    public void setSenha(String senha) {
        this.senha = senha;
    }

    // métodos

    public String fazerLogin (String login, String senha) {
        return login;
    }

    public static void fazerLogoff(){
        return;
    }

}
