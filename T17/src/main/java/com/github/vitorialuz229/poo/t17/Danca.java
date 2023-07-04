package com.github.vitorialuz229.poo.t17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Danca<dancaMusicaMap> {
  private Musica musica; 
  private Map<String, String> dancaMusicaMap; 
  private Map<String, Integer> dancaInicioMap; 
  private Map<String, Integer> dancaFimMap; 
  private ArrayList<Pessoa> convidados[];

  public Danca() { 
    dancaMusicaMap = new HashMap<>(); 
    dancaInicioMap = new HashMap<>();
    dancaFimMap = new HashMap<>(); 
  }
}
