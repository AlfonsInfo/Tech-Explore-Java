package com.example.demo.resillience4j.Retry;

import io.github.resilience4j.retry.Retry;
import io.github.resilience4j.retry.RetryConfig;
import io.github.resilience4j.retry.RetryRegistry;
import lombok.extern.slf4j.Slf4j;

import java.time.Duration;
import java.util.function.Supplier;

@Slf4j
public class RetryRegistryImply {
    private static String hello(){
        log.info("Try Call hello");
        return "Stringg";
        //throw new IllegalArgumentException("Error Brodiee");
    }

    private static void retryConfig(){
        RetryConfig config = RetryConfig.custom()
                .maxAttempts(5)
                .waitDuration(Duration.ofSeconds(2))
                .retryExceptions(IllegalArgumentException.class)
                .build();

        Retry retry = Retry.of("retry-2",config);

        Supplier<String> supplier = Retry.decorateSupplier(retry, () -> hello());
        String result = supplier.get();
    }

    public static void main(String[] args) {
        retryConfig();

        RetryRegistry retryRegistry = RetryRegistry.ofDefaults();
        Retry retry1 = retryRegistry.retry("retry-2");
        Retry retry2 = retryRegistry.retry("retry-2");
        System.out.println(retry1 == retry2);

        RetryRegistry retryRegistry2 = RetryRegistry.custom()
                //override config
                .build();

    }
}
