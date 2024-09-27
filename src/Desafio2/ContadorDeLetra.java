package Desafio2;

import java.util.Scanner;

public class ContadorDeLetra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma letra: ");
        String input = sc.nextLine();

        int contador = 0;
        for (char c : input.toCharArray()) {
            if (c == 'a' || c == 'A') {
                contador++;
            }
        }

        System.out.println("A letra 'A' aparece " + contador + " vezes. ");

        sc.close();
    }
}
