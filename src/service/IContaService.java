package service;

import entity.Conta;

public interface IContaService {

    void sacar(Conta contaSacada, double valor);

    void depositar(Conta contaDepositada,double valor);

    void transferir(Conta conta,double valor,Conta contaDestino);

    void imprimirExtrato();
}