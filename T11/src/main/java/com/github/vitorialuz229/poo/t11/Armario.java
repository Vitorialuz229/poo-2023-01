package main.java.com.github.vitorialuz229.poo.t11;

import java.util.ArrayList;
import java.util.List;

public class Armario {
    private List<Prateleira> prateleiras;

    public Armario() {
        prateleiras = new ArrayList<>();
    }

    public void adicionarPrateleira(Prateleira prateleira) {
        prateleiras.add(prateleira);
    }

    public List<Prateleira> getPrateleiras() {
        return prateleiras;
    }
}
