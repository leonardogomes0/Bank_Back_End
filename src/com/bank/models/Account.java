package com.bank.models;

import com.bank.models.enums.TypeAccount;

public class Account {
    private int numberAccount;
    private double balance;
    private Client client;
    private TypeAccount typeAccount;

    public Account(int numberAccount, Client client, TypeAccount typeAccount) {
        this.numberAccount = numberAccount;
        this.balance = 0.0;
        this.client = client;
        this.typeAccount = typeAccount;
    }

    public void deposit(Account account, double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor inválido para depósito. O valor deve ser maior que 0.");
        }
        balance += valor;
        System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
    }

    public void sake(double value) {
        if (value <= 0) {
            throw new IllegalArgumentException("Valor inválido para saque. O valor deve ser maior que 0.");
        }
        if (value > balance) {
            throw new RuntimeException("Saldo insuficiente para saque.");
        }
        balance -= value;
        System.out.println("Saque de R$" + value + " realizado com sucesso.");
    }

    // Getters
    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBalance() {
        return balance;
    }

    public Client getClient() {
        return client;
    }

    public TypeAccount getTypeAccount() {
        return typeAccount;
    }

    //Setters
    public void setNumberAccount(int numeroConta) {
        this.numberAccount = numeroConta;
    }

    public void setClient(Client client) {
        this.client = client;
    }


    public void setTypeAccount(TypeAccount typeAccount) {
        this.typeAccount = typeAccount;
    }


}
