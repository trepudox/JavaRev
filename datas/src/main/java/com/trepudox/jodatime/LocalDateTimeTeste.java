package com.trepudox.jodatime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeTeste {

    public static void main(String[] args) {
        System.out.println(LocalDateTime.parse("2021-07-04T00:00:01"));

        var data = LocalDateTime.of(2021, 7, 1, 5, 50);
        String dataString = data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println(dataString);

    }

}
