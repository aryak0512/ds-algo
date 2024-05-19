package org.aryak.sorting;

/**
 Selection sort:

     1. No of comparisons : n + (n-1) + (n-2) + ... + 1 = sum of n = n*(n-1)/2 = O(n sq)
     2. No of swaps : O(n) => selection sort is best when we want to sort with minimum swaps
     3. Intermediate results of selection sort are useful. E.g. in first k passes, k smallest elements in array can be found
     4. Selection sort is not adaptive. i.e. already sorted list & unsorted list both will also take O(n sq) time
     5. Selection sort is not stable. It does not guarantee correct order of duplicate elements.
 */
public class SelectionSort {

    public int[] sort(int[] a, int n) {
        int i = 0;
        while ( i <= n-2 ) {
            int min = findMinimum(i + 1, n - 1, a);
            if ( a[min] < a[i] ) {
                swap(i, min, a);
            }
            i++;
        }
        return a;
    }

    private void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

    /**
     * returns the index of the minimum value between indexes i and j
     *
     * @param i
     * @param j
     * @return
     */
    public int findMinimum(int i, int j, int[] a) {
        int min = Integer.MAX_VALUE;
        int minIndex = -1;
        while ( i <= j ) {
            if ( a[i] < min ) {
                min = a[i];
                minIndex = i;
            }
            i++;
        }
        return minIndex;
    }
}
