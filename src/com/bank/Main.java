package com.bank;

import com.bank.models.entites.Account;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Inicializando o sistema bancário...");

        System.out.println("\n--- Registro de Nova Conta ---");

        System.out.print("Nome: ");
        String name = scanner.nextLine();

        System.out.print("CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Número de telefone: ");
        String numberCellPhone = scanner.nextLine();

        System.out.print("Endereço: ");
        String adress = scanner.nextLine();


        System.out.print("Tipo de conta (CORRENTE, POUPANÇA OU INVESTIMENTO): ");
        String typeAccount = scanner.nextLine().toUpperCase();

        Account account = new Account(name, cpf, numberCellPhone, adress, typeAccount);

        System.out.println("Conta criada com sucesso!");


        int userOption;
        double amount;

        while (true) {
            System.out.println("\n--- Bank Back-End ---");
            System.out.println("1. Exibir Saldo");
            System.out.println("2. Depositar");
            System.out.println("3. Sacar");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
             userOption = scanner.nextInt();
            switch (userOption) {
                case 1:
                    account.displayBalance();
                    continue;
                case 2:
                    System.out.println("\nDigite o valor que deseja depositar:");
                    amount = scanner.nextDouble();
                    account.deposit(amount);
                    continue;
                case 3:
                    System.out.println("\nDigite o valor que deseja sacar:");
                    amount = scanner.nextDouble();
                    account.withdrawn(amount);
                    continue;
                case 0:
                    return;
                default:
                    System.out.println("ERRO: Valor não listado");
            }
        }

       }

    }
