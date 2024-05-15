package org.aryak.patterns;

/**
 * 1
 * 2 3
 * 4 5 6
 */
public class Pattern13 {

    public static void main(String[] args) {
        int n = 3;
        int k = 1;
        for ( int i = 1; i <= n; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(k++ + " ");
            }
            System.out.println();
        }
    }
}
