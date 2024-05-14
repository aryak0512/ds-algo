package org.aryak.numbers;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PrintAllDivisorsTest {

    PrintAllDivisors obj = new PrintAllDivisors();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(12, Arrays.asList(1, 2, 3, 4, 6, 12)),
                Arguments.of(1, Arrays.asList(1)),
                Arguments.of(17, Arrays.asList(1,17))
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void getAllDivisors(int n, List<Integer> divisors) {
        Set<Integer> actualDivisors = obj.getAllDivisors(n);
        assertThat(actualDivisors.containsAll(divisors)).isTrue();
        assertThat(actualDivisors.size()).isSameAs(divisors.size());
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void getAllDivisorsV2(int n, List<Integer> divisors) {
        Set<Integer> actualDivisors = obj.getAllDivisorsV2(n);
        assertThat(actualDivisors.containsAll(divisors)).isTrue();
        assertThat(actualDivisors.size()).isSameAs(divisors.size());
    }
}