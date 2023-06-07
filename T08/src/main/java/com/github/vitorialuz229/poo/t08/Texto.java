package com.github.vitorialuz229.poo.t08;

import java.util.TreeSet;

public class Texto {
    private TreeSet paragrafos = new TreeSet();

    public void novoParagrafo(Paragrafo p) {
        paragrafos.add(p);
    }

    public Texto(Paragrafo p) {
        paragrafos.add(p);
    }
}
