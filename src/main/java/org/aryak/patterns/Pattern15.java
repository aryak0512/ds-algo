package org.aryak.patterns;

/**
 * A B C
 * A B
 * A
 */
public class Pattern15 {

    public static void main(String[] args) {
        int n = 3;
        for ( int i = n; i >= 1; i-- ) {
            int k = 65;
            for ( int j = 1; j <= i; j++ ) {
                System.out.print((char)k++ + " ");
            }
            System.out.println();
        }
    }
}
