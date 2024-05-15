package org.aryak.patterns;

/**
 * E
 * D E
 * C D E
 */
public class Pattern18 {

    public static void main(String[] args) {
        int n = 3;
        int k = 69;
        for ( int i = 1; i <= n; i++ ) {
            for ( int j = k-(i-1); j <= k; j++) {
                System.out.print((char) j);
            }
            System.out.println();
        }
    }
}
