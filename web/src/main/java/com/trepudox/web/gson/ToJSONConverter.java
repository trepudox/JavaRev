package com.trepudox.web.gson;

import com.google.gson.Gson;
import com.trepudox.web.model.PessoaModel;
import com.trepudox.web.model.ProfissaoModel;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ToJSONConverter {

    private static final Gson gson = new Gson();

    public static void main(String[] args) throws IOException, InterruptedException {
        ProfissaoModel profissaoGson = new ProfissaoModel(0L, "gson", 0.0);
        PessoaModel pessoaGson = new PessoaModel(0L, "gson", "2021-07-20", profissaoGson);

//        pessoaGson.setProfissao(new ProfissaoModel(1L, null, null));

        String jsonEnviado = gson.toJson(pessoaGson);
        System.out.println("JSON enviado: " + jsonEnviado);

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create("http://localhost:8080/pessoas/mirror"))
                .POST(HttpRequest.BodyPublishers.ofString(jsonEnviado))
                .header("Content-Type", "application/json")
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        String jsonRecebido = response.body();

        System.out.println("JSON recebido: " + jsonRecebido);
        System.out.println("Iguais? " + jsonEnviado.equals(jsonRecebido));

    }

}
