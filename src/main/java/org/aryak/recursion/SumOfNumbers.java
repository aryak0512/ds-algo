package org.aryak.recursion;

public class SumOfNumbers {

    public int sum(int n) {

        if ( n > 1 ) {
            return sum(n - 1) + n;
        }

        return 1;
    }
}
