package com.bank;

import com.bank.models.entites.Account;
import lombok.Data;

@Data
public class Viewer {
    Account account = new Account();


    public Viewer(){}

    public void displayMenu(){
        showMessage("\n--- Bank Back-End ---");
        showMessage("1. Exibir Saldo");
        showMessage("2. Depositar");
        showMessage("3. Sacar");
        showMessage("0. Sair");
        showMessage("Escolha uma opção: ");
    }

    public void displayBalance(Account account){
        showMessage("""
                ----------------------
                    SALDO EM CONTA
                ---------------------    
                """ +
                "Titular:" + account.getTitularName() +
                "\nR$" + account.getBalance());
    }

    public void showMessage(String message){
        System.out.println(message);
    }
}
