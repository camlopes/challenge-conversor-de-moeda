package br.com.alura.conversordemoeda.calculo;

import br.com.alura.conversordemoeda.modelo.Moeda;
import br.com.alura.conversordemoeda.modelo.MoedaConvertida;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConverteMoeda {
    private double converterValor;
    private Moeda moeda;
    private String resultadoDaConversao = "";

    public ConverteMoeda(double converterValor, Moeda moeda){
        this.converterValor = converterValor;
        this.moeda = moeda;
    }

    public void converterMoeda() {
        String apiSenha = "";
        String endereco = "https://v6.exchangerate-api.com/v6/" + apiSenha + "/pair/" + moeda.getMoedaBase() + "/" +  moeda.getMoedaObjetivo() + "/" + converterValor;
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .create();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String jsonResponse = response.body();

            MoedaConvertida moedaConvertida = gson.fromJson(jsonResponse, MoedaConvertida.class);
            resultadoDaConversao = moedaConvertida.conversionResult();

        } catch (Exception e) {
            System.out.println("            ACONTECEU UM ERRO");
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString(){
        return "Valor de " + converterValor + " [" + moeda.getMoedaBase() + "] " +
                "corresponde ao valor final de --> " + resultadoDaConversao + " [" + moeda.getMoedaObjetivo() + "]";
    }
}
