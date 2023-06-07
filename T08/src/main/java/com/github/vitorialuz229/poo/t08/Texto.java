package com.github.vitorialuz229.poo.t08;

import java.util.TreeSet;
import jakarta.websocket.Decoder.Text;

public class Texto {
   private TreeSet paragrafos = new TreeSet<>();

   public void novoParagrafo(Paragrafo c) {
      paragrafos.add(c);

   }

   public Texto(Paragrafo c) {
      paragrafos.add(c);
   }

}
