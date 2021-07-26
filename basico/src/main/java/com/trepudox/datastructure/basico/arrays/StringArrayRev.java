package com.trepudox.datastructure.basico.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringArrayRev {

    public static void main(String[] args) {
        String[] stringArray = {"marco", "string", "java"};
        String[] cloneArray = stringArray.clone();

        stringArray[1] = "marco2?";

        System.out.println("clone: " + Arrays.toString(cloneArray));
        System.out.println("original: " + Arrays.toString(stringArray));

        String value = "marco";
        boolean contains = false;
        for (String s : stringArray) {
            if (s.equals(value)) {
                contains = true;
                break;
            }
        }
        System.out.println("stringArray contains '" + value + "': " + contains);
    }

}
