package org.aryak.recursion;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PowerTest {

    Power obj = new Power();

    @Test
    void power() {
        assertThat(obj.power(2,3)).isEqualTo(8);
        assertThat(obj.power(2,1)).isEqualTo(2);
        assertThat(obj.power(2,0)).isEqualTo(1);
        assertThat(obj.power(2,4)).isEqualTo(16);
    }
}