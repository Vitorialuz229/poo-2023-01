package com.github.vitorialuz229.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Lanchonete {
    private ArrayList<Funcionario> funcionario;
    private Funcionario[] funcionarios;

    public Lanchonete() {
        funcionario = new ArrayList<Funcionario>();
    }

    public void contratarFuncionario(Funcionario funcionario) {
        funcionario.add(funcionario);
    }

    public List<Funcionario> getFuncionarios() {
        return funcionario;
    }

    public List<Funcionario> getGerentes() {
        List<Funcionario> gerentes = new ArrayList<>();
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.isGerente()) {
                gerentes.add(funcionario);
            }
        }
        return gerentes;
    }
}
