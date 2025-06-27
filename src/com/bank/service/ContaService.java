package com.bank.service;

import com.bank.entites.Cliente;
import com.bank.entites.Conta;

public class ContaService {

    public void atualizar(Conta conta, String novoEndereço, String novoNumeroDeTelefone){
        conta.getCliente().setEndereco(novoEndereço);
        conta.getCliente().setNumeroDeTelefone(novoNumeroDeTelefone);
        System.out.println("Dados atualizados com sucesso");
    }

    public void visualizarConta(Conta conta){
        System.out.println("===Dados da Conta ===");
        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Cliente: " + conta.getCliente().getNome());
        System.out.println("CPF: " + conta.getCliente().getCpf());
        System.out.println("Endereço: " + conta.getCliente().getEndereco());
        System.out.println("Telefone: " + conta.getCliente().getNumeroDeTelefone());
        System.out.println("Tipo de Conta: " + conta.getTipoConta());
        System.out.println("Saldo: R$" + conta.getSaldo());
    }
}
