package com.trepudox.web.unirest;

import com.google.gson.Gson;
import com.trepudox.web.model.MD5Object;
import kong.unirest.HttpResponse;
import kong.unirest.JsonNode;
import kong.unirest.Unirest;

public class UnirestAndGson {

    private static final Gson gson = new Gson();

    public static void main(String[] args) {
        HttpResponse<JsonNode> response = Unirest.get("http://md5.jsontest.com")
                        .queryString("text", "Marco")
                        .asJson();

        System.out.println(response.getBody());

        MD5Object md5Object = gson.fromJson(response.getBody().toString(), MD5Object.class);

        System.out.println(md5Object);

        Unirest.get("http://md5.jsontest.com?text=aaa")
                .thenConsume(r -> System.out.println("\nresposta: " + r.getContentAsString()));
    }

}
