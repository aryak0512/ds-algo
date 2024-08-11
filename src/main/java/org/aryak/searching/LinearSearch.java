package org.aryak.searching;

public class LinearSearch {

    public int search(int key, int[] a) {

        for ( int i = 0; i < a.length; i++ ) {
            if ( a[i] == key ) {
                return i;
            }
        }

        return -1;
    }
}
