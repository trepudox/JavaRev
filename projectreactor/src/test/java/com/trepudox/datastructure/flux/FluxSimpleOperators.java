package com.trepudox.datastructure.flux;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

import java.time.Duration;

@Slf4j
public class FluxSimpleOperators {

    @Nested
    class MergeAndConcat {

        @Nested
        class Merge {

            @Test
            void mergeWith() throws Exception {
                // mergeWith soma dois Flux, trabalhando de maneira ASSÍNCRONA

                Flux<String> fluxLetras = Flux.just("A", "B", "C", "D", "E").delayElements(Duration.ofMillis(50));
                Flux<String> fluxNums = Flux.just("1", "2", "3", "4", "5").delayElements(Duration.ofMillis(50));

                fluxLetras.mergeWith(fluxNums).log().subscribe();

                Thread.sleep(1000);
            }

            @Test
            void mergeDelayError() throws Exception {
                // mergeDelayError fará o merge dos Flux, trabalhando de maneira ASSÍNCRONA, se houver algum erro
                // durante a execução de algum dos Flux, a exceção será lançada apenas no final de toda a emissão dos
                // elementos

                Flux<String> fluxLetras = Flux.just("A", "B", "C", "D", "E").delayElements(Duration.ofMillis(50));
                Flux<String> fluxNums = Flux.just("1", "2", "3", "4", "5").flatMap(e -> {
                    if (e.equalsIgnoreCase("3"))
                        throw new RuntimeException("ERRO!");

                    return Flux.just(e);
                })
                        .delayElements(Duration.ofMillis(50));

                Flux<String> mergedFlux = Flux.mergeDelayError(1, fluxLetras, fluxNums)
                        .log();

                mergedFlux.subscribe();

                Thread.sleep(1500);
            }

        }

        @Nested
        class Concat {

            @Test
            void concatWith() throws Exception {
                // mergeWith soma dois Flux, trabalhando de maneira SÍNCRONA

                Flux<String> fluxLetras = Flux.just("A", "B", "C", "D", "E").delayElements(Duration.ofMillis(50));
                Flux<String> fluxNums = Flux.just("1", "2", "3", "4", "5").delayElements(Duration.ofMillis(50));

                fluxLetras.concatWith(fluxNums).log().subscribe();

                Thread.sleep(1000);
            }

            @Test
            void concatDelayError() throws Exception {
                // concatDelayError fará o concat dos Flux, trabalhando de maneira SSÍNCRONA, se houver algum erro
                // durante a execução de algum dos Flux, a exceção será lançada apenas no final de toda a emissão dos
                // elementos

                Flux<String> fluxLetras = Flux.just("A", "B", "C", "D", "E").delayElements(Duration.ofMillis(50));
                Flux<String> fluxNums = Flux.just("1", "2", "3", "4", "5").flatMap(e -> {
                    if (e.equalsIgnoreCase("3"))
                        throw new RuntimeException("ERRO!");

                    return Flux.just(e);
                })
                        .delayElements(Duration.ofMillis(50));

                Flux<String> mergedFlux = Flux.concatDelayError(fluxLetras, fluxNums)
                        .log();

                mergedFlux.subscribe();

                Thread.sleep(1500);
            }

        }

    }

    @Nested
    class OtherOperators {

        @Test
        void defaultIfEmpty() {
            // se o fluxo estiver vazio, retorna o objeto passado por parâmetro

            Flux<Object> flux = Flux.empty()
                    .defaultIfEmpty(0)
                    .log();

            flux.subscribe();
        }

        @Test
        void repeatAndDelayElements() throws Exception {
            // delayElements cria um intervalo entre os elementos
            // repeat faz com o fluxo se repita, seja infinitamente, uma quantidade delimitada ou até bater uma condição booleana

            Flux<Integer> flux = Flux.just(1, 2, 3)
                    .delayElements(Duration.ofSeconds(1))
                    .repeat(3)
                    .log();

            flux.subscribe();

            Thread.sleep(10000);
        }

    }

}
