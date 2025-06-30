package com.bank.models;

import java.util.List;

public class Cliente {
    private String nome;
    private String cpf;
    private String endereco;
    private String numeroDeTelefone;
    private List<Conta> contas;

    public Cliente(){}

    public Cliente(String nome, String cpf, String numeroDeTelefone, String endereco, List<Conta> contas){
        this.nome = nome;
        this.cpf = cpf;
        this.numeroDeTelefone = numeroDeTelefone;
        this.endereco = endereco;
        this.contas = contas;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getNumeroDeTelefone() {
        return numeroDeTelefone;
    }
    public List<Conta> getcontas(){
        return contas;
    }

    // Setters
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone){
        this.numeroDeTelefone = numeroDeTelefone;
    }

    public void setContas(List<Conta> contas) {
        this.contas = contas;
    }

    @Override
    public String toString(){
        return "Cliente{" +
                "NOME='" + nome + '\'' +
                ",CPF='" + cpf + '\'' +
                ",ENDEREÇO='" + endereco + '\'' +
                ",NÚMERO DE TELEFONE='" + numeroDeTelefone + '\'' +
                '}';
    }
}
