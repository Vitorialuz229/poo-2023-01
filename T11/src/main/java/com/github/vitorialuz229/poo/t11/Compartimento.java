package com.github.vitorialuz229.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Compartimento {
    private List<Objeto> objetos;

    public Compartimento() { 
        objetos = new ArrayList<>();
    }
    
    public List<Objeto> getObjetos() { 
        return objetos;
    }
}