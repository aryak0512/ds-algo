package org.aryak.sorting;

public class BubbleSort {

    public int[] sort(int[] a, int n) {
        int j;
        int i;
        for ( i = 0; i < n - 1; i++ ) {
            for ( j = 0; j < n - 1 - i; j++ ) {
                if ( a[j] > a[j + 1] ) {
                    swap(i, j + 1, a);
                }
            }
        }
        return a;
    }

    private void swap(int i, int j, int[] a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }

}
