package org.aryak.hashing;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TwoSumProblemTest {

    TwoSumProblem obj = new TwoSumProblem();

    @Test
    void bruteForce() {
        int[] a = {6, 4, 3, 9, 2};
        var b = obj.bruteForce(a, 5);
        assertThat(b).isEqualTo(true);
    }

    @Test
    void bruteForce_negative() {
        int[] a = {6, 4, 3, 9, 2};
        var b = obj.bruteForce(a, 24);
        assertThat(b).isEqualTo(false);
    }
}