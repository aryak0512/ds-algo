package org.aryak.hashing;

import static java.lang.System.*;

/**
 * GeeksforGeeks
 */
public class FrequencyCount {
    /**
     * modify the array in-place
     *
     * @param arr
     * @param n
     * @param p
     */
    public void frequencyCount(int[] a, int n, int p) {
        int i = 0;
        while ( i < n ) {
            int ele = a[i];
            if ( ele > 0) { // it is a normal element & not count
                int swapIdx = ele - 1;
                if ( swapIdx <= n - 1 ) {
                    out.println("swapping elements | index : " + i + " with index :" + swapIdx);
                    swap(i, swapIdx, a);
                } else {
                    /* swap index is out of array range */
                    a[i] = 0;
                    i++;
                }
            } else {
                // this element does not exist in array
                i++;
            }
        }
        multiply(a, n);
        print(a);
    }

    public void multiply(int [] a, int n){
        int i = 0;
        while ( i < n ) {
            a[i] = a[i] * -1;
            i++;
        }
    }

    // [0 -1 0 -1 4]
    // i = 4
    // j = 3
    // temp = 4
    public void swap(int i, int j, int[] a) {
        out.println("Before swapping");
        print(a);
        int temp = a[i];
        // if a[j] is < 0, it holds the frequency of some number already
        a[i] = a[j];

        if ( a[j] >= 0 )
            temp = -1; // element coming for first time
        else
            temp = temp - 1; // element has already counted previously

        a[j] = temp;

    }

    public void print(int[] a){
        for ( int t: a )
            out.print(t + " ");
        out.println();
    }
}
