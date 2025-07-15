package com.bank;

import com.bank.models.entites.Account;

import java.math.BigDecimal;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Viewer viewer = new Viewer();

        viewer.showMessage("Inicializando o sistema bancário...");

        viewer.showMessage("\n--- Registro de Nova Conta ---");

        viewer.showMessage("Nome: ");
        String name = scanner.nextLine();

        viewer.showMessage("CPF: ");
        String cpf = scanner.nextLine();

        viewer.showMessage("Número de telefone: ");
        String numberCellPhone = scanner.nextLine();

        viewer.showMessage("Endereço: ");
        String adress = scanner.nextLine();


        viewer.showMessage("Tipo de conta (CORRENTE, POUPANÇA OU INVESTIMENTO): ");
        String typeAccount = scanner.nextLine().toUpperCase();

        Account account = new Account(name, cpf, numberCellPhone, adress, typeAccount);


        viewer.showMessage("Conta criada com sucesso!");


        int userOption;
        BigDecimal amount;

        while (true) {

            viewer.displayMenu();
            userOption = scanner.nextInt();

            switch (userOption) {
                case 1:
                    viewer.displayBalance(account);
                    continue;
                case 2:
                    viewer.showMessage("\nDigite o valor que deseja depositar:");
                    amount = scanner.nextBigDecimal();
                    account.deposit(amount);
                    continue;
                case 3:
                    viewer.showMessage("\nDigite o valor que deseja sacar:");
                    amount = scanner.nextBigDecimal();
                    account.withdrawn(amount);
                    continue;
                case 4:
                    viewer.displayDataAccount(account);
                    continue;
                case 0:
                    viewer.showMessage("...Finalizando sistema");
                    return;
                default:
                    viewer.showMessage("ERRO: Valor não listado");
            }
        }

       }

    }
