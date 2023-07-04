package com.github.vitorialuz229.poo.t17;

public class Automovel {
  private String marca; 
  private String modelo; 
  private int ano; 
  private Pessoa motoristaAtual; 

   public Automovel(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motoristaAtual = null;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public Pessoa getMotoristaAtual() {
        return motoristaAtual;
    }

    public void setMotoristaAtual(Pessoa motorista) {
        this.motoristaAtual = motorista;
    }
}

