package org.aryak.patterns;

/**
 *
 * *    *
 * **  **
 * ******  2n-2i = 2(n-i) blanks
 * symmetry for lower half
 */
public class Pattern20 {

    public static void main(String[] args) {
        int n = 3;

        // upper
        for ( int i = 1; i <= n; i++ ) {

            // print i stars
            for ( int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }

            // print 2(n-i) blanks
            for ( int j = 1; j<= 2*(n-i);j++ ){
                System.out.print(" ");
            }

            // print i stars
            for ( int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower
        for ( int i = n; i >=1 ; i-- ) {

            // print i stars
            for ( int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }

            // print 2(n-i) blanks
            for ( int j = 1; j<= 2*(n-i);j++ ){
                System.out.print(" ");
            }

            // print i stars
            for ( int j = 1; j <= i; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
