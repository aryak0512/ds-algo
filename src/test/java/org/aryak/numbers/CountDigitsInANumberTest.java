package org.aryak.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class CountDigitsInANumberTest {

    CountDigitsInANumber obj = new CountDigitsInANumber();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(1020, 4),
                Arguments.of(234, 3),
                Arguments.of(12, 2),
                Arguments.of(0, 1),
                Arguments.of(1, 1)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void getNumberOfDigits(int number, int digits) {
        int actual = obj.getNumberOfDigits(number);
        assertThat(actual).isEqualTo(digits);
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void getNumberOfDigitsV2(int number, int digits) {
        int actual = obj.getNumberOfDigitsV2(number);
        assertThat(actual).isEqualTo(digits);
    }
}