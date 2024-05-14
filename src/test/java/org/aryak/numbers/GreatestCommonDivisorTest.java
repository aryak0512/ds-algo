package org.aryak.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class GreatestCommonDivisorTest {

    GreatestCommonDivisor obj = new GreatestCommonDivisor();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(13, 11, 1),
                Arguments.of(10, 12, 2)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void gcd(int n1, int n2, int ans) {
        int gcd = obj.gcd(n1, n2);
        assertThat(gcd).isEqualTo(ans);
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void gcdEuclideanAlgorithm(int n1, int n2, int ans) {
        int gcd = obj.gcdEuclideanAlgorithm(n1, n2);
        assertThat(gcd).isEqualTo(ans);
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void gcdEuclidean(int n1, int n2, int ans) {
        int gcd = obj.gcdEuclidean(n1, n2);
        assertThat(gcd).isEqualTo(ans);
    }
}