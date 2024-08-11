package org.aryak.searching;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTest {

    BinarySearch bs = new BinarySearch();

    public static Stream<Arguments> paramsProvider() {
        return Stream.of(
                Arguments.of(new int[]{1,2,3,5}, 3)
        );
    }

    @ParameterizedTest
    @MethodSource(value = "paramsProvider")
    void binarySearch(int []a , int key) {
        var i = bs.binarySearch(0, a.length, key, a);
        assertThat(i).isEqualTo(i);
    }
}