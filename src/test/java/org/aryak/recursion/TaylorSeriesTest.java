package org.aryak.recursion;

import org.junit.jupiter.api.Test;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class TaylorSeriesTest {

    TaylorSeries obj = new TaylorSeries();

    @Test
    void taylor() {

        double ans = obj.taylor(2,3);
        System.out.println(ans);

        //assertThat(obj.taylor(0)).isEqualTo(1);
    }
}