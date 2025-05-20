package br.com.alura.conversordemoeda.modelo;

public record MoedaConvertida(String base_code, String target_code, int conversion_rate, int conversion_result) {
}
