package com.bank.models.entites;

import lombok.Data;

import java.math.BigDecimal;

@Data

public class Account {
    private String holdersName;
    private String cpf;
    private String numberCellphone;
    private String address;
    private BigDecimal balance = new BigDecimal(0);
    private String typeAccount;

    public Account() {
    }

    public Account(String titularName, String cpf, String numberCellphone, String address, String typeAccount) {
        this.holdersName = titularName;
        this.cpf = cpf;
        this.numberCellphone = numberCellphone;
        this.address = address;
        this.typeAccount = typeAccount;
    }

    public void deposit(BigDecimal amount){
        if (amount.signum() <= 0){
            throw new IllegalArgumentException("Valor deve ser maior que 0");
        }
        balance = balance.add(amount);
        System.out.println("Depósito feito com sucesso!");
    }

    public void withdrawn(BigDecimal amount){
        if (amount.compareTo(balance) > 0){
            throw new IllegalArgumentException("Valor de saque inválido");
        }
        if (amount.signum() < 0){
            throw new IllegalArgumentException("O valor não pode ser menor que 0");
        }
        balance = balance.subtract(amount);
        System.out.println("Saque feito com sucesso!");
    }
}
