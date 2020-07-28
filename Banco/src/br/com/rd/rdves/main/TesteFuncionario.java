package br.com.rd.rdves.main;

import br.com.rd.rdevs.model.Diretor;
import br.com.rd.rdevs.model.Funcionario;
import br.com.rd.rdevs.model.Gerente;

public class TesteFuncionario {
    public static void main(String[] args) {

        Diretor funcionarioLeo = new Diretor();
        funcionarioLeo.setNome("Leo");
        funcionarioLeo.setCpf("12345678922");

        Gerente funcionarioNathan = new Gerente();
        funcionarioNathan.setNome("Nathan");
        funcionarioNathan.setCpf("12312312312");
        funcionarioNathan.setSenha(6845);

    }
}