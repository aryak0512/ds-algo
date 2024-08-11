package org.aryak.searching;

public class ImprovingLinearSearch {

    /**
     * Transposition - moving the searched element one place backward
     *
     * @param key the element to be searched
     * @param a   array
     * @return index
     */
    public int searchTransposition(int key, int[] a) {
        for ( int i = 0; i < a.length; i++ ) {
            if ( a[i] == key ) {
                // swap with previous index
                swap(i, i - 1, a);
                return i;
            }
        }

        return -1;
    }


    private void swap(int i, int j, int[] a) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    /**
     * Move to head - moving the searched element to the first place
     *
     * @param key the element to be searched
     * @param a   array
     * @return index
     */
    public int searchMoveToHead(int key, int[] a) {
        for ( int i = 0; i < a.length; i++ ) {
            if ( a[i] == key ) {
                // swap with first index
                swap(i, 0, a);
                return i;
            }
        }

        return -1;
    }
}
