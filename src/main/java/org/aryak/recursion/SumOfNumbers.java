package org.aryak.recursion;

public class SumOfNumbers {

    public int sum(int n) {

        if ( n > 1 ) {
            return n + sum(n - 1);
        }

        return 1;
    }
}
