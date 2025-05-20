package br.com.alura.conversordemoeda;

import br.com.alura.conversordemoeda.calculo.ConverteMoeda;
import br.com.alura.conversordemoeda.modelo.Moeda;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int moedaEscolhida;
        int converterValor;

        while (true) {
            System.out.println("=================================================");
            System.out.println("Conversor de Moedas: ");
            System.out.println("""
                1) Dolar --> Peso argentino
                2) Peso argentino --> Dolar
                3) Dolar --> Real brasileiro
                4) Real brasileiro --> Dolar
                5) Dolar --> Peso colombiano
                6) Peso colombiano --> Dolar
                7) Sair """);

            System.out.print("Digite somente um número de uma das opções acima: ");
            moedaEscolhida = scanner.nextInt();

            if (moedaEscolhida == 7){
                System.out.println("=================================================");
                break;
            } else {
                Moeda moeda = new Moeda(moedaEscolhida);

                if (moeda.verificaMoedaEscolhida()){
                    System.out.print("Digite o valor que deseja converter: ");
                    converterValor = scanner.nextInt();
                    ConverteMoeda converteMoeda = new ConverteMoeda(converterValor, moeda);
                    converteMoeda.converterMoeda();
                } else {
                    System.out.println("=================================================");
                    break;
                }
            }
        }

        scanner.close();
    }
}