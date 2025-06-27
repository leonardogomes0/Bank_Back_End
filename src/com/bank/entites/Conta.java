package com.bank.entites;

import com.bank.enums.TipoConta;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;
    private TipoConta tipoConta;

    public Conta(int  numeroConta, Cliente cliente, TipoConta tipoConta){
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    // Getters
    public int getNumeroConta(){
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public TipoConta getTipoConta() {
        return tipoConta;
    }

    //Setters
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


    public void setTipoConta(TipoConta tipoConta) {
        this.tipoConta = tipoConta;
    }

    //

}
