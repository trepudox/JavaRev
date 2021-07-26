package com.trepudox.datastructure.testes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListVsHashMap {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000);

        long inicio = System.currentTimeMillis();
        Map<Integer, String> hashMap = new HashMap<>();

        hashMap.put(0, "Marco");
        hashMap.put(1, "João");
        hashMap.put(2, "Mano Brown");
        Thread.sleep(10);
        hashMap.get(0);
        hashMap.get(1);
        hashMap.get(2);
        long fim = System.currentTimeMillis();
        System.out.println("HashMap: " + (fim - inicio) + " ms");

        Thread.sleep(1000);

        long inicio2 = System.currentTimeMillis();
        List<String> lista = new ArrayList<>();

        lista.add("Marco");
        lista.add("João");
        lista.add("Mano Brown");
        Thread.sleep(10);
        lista.get(0);
        lista.get(1);
        lista.get(2);
        long fim2 = System.currentTimeMillis();
        System.out.println("List: " + (fim2 - inicio2) + " ms");
    }

}
