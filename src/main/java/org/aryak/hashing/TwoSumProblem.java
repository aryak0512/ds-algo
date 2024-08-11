package org.aryak.hashing;

public class TwoSumProblem {

    /**
     * Brute force approach - O(n) 2
     * @param a
     * @param sum
     * @return
     */
    public boolean bruteForce(int[] a, int sum) {
        // [6 4 3 9 2] sum=13
        for ( int i = 0; i < a.length; i++ ) {
            for ( int j = i + 1; j < a.length; j++ ) {
                if ( a[i] + a[j] == sum ) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 
     * @param a
     * @param sum
     * @return
     */
    public boolean bruteForceV2(int[] a, int sum) {
        for ( int i = 0; i < a.length; i++ ) {
            for ( int j = i + 1; j < a.length; j++ ) {
                if ( a[i] + a[j] == sum ) {
                    return true;
                }
            }
        }
        return false;
    }
}
