package com.trepudox.datastructure.subscribers;

import lombok.extern.slf4j.Slf4j;
import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

@Slf4j
public class DuplicaElementos extends BaseSubscriber<Long> {

    private int requestCount;

    public DuplicaElementos(int requestCount) {
        this.requestCount = requestCount;
        if (requestCount < 0)
            this.requestCount = 0;
    }

    @Override
    protected void hookOnSubscribe(Subscription subscription) {
        if (requestCount > 0)
            request(requestCount);
        else
            requestUnbounded();
    }

    @Override
    protected void hookOnNext(Long value) {
        System.out.println(value * 2);
        if (requestCount > 0)
            request(requestCount);
        else
            request(1);
    }

    @Override
    protected void hookOnError(Throwable throwable) {
        log.info("Erro: " + throwable.getMessage());
    }

    @Override
    protected void hookOnComplete() {
        log.info("DuplicaElementos completou sua inscrição");
    }

    public int getRequestCount() {
        return requestCount;
    }

    public void setRequestCount(int requestCount) {
        this.requestCount = requestCount;
    }

}
