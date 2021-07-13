package com.trepudox.flux;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;


@Slf4j
public class FluxOperators {

    @Test
    void onErrorContinueTest() {
        // é possível tratar o erro e o elemento que o causou, e então continuar o fluxo normalmente, atenção
        // apenas à posição em que o operador estará, pois faz diferença

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
