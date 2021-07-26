package com.trepudox.datastructure.web.gson;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class SimpleFromJSONConverter {

    private static final Gson gson = new Gson();

    public static void main(String[] args) throws IOException, InterruptedException {
        /*
            Retorno da request será o seguinte:

            {
               "date": "07-21-2021",
               "milliseconds_since_epoch": 1626886087601,
               "time": "04:48:07 PM"
            }

        */

        ObjetoData objetoData = gson.fromJson(request(), ObjetoData.class);

        System.out.println(objetoData);

        ObjetoDataMapeado objetoDataMapeado = mapObjetoDataToObjetoDataMapeado(objetoData);

        System.out.println(objetoDataMapeado);

    }

    private static String request() throws IOException, InterruptedException {
        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder(URI.create("http://date.jsontest.com"))
                .GET()
                .build();

        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

        return response.body();
    }

    private static ObjetoDataMapeado mapObjetoDataToObjetoDataMapeado(ObjetoData objetoData) {
        LocalDate date = LocalDate.parse(objetoData.getDate(), DateTimeFormatter.ofPattern("MM-dd-yyyy"));
        LocalTime time = LocalTime.parse(objetoData.getTime(), DateTimeFormatter.ofPattern("hh:mm:ss a"));

        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Long milliseconds = objetoData.getMilliseconds_since_epoch();

        return new ObjetoDataMapeado(dateTime, milliseconds);
    }

    @Data @NoArgsConstructor @AllArgsConstructor
    private static class ObjetoData {

        private String date;
        private Long milliseconds_since_epoch;
        private String time;

    }

    @Data @NoArgsConstructor @AllArgsConstructor
    private static class ObjetoDataMapeado {

        private LocalDateTime dateTime;
        private Long milliseconds;

    }

}
