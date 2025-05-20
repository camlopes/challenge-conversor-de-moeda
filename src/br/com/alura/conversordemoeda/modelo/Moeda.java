package br.com.alura.conversordemoeda.modelo;

public class Moeda {
    private String moedaBase;
    private String moedaObjetivo;

    public Moeda(int moedaEscolhida){
        switch(moedaEscolhida){
            case 3 -> {
                moedaBase = "USD";
                moedaObjetivo = "BRL";
            }
            case 4 -> {
                moedaBase = "BRL";
                moedaObjetivo = "USD";
            }
        }
    }

    public String getMoedaBase(){
        return moedaBase;
    }

    public String getMoedaObjetivo(){
        return moedaObjetivo;
    }
}
