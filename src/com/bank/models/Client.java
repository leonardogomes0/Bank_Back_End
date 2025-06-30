package com.bank.models;

import java.util.List;

public class Client {
    private String name;
    private String cpf;
    private String adress;
    private String numberCellphone;
    private List<Account> accounts;

    public Client(){}

    public Client(String name, String cpf, String numberCellphone, String adress, List<Account> accounts){
        this.name = name;
        this.cpf = cpf;
        this.numberCellphone = numberCellphone;
        this.adress = adress;
        this.accounts = accounts;
    }

    // Getters
    public String getNome() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public String getEndereco() {
        return adress;
    }

    public String getNumeroDeTelefone() {
        return numberCellphone;
    }
    public List<Account> getcontas(){
        return accounts;
    }

    // Setters
    public void setNome(String nome){
        this.name = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        this.adress = endereco;
    }

    public void setNumeroDeTelefone(String numeroDeTelefone){
        this.numberCellphone = numeroDeTelefone;
    }

    public void setContas(List<Account> accounts) {
        this.accounts = accounts;
    }

    @Override
    public String toString(){
        return "Cliente{" +
                "NOME='" + name + '\'' +
                ",CPF='" + cpf + '\'' +
                ",ENDEREÇO='" + adress + '\'' +
                ",NÚMERO DE TELEFONE='" + numberCellphone + '\'' +
                '}';
    }
}
