package entity;

import common.ContaConst;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Conta {
	private int agencia;
	private int numero;
	private double saldo;
	private Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = ContaConst.AGENCIA_PADRAO;
		this.numero = ContaConst.SEQUENCIAL++;
		this.cliente = cliente;
	}

	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
