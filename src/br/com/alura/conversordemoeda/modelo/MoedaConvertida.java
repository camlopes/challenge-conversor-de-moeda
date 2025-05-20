package br.com.alura.conversordemoeda.modelo;

public record MoedaConvertida(String baseCode, String targetCode, String conversionRate, String conversionResult) {
}
