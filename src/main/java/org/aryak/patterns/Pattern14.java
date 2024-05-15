package org.aryak.patterns;

/**
 * A
 * A B
 * A B C
 */
public class Pattern14 {

    public static void main(String[] args) {
        int n = 3;
        for ( int i = 1; i <= n; i++ ) {
            int k = 65;
            for ( int j = 1; j <= i; j++ ) {
                System.out.print((char)k++ + " ");
            }
            System.out.println();
        }
    }
}
