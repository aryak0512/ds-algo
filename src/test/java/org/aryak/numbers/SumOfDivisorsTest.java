package org.aryak.numbers;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class SumOfDivisorsTest {

    SumOfDivisors obj = new SumOfDivisors();

    @Test
    void sumOfDivisors() {

        assertThat(obj.sumOfDivisors(5)).isEqualTo(21);

    }

}