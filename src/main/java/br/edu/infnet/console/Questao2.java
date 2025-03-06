package br.edu.infnet.console;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        int nota1 = input.nextInt();

        System.out.print("Digite a segunda nota: ");
        int nota2 = input.nextInt();

        System.out.print("Digite a terceira nota: ");
        int nota3 = input.nextInt();

        System.out.print("Digite a quarta nota: ");
        int nota4 = input.nextInt();

        double media = (nota1 + nota2 + nota3 + nota4) / 4;

        if(media >= 7){
            System.out.println("Aprovado!");
        } else if(media >= 5 && media <= 6.9){
            System.out.println("Recuperação!");
        } else{
            System.out.println("Reprovado!");
        }
    }
}
