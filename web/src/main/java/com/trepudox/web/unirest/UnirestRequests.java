package com.trepudox.web.unirest;

import com.trepudox.web.model.MD5Object;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;

public class UnirestRequests {

    public static void main(String[] args) {
        HttpResponse<MD5Object> response = Unirest.get("http://md5.jsontest.com")
                .queryString("text", "Marco")
                .asObject(MD5Object.class);

        System.out.println(response.getBody());
    }

}
