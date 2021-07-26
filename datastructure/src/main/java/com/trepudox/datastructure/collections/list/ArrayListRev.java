package com.trepudox.datastructure.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListRev {

    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>(List.of("aa", "bb"));

        System.out.println(arrayList);

        arrayList.add("cc");

        arrayList.replaceAll(e -> e + "A");

        System.out.println(arrayList);
    }

}
