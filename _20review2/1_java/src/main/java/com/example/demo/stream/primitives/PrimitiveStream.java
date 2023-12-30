package com.example.demo.stream.primitives;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class PrimitiveStream {

    public static void main(String[] args) {
        IntStream intStream = IntStream.of(1,3,4,5);
        LongStream longStream = LongStream.of(1,3,4,5);

    }
}
