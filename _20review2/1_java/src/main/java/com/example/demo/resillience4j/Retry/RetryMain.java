package com.example.demo.resillience4j.Retry;

import io.github.resilience4j.retry.Retry;
import lombok.extern.slf4j.Slf4j;
import org.yaml.snakeyaml.emitter.ScalarAnalysis;

import java.util.function.Supplier;

@Slf4j // Retry Default
public class RetryMain {

    private static void callMe(){
      log.info("Try Call me");
      throw new IllegalArgumentException("Error Brodiee");
    }

    private static String hello(){
        log.info("Try Call hello");
        throw new IllegalArgumentException("Error Brodiee");
    }

    public static void main(String[] args) {
        executeRunnable();
        //executeSupplier();
    }

    private static void executeRunnable() {
        Retry retry = Retry.ofDefaults("retry-name");
        Runnable runnable = Retry.decorateRunnable(retry, () -> callMe());
        runnable.run();
    }

    private static void executeSupplier() {
        Retry retry = Retry.ofDefaults("retry-name");

        Supplier<String> supplier = Retry.decorateSupplier(retry, () -> hello());
        String result = supplier.get();
    }
}
