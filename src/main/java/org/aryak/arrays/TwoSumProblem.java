package org.aryak.arrays;

import java.util.HashSet;
import java.util.Set;


public class TwoSumProblem {

    public void twoSum(int[] a, int sum) {

        // if array contains duplicates, remove duplicates first then use procedure
        a = getDistinct(a);
        print(a);

        int maximumElement = getMaximumElement(a);

        // create a hash table from 0 to n
        int[] hash = new int[maximumElement];

        for ( int i : a ) {
            if ( sum - a[i] != 0 ) {
                System.out.println("Pair : " + a[i] + " and " + (sum - a[i]));
            }
            hash[a[i]]++;
        }

    }

    private void print(int[] a) {
        for ( int i = 0; i < a.length; i++ ) {
            System.out.print(a + " ");
        }
    }

    private int[] getDistinct(int[] a) {
        Set<Integer> distinct = new HashSet<>();
        for ( int k : a ) {
            distinct.add(k);
        }

        int[] distinctArray = new int[distinct.size()];
        int j = 0;
        for ( int i : distinct ) {
            distinctArray[j] = i;
            j++;
        }
        return distinctArray;
    }

    private int getMaximumElement(int[] a) {
        int max = Integer.MIN_VALUE;
        for ( int j : a ) {
            if ( j > max ) {
                max = j;
            }
        }
        return max;
    }
}
