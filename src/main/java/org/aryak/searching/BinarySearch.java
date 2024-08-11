package org.aryak.searching;

public class BinarySearch {

    public int binarySearch(int i, int j, int key, int[] a) {

        while ( i <= j ) {
            int mid = (i + j) / 2;
            if ( a[mid] == key )
                return mid;
            else if ( a[mid] > key ) {
                binarySearch(mid+1, j , key, a);
            } else {
                binarySearch(i, mid -1, key, a);
            }
        }

        return -1;
    }
}
