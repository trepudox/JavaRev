package com.trepudox.flux;

import com.trepudox.subscribers.DuplicaElementos;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

@Slf4j
public class FluxSimples {

    @Test
    void test() {
        Flux<Long> flux = Flux.just(1L, 2L, 3L, 4L, 5L).log();

        var duplicaElementos = new DuplicaElementos(2);

        flux.subscribeWith(duplicaElementos);
    }

}
