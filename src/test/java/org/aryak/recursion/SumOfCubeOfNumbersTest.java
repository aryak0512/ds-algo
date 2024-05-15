package org.aryak.recursion;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SumOfCubeOfNumbersTest {

    SumOfCubeOfNumbers obj = new SumOfCubeOfNumbers();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(5,225),
                Arguments.of(7,784)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void sumOfCubes(int n, int result) {
        int actual = obj.sumOfCubes(n);
        assertThat(actual).isEqualTo(result);
    }
}