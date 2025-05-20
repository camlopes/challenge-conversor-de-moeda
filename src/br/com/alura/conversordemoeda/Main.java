package br.com.alura.conversordemoeda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcaoEscolhida;
        int converterValor;

        while (true) {
            System.out.println("=========================================");
            System.out.println("Conversor de Moedas: ");
            System.out.println("""
                1) Dolar --> Peso argentino
                2) Peso argentino --> Dolar
                3) Dolar --> Real brasileiro
                4) Real brasileiro --> Dolar
                5) Dolar --> Peso colombiano
                6) Peso colombiano --> Dolar
                7) Sair """);

            System.out.print("Digite um número de uma das opções acima: ");
            opcaoEscolhida = scanner.nextInt();

            if (opcaoEscolhida == 7){
                System.out.println("=========================================");
                break;
            } else {
                System.out.print("Digite o valor que deseja converter: ");
                converterValor = scanner.nextInt();
            }
        }

        scanner.close();
    }
}