package src.main.java.com.github.vitorialuz229.poo.t07;

public class TestaSomaNaturais {
    public static long TestaSomaNaturais(int n) {
        int c = 1;
        long s = 0;
        while (c <= n) {
            s = s + c;
            c = c + 1;
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(somaNaturais(5));
    }
}