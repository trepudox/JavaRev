package com.trepudox.jwt;

import com.trepudox.jwt.base64.Base64Url;

public class App {

    public static void main(String[] args) {
        System.out.println(Base64Url.encode("rato")); // cmF0bw==

        System.out.println(Base64Url.decode("cmF0bw=="));
    }

}
