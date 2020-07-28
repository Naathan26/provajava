package br.com.rd.rdves.main;

import br.com.rd.rdevs.model.Gerente;

public class TesteGerente {
    public static void main(String[] args) {

        Gerente g = new Gerente();
        g.setNome("Leo");
        g.setCpf("78945612333");
        g.setSalario(15000);
        System.out.println(g.bonificacao());
        }
}
