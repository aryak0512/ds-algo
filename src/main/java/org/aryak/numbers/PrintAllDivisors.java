package org.aryak.numbers;

import java.util.Set;
import java.util.TreeSet;

public class PrintAllDivisors {

    /**
     * Time complexity : O(n)
     *
     * @param n
     * @return
     */
    public Set<Integer>  getAllDivisors(int n) {
        Set<Integer> divisors = new TreeSet<>();
        for ( int i = 1; i <= n; i++ ) {
            if ( n % i == 0 ) {
                divisors.add(i);
            }
        }
        return divisors;
    }

    /**
     * Time complexity :
     * O(sq. root of n) [for-loop] + O(nlogn) [sorting]
     *
     * @param n
     * @return
     * @apiNote : Optimised version. Go checking from 1 to square root of N
     */
    public Set<Integer> getAllDivisorsV2(int n) {

        // sorted data structure : O (nlogn) where n = no. of factors
        Set<Integer> divisors = new TreeSet<>();

        // O (sq. root of n)
        for ( int i = 1; i <=  Math.sqrt(n) + 1; i++ ) {
            if ( n % i == 0 ) {
                divisors.add(i);
                // set ensures no duplicate goes here. e.g. 6x6=36 [6 will go 2 times in arraylist]
                divisors.add(n / i);
            }
        }
        return divisors;
    }
}
