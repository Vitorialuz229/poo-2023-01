package com.github.vitorialuz229.poo.t17;

public class Convidado {
  private String nome; 
  private boolean acompanhado; 

  public Convidado(String nome, boolean acompanhado) { 
    this.nome = nome; 
    this.acompanhado = acompanhado;

  }
  public String getNome() {
        return nome;
    }

    public boolean isAcompanhado() {
        return acompanhado;
    }
}
