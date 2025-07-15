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
        showMessage("4. Dados da Conta");
        showMessage("0. Sair");
        showMessage("Escolha uma opção: ");
    }

    public void displayBalance(Account account){
        showMessage("""
                --------------------------
                    SALDO DISPONÍVEL
                --------------------------    
                """ +
                "Titular:" + account.getHoldersName() +
                "\nR$" + account.getBalance()
        );
    }

    public void displayDataAccount(Account account){
        showMessage("""
                --------------------------
                    DADOS DA CONTA
                --------------------------    
                """ +
                "Titular:" + account.getHoldersName() +
                "\nCPF:" + account.getCpf() +
                "\nNúmero de telefone:" + account.getNumberCellphone() +
                "\nEndereço:" + account.getAddress() +
                "\nTipo da Conta:" + account.getTypeAccount()
        );
    }


    public void showMessage(String message){
        System.out.println(message);
    }
}
