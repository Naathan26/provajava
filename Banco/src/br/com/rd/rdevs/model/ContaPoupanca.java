package br.com.rd.rdevs.model;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(int numero, String titular) {
        super(numero, titular);
    }

	@Override
	public String getTipo() {
		return null;
	}

}

