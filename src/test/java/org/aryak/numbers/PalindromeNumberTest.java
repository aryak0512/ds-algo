package org.aryak.numbers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class PalindromeNumberTest {

    PalindromeNumber obj = new PalindromeNumber();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(1028, false),
                Arguments.of(10, false),
                Arguments.of(232, true),
                Arguments.of(1331, true),
                Arguments.of(0, false),
                Arguments.of(1, false)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void isPalindrome(int n, boolean answer) {
        boolean actual = obj.isPalindrome(n);
        assertThat(actual).isEqualTo(answer);
    }
}