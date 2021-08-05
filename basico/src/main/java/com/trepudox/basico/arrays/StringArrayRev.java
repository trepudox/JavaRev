package com.trepudox.basico.arrays;

import java.util.Arrays;

public class StringArrayRev {

    public static void main(String[] args) {
        String[] originalStringArray = {"marco", "string", "java"};
        String[] clonedStringArray = originalStringArray.clone();

        originalStringArray[1] = "marco2?";

        System.out.println("clone: " + Arrays.toString(clonedStringArray));
        System.out.println("original: " + Arrays.toString(originalStringArray));

        String value = "marco";
        boolean contains = false;
        for (String s : originalStringArray) {
            if (s.equals(value)) {
                contains = true;
                break;
            }
        }
        System.out.println("originalStringArray contains '" + value + "': " + contains);
    }

}
