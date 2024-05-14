package org.aryak.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ReverseNumberTest {

    ReverseNumber obj = new ReverseNumber();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(1028, 8201),
                Arguments.of(10, 1),
                Arguments.of(234, 432),
                Arguments.of(12, 21),
                Arguments.of(0, 0),
                Arguments.of(1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void reverse(int n, int r) {
        int actual = obj.reverse(n);
        assertThat(actual).isEqualTo(r);
    }

}