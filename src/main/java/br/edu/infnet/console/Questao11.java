package br.edu.infnet.console;

import java.util.Scanner;

public class Questao11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite um valor inicial: ");
        int valorInicial = input.nextInt();

        System.out.print("Digite um valor para o incremento: ");
        int valorIncremento = input.nextInt();

        while(valorInicial <= 100){
            System.out.print(valorInicial + " ");
            valorInicial += valorIncremento;
        }
    }
}
