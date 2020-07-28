package br.com.rd.rdves.main;

import br.com.rd.rdevs.model.Cliente;
import br.com.rd.rdevs.model.Conta;
import br.com.rd.rdevs.model.ContaCorrente;
import br.com.rd.rdevs.model.ContaPoupanca;

public class TesteConta {
    public static void main(String[] args) {
        Cliente c1 = new Cliente();
        c1.setNome("Nathan");
        c1.setCpf("12312312312");
        c1.setProfissao("Dev");

        Conta cc1 = new ContaCorrente(80209, "Nathan");
        cc1.depositar(100);
        cc1.sacar(50);
        System.out.println(cc1.getSaldo());

        Cliente c2 = new Cliente();
        c2.setNome("Leo");
        c2.setCpf("11122233365");
        c2.setProfissao("Um monte de coisa");

        Conta cc2 = new ContaPoupanca(32659, "Leo");
        cc2.depositar(500);
        cc2.sacar(100);
        System.out.println(cc2.getSaldo());

        cc2.transferir(100, cc1);
        System.out.println(cc1.getSaldo());
        System.out.println(cc2.getSaldo());

        System.out.println(Conta.getIdentificador());
    }
}
