package org.aryak.numbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class LeastCommonMultipleTest {

    LeastCommonMultiple obj = new LeastCommonMultiple();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(4, 6, 12),
                Arguments.of(10, 12, 60),
                Arguments.of(3, 7, 21),
                Arguments.of(440154, 89532, 729775332)

        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void lcm(int a, int b, long lcm) {
        assertThat(obj.lcm(a, b)).isEqualTo(lcm);
    }
}