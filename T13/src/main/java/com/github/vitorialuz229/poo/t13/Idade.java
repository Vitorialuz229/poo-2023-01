package com.github.vitorialuz229.poo.t13;
import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        // cria leitor
        Scanner scanner = new Scanner(System.in);

        // O valor lido pelo usuário vai para a
        // variavel idade
        int idade = scanner.nextInt();

        // Analisa a idade e imprime algo
        if (idade == 18) {
            System.out.println("Tem que se alistar");
        } else if (idade > 18) {
            System.out.println("Se alistou");
        } else
            System.out.println("Menor de idade");

    }
}

}
