package com.trepudox.datastructure.jodatime;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZonedDateTimeRev {

    public static void main(String[] args) {
        ZonedDateTime zdt = LocalDateTime.now().atZone(ZoneId.of("America/Sao_Paulo"));

        System.out.println(compareZdtToTransformedZdtISO(zdt));
        System.out.println(transformZdtISO(zdt));
    }

    private static String transformZdtISO(ZonedDateTime zdt) {
        String date = zdt.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        String time = zdt.format(DateTimeFormatter.ofPattern("HH:mm:ss.SSSSSSSSS"));

        return date + "T" + time + zdt.getOffset();
    }

    private static boolean compareZdtToTransformedZdtISO(ZonedDateTime zdt) {
        String zdtSubstring = zdt.toString().substring(0, zdt.toString().length() - 19);

        return zdtSubstring.equals(transformZdtISO(zdt));
    }

}
