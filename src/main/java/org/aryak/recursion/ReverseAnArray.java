package org.aryak.recursion;

public class ReverseAnArray {

    /**
     * Iterative approach
     * @param a
     * @return
     */
    public int[] reverseV1(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while ( i < j ) {
            swap(i, j, a);
            i++;
            j--;
        }
        return a;
    }

    /**
     * Recursive approach
     * @param i
     * @param j
     * @param a
     * @return
     */
    public int[] reverseV2(int i, int j, int[] a) {
        if ( i < j ) {
            swap(i, j, a);
            reverseV2(i + 1, j - 1, a);
        }
        return a;
    }

    /**
     * Recursive approach using single pointer variable
     * @param i - points at last index of array, then moves left until reaches midway
     * @param a
     * @return
     */
    public int[] reverseV3(int i, int[] a) {

        int mid = (a.length -1) /2;
        if ( i > mid ) {
            swap(i, a.length - 1 - i, a);
            reverseV3(i - 1, a);
        }
        return a;
    }

    public void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
