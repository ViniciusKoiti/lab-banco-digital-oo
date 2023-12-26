package service;

import entity.Conta;

public abstract class ContaService implements  IContaService {
    @Override
    public void sacar(Conta contaSacada, double valor) {
        contaSacada.setSaldo(contaSacada.getSaldo() - valor);
    }

    @Override
    public void depositar(Conta contaDepositada,double valor) {
        contaDepositada.setSaldo(contaDepositada.getSaldo() + valor);
    }
    @Override
    public void transferir(Conta conta,double valor,Conta contaDestino) {
        this.sacar(conta, valor);
        this.depositar(contaDestino, valor);
    }


    @Override
    public abstract void imprimirExtrato();
}
