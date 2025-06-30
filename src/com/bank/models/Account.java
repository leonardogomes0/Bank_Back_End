package com.bank.models;

import com.bank.models.enums.TipoConta;

public class Conta {
    private int numeroConta;
    private double saldo;
    private Cliente cliente;
    private TipoConta tipoConta;

    public Conta(int numeroConta, Cliente cliente, TipoConta tipoConta) {
        this.numeroConta = numeroConta;
        this.saldo = 0.0;
        this.cliente = cliente;
        this.tipoConta = tipoConta;
    }

    public void depositar(Conta conta, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito. O valor deve ser maior que 0.");
        }
        saldo += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque. O valor deve ser maior que 0.");
        }
        if (valor > saldo) {
            throw new RuntimeException("Saldo insuficiente para saque.");
        }
        saldo -= valor;
        System.out.println("Saque de R$" + valor + " realizado com sucesso.");
    }

    // Getters
    public int getNumeroConta() {
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


}
