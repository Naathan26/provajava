package br.com.rd.rdevs.model;

public class ContaCorrente extends Conta {

    public ContaCorrente() {
        super(numero, getTitular());
    }

    @Override
    public boolean sacar(double valorSacado) {
        if (this.saldo < valorSacado && valorSacado < 0) {
            return false;
        } else {
            this.saldo = this.saldo - valorSacado - 0.10;
            return true;
        }
    }

    @Override
    public String getTipo() {
        return null;
    }

	@Override
	public int compareTo(Conta o) {
		// TODO Auto-generated method stub
		return 0;
	}
  }


