package com.github.vitorialuz229.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Prateleira {
    private List<Compartimento> compartimentos;

    public Prateleira() {
        compartimentos = new ArrayList<>();
    }

    public void adicionarCompartimento(Compartimento compartimento) {
        compartimentos.add(compartimento);
    }

    public List<Compartimento> getCompartimentos() {
        return compartimentos;
    }
}