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
		System.out.printf("Titular: %s%n", this.cliente.getNome());
		System.out.printf("Agencia: %d%n", this.agencia);
		System.out.printf("Numero: %d%n", this.numero);
		System.out.printf("Saldo: %.2f%n", this.saldo);
	}
}
