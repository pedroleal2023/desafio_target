package Desafio3;

public class CalculandoSoma {
    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            SOMA += K;
            K++;
        }

        System.out.println("O valor da soma é: " + SOMA);
    }
}
