package org.aryak.recursion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class PalindromeStringTest {

    PalindromeString obj = new PalindromeString();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of("abc",false),
                Arguments.of("racecar",true)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    @DisplayName("Palindrome using Iterative - single pointer approach")
    void isPalindromeV1(String s , boolean result) {
        boolean actual = obj.isPalindromeV1(s);
        assertThat(actual).isEqualTo(result);
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    @DisplayName("Palindrome using Recursion")
    void isPalindromeV2(String s , boolean result) {
        boolean actual = obj.isPalindromeV2(s.length()-1, s);
        assertThat(actual).isEqualTo(result);
    }

    @Test
    void removeNonAlphabets() {
        String s1 = "race a car";
        String expected = "raceacar";
        String actual = obj.removeNonAlphabets(s1);
        assertEquals(actual, expected);
    }

    @Test
    void removeNonAlphabets_() {
        String s1 = " A man, a plan, a canal: Panama";
        String expected = "amanaplanacanalpanama";
        String actual = obj.removeNonAlphabets(s1);
        assertEquals(actual, expected);
    }

    @Test
    void checkPalindeom() {
        String s = "raceacar";
        boolean actual = obj.isPalindromeV1(s);
        boolean expected = false;
        assertEquals(actual, expected);
    }

    @Test
    void jg() {
        String s1 = "Marge, let's \"[went].\" I await {news} telegram.";
        char bracket = '[';
        System.out.println((int)bracket);
        String actual = obj.removeNonAlphabets(s1);
        System.out.println(actual);
    }

}