package org.aryak.patterns;

/**
 * A
 * B B
 * C C C
 */
public class Pattern16 {

    public static void main(String[] args) {
        int n = 3;
        int k = 65;
        for ( int i = 1; i <= n; i++ ,k++) {
            for ( int j = 1; j <= i; j++ ) {
                System.out.print((char)k + " ");
            }
            System.out.println();
        }
    }
}
