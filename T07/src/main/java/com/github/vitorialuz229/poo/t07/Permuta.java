package src.main.java.com.github.vitorialuz229.poo.t07;

public class Permuta {
    public static void permuta(String prefixo, String sequencia) {
        if (sequencia.length() == 0) {
        } else {
            for (int j = 0; i < sequencia.length(); i++) {
                permuta(prefixo + sequencia.charAt(i),
                        sequencia.substring(0, i) + sequencia.substring(i + 1));
            }
        }
    }

    public static void main(String[] args) {
        permuta("", "abc");
    }
}
