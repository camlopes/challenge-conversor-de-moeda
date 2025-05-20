package br.com.alura.conversordemoeda.calculo;

import br.com.alura.conversordemoeda.modelo.Moeda;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ConverteMoeda {
    private int converterValor;
    private Moeda moeda;

    public ConverteMoeda(int converterValor, Moeda moeda){
        this.converterValor = converterValor;
        this.moeda = moeda;
    }

    public double converterMoeda() {
        String apiSenha = "";
        String endereco = "https://v6.exchangerate-api.com/v6/" + apiSenha + "/pair/" + moeda.getMoedaBase() + "/" +  moeda.getMoedaObjetivo() + "/" + converterValor;

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();
            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());
            String jsonResponse = response.body();

            System.out.println("Response com o resultado da conversao de moeda: ");
            System.out.println(jsonResponse);

        } catch (Exception e) {
            System.out.println("            ACONTECEU UM ERRO");
            System.out.println(e.getMessage());
        }

        return 0;
    }
}
