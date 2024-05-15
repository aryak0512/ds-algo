package org.aryak.numbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GeometricProgressionTest {

    GeometricProgression obj = new GeometricProgression();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(4, 3, 3, 36),
                Arguments.of(2, 2, 4, 16)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void findNthTermOfGP(int a, int r, int n, int result) {
        int actual = obj.findNthTermOfGP(a, r, n);
        assertThat(actual).isEqualTo(result);
    }
}