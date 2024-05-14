package org.aryak.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class ArmstrongNumberTest {

    ArmstrongNumber obj = new ArmstrongNumber();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(153, true),
                Arguments.of(371, true),
                Arguments.of(234, false),
                Arguments.of(12, false),
                Arguments.of(0, false),
                Arguments.of(1, false)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void isArmstrong(int n, boolean answer) {
        boolean actual = obj.isArmstong(n);
        assertThat(actual).isEqualTo(answer);
    }

}