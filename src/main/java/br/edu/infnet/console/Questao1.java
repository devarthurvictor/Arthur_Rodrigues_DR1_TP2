package br.edu.infnet.console;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o nome completo: ");
        String nomeUsuario = input.nextLine();

        System.out.print("Digite a idade: ");
        int idadeUsuario = input.nextInt();
        input.nextLine();

        System.out.print("Digite o nome da sua mãe: ");
        String nomeMae = input.nextLine();

        System.out.print("Digite o nome do seu pai: ");
        String nomePai = input.nextLine();

        System.out.println("Nome: " + nomeUsuario);
        System.out.println("Idade: " + idadeUsuario);
        System.out.println("Nome da Mãe: " + nomeMae);
        System.out.println("Nome do Pai: " + nomePai);

        int tamanhoNomeUsuario = nomeUsuario.length();
        int tamanhoNomeMae = nomeMae.length();
        int tamanhoNomePai = nomePai.length();

        if (tamanhoNomeUsuario > tamanhoNomeMae) {
            System.out.println("Seu nome tem mais letras que o nome da sua mãe.");
        } else if (tamanhoNomeUsuario < tamanhoNomeMae) {
            System.out.println("O nome da sua mãe tem mais letras que o seu.");
        } else {
            System.out.println("Seu nome e o nome da sua mãe têm o mesmo número de letras.");
        }

        if (tamanhoNomeUsuario > tamanhoNomePai) {
            System.out.println("Seu nome tem mais letras que o nome do seu pai.");
        } else if (tamanhoNomeUsuario < tamanhoNomePai) {
            System.out.println("O nome do seu pai tem mais letras que o seu.");
        } else {
            System.out.println("Seu nome e o nome do seu pai têm o mesmo número de letras.");
        }
    }
}
