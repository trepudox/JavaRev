package com.trepudox.jwt.base64;

import java.util.Base64;

public class Base64Url {

    public static String encode(String string) {
        return Base64.getUrlEncoder().encodeToString(string.getBytes());
    }

    public static String decode(String string) {
        return new String(Base64.getUrlDecoder().decode(string));
    }


    private Base64Url() {}

}
