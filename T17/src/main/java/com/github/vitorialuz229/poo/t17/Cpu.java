package com.github.vitorialuz229.poo.t17;

public class Cpu {
    private Memoria memoria;

    public Cpu(Memoria memoria) {
        this.memoria = memoria;

    }

    public void processar() {
        System.out.println("CPU processando");
        memoria.acessar();
    }
}
