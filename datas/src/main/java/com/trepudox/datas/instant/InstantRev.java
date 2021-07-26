package com.trepudox.instant;

import java.time.*;

public class InstantRev {

    public static void main(String[] args) {
        Instant instant = Instant.now();

        System.out.println(Instant.from(ZonedDateTime.of(LocalDateTime.now(), ZoneId.of("America/Sao_Paulo"))));

        System.out.println(instant);
    }

}
