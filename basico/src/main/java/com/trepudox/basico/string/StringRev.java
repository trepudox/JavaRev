package com.trepudox.basico.string;

public class StringRev {

    public static void main(String[] args) {

        stringSubstring("1234567891011121");
        isFirstCharacterUpper("Teste");

    }

    private static void stringSubstring(String str) {
        System.out.println(str.substring(str.length() - 4));
    }

    private static void isFirstCharacterUpper(String str) {
        System.out.println(
                Character.isUpperCase(str.charAt(0))
        );

    }

}
