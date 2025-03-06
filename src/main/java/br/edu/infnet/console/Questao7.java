package br.edu.infnet.console;

import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Digite o seu salário bruto R$: ");
        double salarioBruto = input.nextDouble();

        double imposto = 0;
        if (salarioBruto <= 2000){
            imposto = 0;
        } else if (salarioBruto <= 4000) {
            imposto = salarioBruto * 0.075;
        } else if (salarioBruto <= 6000) {
            imposto = salarioBruto * 0.15;
        } else {
            imposto = salarioBruto * 0.225;
        }

        double salarioLiquido = salarioBruto - imposto;

        System.out.println("Salário Bruto: R$" + salarioBruto);
        System.out.println("Imposto Descontado: R$" + imposto);
        System.out.println("Salário Líquido: R$" + salarioLiquido);
    }
}
