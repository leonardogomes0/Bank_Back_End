package com.bank.models.entites;


import lombok.Data;

@Data
public class Account {
    private String titularName;
    private String cpf;
    private String numberCellphone;
    private String adress;
    private double balance;
    private String typeAccount;

    public Account() {
    }

    public Account(String titularName, String cpf, String numberCellphone, String adress, String typeAccount) {
        this.titularName = titularName;
        this.cpf = cpf;
        this.numberCellphone = numberCellphone;
        this.adress = adress;
        this.typeAccount = typeAccount;
        this.balance = 0.0;
    }


    public void deposit(double amount){
        if (amount < 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
        balance += amount;
        System.out.println("Depósito feito com sucesso!");
    }

    public void withdrawn(double amount){
        if (amount > balance){
            throw new IllegalArgumentException("Valor de saque inválido");
        }
        if (amount < 0){
            throw new IllegalArgumentException("O valor não pode ser menor que 0");
        }
        balance -= amount;
        System.out.println("Saque feito com sucesso!");
    }
}
