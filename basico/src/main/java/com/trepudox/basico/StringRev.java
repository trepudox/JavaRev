package com.trepudox.basico;

public class StringRev {

    public static void main(String[] args) {

        stringSubstring();

    }

    private static void stringSubstring() {
        String str = "1234567891011121";

        System.out.println(str.substring(str.length() - 4));
    }

}
