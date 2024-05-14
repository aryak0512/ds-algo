package org.aryak.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PrimeNumberTest {

    PrimeNumber obj = new PrimeNumber();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(234, false),
                Arguments.of(12, false),
                Arguments.of(2, true),
                Arguments.of(17, true)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void isPrime(int n, boolean answer) {
        assertThat(obj.isPrime(n)).isEqualTo(answer);
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void isPrimeV2(int n, boolean answer) {
        assertThat(obj.isPrimeV2(n)).isEqualTo(answer);
    }
}