package org.aryak.sorting;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    BubbleSort obj = new BubbleSort();

    // [8, 1, 5, 3, 9]
    // [1, 8, 5, 3, 9]
    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(new int[]{3, 2, 4, 3, 9}, new int[]{2, 3, 3, 4, 9}),
                Arguments.of(new int[]{3, 2, 1, 4, 9}, new int[]{1, 2, 3, 4, 9}),
                Arguments.of(new int[]{1, 2, 2, 2}, new int[]{1, 2, 2, 2}),
                Arguments.of(new int[]{2, 5, -2}, new int[]{-2, 2, 5})
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void sort(int[] a, int[] expected) {
        int[] actual = obj.sort(a, a.length);
        assertArrayEquals(expected, actual);
    }
}