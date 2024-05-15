package org.aryak.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciNumberTest {

    FibonacciNumber obj = new FibonacciNumber();

    @Test
    void fib() {
        // 1 1 2 3 5 8
        assertEquals(1, obj.fib(1));
        assertEquals(1, obj.fib(2));
        assertEquals(2, obj.fib(3));
        assertEquals(3, obj.fib(4));
    }
}