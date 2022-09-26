package com.trepudox.datas.instant;

import java.time.*;

public class InstantRev {

    public static void main(String[] args) {
        Instant instant = Instant.now();
        System.out.println(instant);

        System.out.println(Instant.from(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Sao_Paulo"))));


        System.out.println("####################");
        /*
        * Convertendo um epoch timestamp num Instant e convertendo o Instant para LocalDateTime
        * */
        instant = Instant.now();
        long epochTimestamp = System.currentTimeMillis();
        System.out.println("Instant: " + instant.toEpochMilli());
        System.out.println("epochTimestamp: " + epochTimestamp);

        ZoneId zoneId = ZoneId.of("America/Sao_Paulo");
        LocalDateTime conversion = LocalDateTime.ofInstant(instant, zoneId);
        System.out.println(conversion);
    }

}
