package org.aryak.recursion;

import java.util.ArrayList;
import java.util.List;

public class Factorial {

    public int fact(int n) {
        if ( n > 0 )
            return  fact(n - 1) * n;
        return 1;
    }

    // get all factorials from 1 to n
    public List<Integer> allFacts(int n) {
        List<Integer> nums = new ArrayList<>();
        int f = 1;
        int i = 1;
        while ( f < n ) {
            // check for factorials
            f = fact(i);
            if ( f < n ) {
                nums.add(f);
            }
            i++;
        }
        return nums;
    }
}
