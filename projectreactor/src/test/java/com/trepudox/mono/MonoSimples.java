package com.trepudox.mono;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Mono;

import java.time.Duration;

@Slf4j
public class MonoSimples {

    @Test
    void delayTest() throws Exception {
        Mono<Long> mono = Mono.delay(Duration.ofSeconds(1)).log();

        mono.subscribe();

        Thread.sleep(5000);
    }

    @Test
    void testSemDefer() throws Exception {
        Mono<Long> mono = Mono.just(System.currentTimeMillis()).log();

        mono.subscribe();

        Thread.sleep(1999);

        mono.subscribe();
    }

    @Test
    void testComDefer() throws Exception {
        Mono<Long> mono = Mono.defer(() -> Mono.just(System.currentTimeMillis())).log();

        mono.subscribe();

        Thread.sleep(1999);

        mono.subscribe();
    }

}
