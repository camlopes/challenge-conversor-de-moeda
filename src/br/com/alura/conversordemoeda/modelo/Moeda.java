package br.com.alura.conversordemoeda.modelo;

public class Moeda {
    private int moedaEscolhida;
    private String moedaBase;
    private String moedaObjetivo;

    public Moeda(int moedaEscolhida){
        this.moedaEscolhida = moedaEscolhida;
    }

    public boolean verificaMoedaEscolhida(){
        switch(moedaEscolhida){
            case 1 -> {
                moedaBase = "USD";
                moedaObjetivo = "ARS";
            }
            case 2 -> {
                moedaBase = "ARS";
                moedaObjetivo = "USD";
            }
            case 3 -> {
                moedaBase = "USD";
                moedaObjetivo = "BRL";
            }
            case 4 -> {
                moedaBase = "BRL";
                moedaObjetivo = "USD";
            }
            case 5 -> {
                moedaBase = "USD";
                moedaObjetivo = "COP";
            }
            case 6 -> {
                moedaBase = "COP";
                moedaObjetivo = "USD";
            }
            default -> {
                System.out.println("Opção de moeda escolhida invalida!");
                return false;
            }
        }
        return true;
    }

    public String getMoedaBase(){
        return moedaBase;
    }

    public String getMoedaObjetivo(){
        return moedaObjetivo;
    }
}
