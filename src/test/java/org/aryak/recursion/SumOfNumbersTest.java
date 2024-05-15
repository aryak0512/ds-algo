package org.aryak.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumOfNumbersTest {

    SumOfNumbers obj = new SumOfNumbers();

    @Test
    void sum() {
        assertEquals(6, obj.sum(3));
    }
}