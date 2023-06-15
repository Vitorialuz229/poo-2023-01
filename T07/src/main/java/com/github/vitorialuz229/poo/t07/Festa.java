package com.github.vitorialuz229.poo.t07;

import java.util.TreeSet;

public class Festa {

    private TreeSet<Convidado> convidados = new TreeSet<>();

    private void novoConvidado(Convidado convidado) {
        convidados.add(convidado);
    }

    public Festa(Convidado c) {
        convidados.add(c);
    }
}
