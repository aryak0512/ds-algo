package org.aryak.numbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MinimumSumOfFactorsTest {

    MinimumSumOfFactors obj = new MinimumSumOfFactors();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(10, 7),
                Arguments.of(12, 7)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void minimumSum(int n, int result) {
        int actual = obj.minimumSum(50);
        assertThat(actual).isEqualTo(result);
    }
}