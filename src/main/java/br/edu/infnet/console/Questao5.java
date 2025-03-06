package br.edu.infnet.console;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor da compra: R$ ");
        double valorCompra = input.nextDouble();

        double desconto;
        if (valorCompra > 1000) {
            desconto = valorCompra * 0.10;
        } else if (valorCompra >= 500) {
            desconto = valorCompra * 0.05;
        } else {
            desconto = 0;
        }

        double valorFinal = valorCompra - desconto;

        System.out.println("Valor original: R$ " + valorCompra);
        System.out.println("Desconto aplicado: R$ " + desconto);
        System.out.println("Valor final com desconto: R$ " + valorFinal);
    }
}
