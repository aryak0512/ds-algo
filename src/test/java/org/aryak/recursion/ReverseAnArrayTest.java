package org.aryak.recursion;

import org.apache.commons.lang3.ArrayUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ReverseAnArrayTest {

    ReverseAnArray obj = new ReverseAnArray();

    @Test
    @DisplayName("Reverse using Iterative method")
    void reverseV1() {
        int [] a = {1,2,2,3};
        int [] expected = {3,2,2,1};
        int [] actual = obj.reverseV1(a);
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Reverse using Recursion - 2 variables")
    void reverseV2() {
        int [] a = {1,2,2,3};
        int [] expected = {3,2,2,1};
        int [] actual = obj.reverseV2(0,3,a);
        assertArrayEquals(expected,actual);
    }

    @Test
    void reverseV2_with_odd_numbers() {
        int [] a = {1,0,2,2,3};
        int [] expected = {3,2,2,0,1};
        int [] actual = obj.reverseV2(0,a.length-1,a);
        assertArrayEquals(a,actual);
    }

    @Test
    void reverseV3() {
        int [] a = {1,2,2,3};
        int [] expected = {3,2,2,1};
        // passing the last index of array. i.e. 3
        int [] actual = obj.reverseV3(a.length-1,a);
        assertArrayEquals(expected,actual);
    }

    @Test
    void reverseV3_with_odd_numbers() {
        int [] a = {1,0,2,2,3};
        int [] expected = {3,2,2,0,1};
        int [] actual = obj.reverseV3(a.length-1,a);
        assertArrayEquals(expected,actual);
    }

    @Test
    void reverseV3_with_odd_numbers_negative() {
        int [] a = {1,0,2,2,3};
        int [] expected = {3,2,2,0,1};
        // passing the last index of array. i.e. 3
        int [] actual = obj.reverseV3(a.length-1,a);
        assertArrayEquals(expected,actual);

    }

}