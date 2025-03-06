package br.edu.infnet.console;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Cadastre sua senha: ");
        String senhaCorreta = input.nextLine();

        String senhaDigitada;
        do {
            System.out.print("Digite sua senha: ");
            senhaDigitada = input.nextLine();

            if (!senhaDigitada.equals(senhaCorreta)) {
                System.out.println("Senha incorreta. Tente novamente.");
            }

        } while (!senhaDigitada.equals(senhaCorreta));

        System.out.println("Senha correta! Acesso permitido.");
    }
}
