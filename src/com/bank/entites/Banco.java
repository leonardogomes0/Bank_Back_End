package com.bank.entites;

public class Banco {
    private String nomeBanco;


    public Banco(String nomeBanco){
        this.nomeBanco = nomeBanco;
    }

    public String getNomeBanco() {
        return nomeBanco;
    }

    public void setNomeBanco(String nomeBanco) {
        this.nomeBanco = nomeBanco;
    }
}
