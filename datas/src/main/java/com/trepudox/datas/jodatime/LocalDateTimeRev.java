package com.trepudox.datas.jodatime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeRev {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.parse("2021-07-04T00:00:01"));

        var data = LocalDateTime.of(2021, 7, 1, 5, 50);
        String dataFormatada = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
        System.out.println(dataFormatada);


        String dataFormatada2 = LocalDateTime.now().format(
                DateTimeFormatter.ofPattern("dd-MM-yyyy'T'HH:mm:ss'Z'"));
        System.out.println(dataFormatada2);

    }

}
