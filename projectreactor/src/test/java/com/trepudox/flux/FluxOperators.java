package com.trepudox.flux;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;


@Slf4j
public class FluxOperators {

    @Test
    void onErrorContinueTest() {
        Flux<Integer> flux = Flux.range(1, 10)
                .flatMap(n -> {
                    if (n == 7)
                        throw new RuntimeException("erro");

                    return Flux.just(n);
                })
                .onErrorContinue((ex, el) -> {
                    System.out.println(ex.getMessage() + " causado por: " + el);
                })
                .log();

        flux.subscribe();
    }

}
