package com.github.vitorialuz229.poo.t11;

import java.util.ArrayList;

public class Compartimento {
    public int qtdLivro;
    public int qtdCD;
    public String livrosGuardados[];
    public String CdGuardados[];
    private Cd cd;

    private ArrayList<Livro[]> livro = new ArrayList<Livro[]>();

    String[] guardaLivro(Livro[] livro, int posicao) {
        livrosGuardados[posicao] = livro.nome;
        return livrosGuardados;

    }

}
