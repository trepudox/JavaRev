package com.trepudox.flux;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.util.Optional;


@Slf4j
public class FluxOperators {

    @Nested
    class OnError {

        @Test
        void onErrorMap() {
            // recebe um erro e retorna outro

            Flux<Integer> flux = Flux.range(1, 10)
                    .flatMap(n -> {
                        if (n == 7)
                            throw new RuntimeException("erro");

                        return Flux.just(n);
                    })
                    .onErrorMap(e -> new IllegalArgumentException(e.getMessage()))
                    .log();

            flux.subscribe();
        }

        @Test
        void onErrorResumeTest() {
            // com esse método é capaz

            Flux<Integer> flux = Flux.range(1, 10)
                    .flatMap(n -> {
                        if (n == 7)
                            throw new RuntimeException("erro");

                        return Flux.just(n);
                    })
                    .onErrorResume(ex -> {
                        System.out.println(ex.getMessage());
                        return Flux.just(0);
                    })
                    .log();

            flux.subscribe();
        }

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

    @Nested
    class DoOn {

        @Test
        void doOnError() {
            // doOnError(), quando o Publisher lança um erro, é possivel consumir essa exceção

            Flux<Integer> flux = Flux.range(1, 10)
                    .flatMap(n -> {
                        if (n == 7)
                            throw new RuntimeException("erro");

                        return Flux.just(n);
                    })
                    .doOnError(ex -> System.out.println(ex.getMessage() + "!!!!"))
                    .log();

            flux.subscribe();
        }

        @Test
        void doOnTerminate() {
            // doOnTerminate(), quando o Publisher termina, independete de como terminou, é possível executar um Runnable

            Flux<Integer> flux = Flux.range(1, 10)
                    .doOnTerminate(() -> System.out.println("Terminou"))
                    .log();

            flux.subscribe();
        }

        @Test
        void doOnEach() {
            // doOnEach(), para cada elemento emitido pelo Publisher, executa alguma ação em cima do elemento

            Flux<Integer> flux = Flux.range(1, 10)
                    .doOnEach(e -> {
                        Optional<Integer> optionalNum = Optional.ofNullable(e.get());
                        System.out.println(optionalNum.orElse(0) * 2);
                    })
                    .log();

            flux.subscribe();
        }

    }

}
