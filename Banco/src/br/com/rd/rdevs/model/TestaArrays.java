package br.com.rd.rdevs.model;

public class TestaArrays {

	public static void main(String[] args) {
		Conta[] contas = new Conta[10];
		for (int i = 0; i < contas.length; i++) {
			Conta conta = new ContaCorrente();
			conta.depositar(i * 100.0);
				System.out.println(contas[i]);
			}
		}
	}
