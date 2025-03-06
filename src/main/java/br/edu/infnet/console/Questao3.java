package br.edu.infnet.console;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor que você quer converter: ");
        double valor = input.nextDouble();
        input.nextLine();

        System.out.println("Digite a moeda de destino (dólar, euro ou libra): ");
        String moeda = input.nextLine();

        double taxaDolar = 5.77;
        double taxaEuro = 6.22;
        double taxaLibra = 7.44;

        double cambio;
        if(moeda.equals("dólar")){
            cambio = valor * taxaDolar;
            System.out.println("Valor convertido para dólar: " + cambio);

        } else if(moeda.equals("euro")){
            cambio = valor * taxaEuro;
            System.out.println("Valor convertido para euro: " + cambio);

        } else if(moeda.equals("libra")){
            cambio = valor * taxaLibra;
            System.out.println("Valor convertido para libra: " + cambio);
        }

    }
}
