package br.edu.infnet.console;

import java.util.Scanner;

public class Questao12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = input.nextLine();

        String[] palavras = frase.split("\\s+");
        System.out.println("A frase contém " + palavras.length + " palavras.");
    }
}
