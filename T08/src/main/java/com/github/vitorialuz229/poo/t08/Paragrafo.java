import java.util.TreeSet;

public class Paragrafo {
    private TreeSet setencas = new TreeSet();

    public void novaSetenca(Setenca s) {
        setencas.add(s);
    }

    public Paragrafo(Setenca s) {
        setencas.add(s);
    }
}
