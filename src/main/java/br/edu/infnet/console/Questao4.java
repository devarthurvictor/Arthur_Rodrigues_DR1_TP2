package br.edu.infnet.console;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o dia do nascimento: ");
        int diaNasc = input.nextInt();
        System.out.print("Digite o mês do nascimento (1-12): ");
        int mesNasc = input.nextInt();
        System.out.print("Digite o ano do nascimento: ");
        int anoNasc = input.nextInt();

        System.out.print("Digite o dia atual: ");
        int diaAtual = input.nextInt();
        System.out.print("Digite o mês atual (1-12): ");
        int mesAtual = input.nextInt();
        System.out.print("Digite o ano atual: ");
        int anoAtual = input.nextInt();

        int idadeEmDias = (anoAtual - anoNasc) * 365 + (mesAtual - mesNasc) * 30 + (diaAtual - diaNasc);

        System.out.println("Sua idade em dias: " + idadeEmDias);

    }
}
