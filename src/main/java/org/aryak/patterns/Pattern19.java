package org.aryak.patterns;


public class Pattern19 {

    public static void main(String[] args) {
        int n = 3;

        // upper
        for ( int i = 1; i <= n; i++ ) {

            // print n-i + 1 stars
            for ( int j = 1; j <= n-i+1; j++ ) {
                System.out.print("*");
            }

            // print 2i -2 => 2(i-1) blanks
            for ( int j = 1; j<= 2*(i-1);j++ ){
                System.out.print(" ");
            }

            // print n-i + 1 stars
            for ( int j = 1; j <= n-i+1; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }

        // lower
        for ( int i = n; i >= 1; i-- ) {

            // print n-i + 1 stars
            for ( int j = 1; j <= n-i+1; j++ ) {
                System.out.print("*");
            }

            // print 2i -2 => 2(i-1) blanks
            for ( int j = 1; j<= 2*(i-1);j++ ){
                System.out.print(" ");
            }

            // print n-i + 1 stars
            for ( int j = 1; j <= n-i+1; j++ ) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
