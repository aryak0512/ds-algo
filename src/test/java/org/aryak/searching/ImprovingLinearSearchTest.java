package org.aryak.searching;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ImprovingLinearSearchTest {

    ImprovingLinearSearch obj = new ImprovingLinearSearch();
    int[] a = new int[]{2, 4, 56, 3, 64};

    @Test
    void search_negative() {
        int idx = obj.searchTransposition(3, a);
        assertThat(idx).isEqualTo(-1);
    }

    @Test
    void search_positive() {
        int idx = obj.searchTransposition(3, a);
        assertThat(idx).isEqualTo(3);
    }


    @Test
    void search_positive_with_Transposition() {
        int idx = obj.searchTransposition(3, a);
        assertThat(idx).isEqualTo(3);

        // search again
        idx = obj.searchTransposition(3, a);
        assertThat(idx).isEqualTo(2);

        // search again
        idx = obj.searchTransposition(3, a);
        assertThat(idx).isEqualTo(1);
    }

    @Test
    void search_positive_with_MoveToHead() {
        int idx = obj.searchMoveToHead(3, a);
        assertThat(idx).isEqualTo(3);

        // search again
        idx = obj.searchMoveToHead(3, a);
        assertThat(idx).isEqualTo(0);

    }


}