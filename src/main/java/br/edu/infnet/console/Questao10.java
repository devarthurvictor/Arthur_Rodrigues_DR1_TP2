package br.edu.infnet.console;

import java.util.Random;
import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1;
        int palpite;

        System.out.println("--- Jogo de Adivinhação ---");
        System.out.println("Tente adivinhar o número entre 1 e 100!");

        do {
            System.out.print("Digite seu palpite: ");
            palpite = input.nextInt();

            if (palpite > numeroSecreto) {
                System.out.println("Muito alto! Tente um número menor.");
            } else if (palpite < numeroSecreto) {
                System.out.println("Muito baixo! Tente um número maior.");
            } else {
                System.out.println("Parabéns! Você acertou o número.");
            }
        } while (palpite != numeroSecreto);

    }
}
