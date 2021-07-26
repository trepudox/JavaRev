package com.trepudox.datastructure.web.gson;

import com.google.gson.*;
import com.trepudox.datastructure.web.model.PessoaModel;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class FromJSONConverter {

    private static final Gson gson = new Gson();

    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        String stringUri = "http://localhost:8080/pessoas/all";
        URI uri = URI.create(stringUri);

        HttpRequest request = HttpRequest.newBuilder(uri)
                .GET()
                .timeout(Duration.ofMillis(1000))
                .build();

        long inicio = System.currentTimeMillis();
        try {
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
            String stringResponse = response.body();

            JsonArray jsonArray = (JsonArray) JsonParser.parseString(stringResponse);

            for (JsonElement jsonElement : jsonArray) {
                PessoaModel pessoaModel = gson.fromJson(jsonElement, PessoaModel.class);
                System.out.println(pessoaModel);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        long fim = System.currentTimeMillis();
        System.out.println("Tempo em ms: " + (fim - inicio));

    }

}
