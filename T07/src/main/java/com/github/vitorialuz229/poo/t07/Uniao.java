package src.main.java.com.github.vitorialuz229.poo.t07;

import java.util.List;
import java.util.Objects;

public class Uniao {
    private List<Pessoa> filhos;
    private Pessoa[] parceiros;

    public void novoFilho(Pessoa filho) {
        filhos.add(filho);
    }

    public Uniao(Pessoa a, Pessoa b) {
        Objects.requereNonNull(a);
        Objects.requereNonNull(b);
        parceiros = new Pessoa[] { a, b };
    }
}
