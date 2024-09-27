package Desafio1;

import java.util.Scanner;

public class FibonacciChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = sc.nextInt();

        int a = 0, b = 1, soma = 0;

        if (numero == 0 || numero == 1) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
            return;
        }

        while (soma < numero) {
            soma = a + b;
            a = b;
            b = soma;
        }

        if (soma == numero) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        sc.close();
    }
}
