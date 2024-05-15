package org.aryak.patterns;

/**
 * 1             1   2*(n-i) spaces
 * 1 2         2 1   2*(n-i) = 2(4-2) = 4 spaces
 * 1 2 3     3 2 1   2*(n-i) = 2(4-3) = 2 spaces
 * 1 2 3 4 4 3 2 1
 */
public class Pattern12 {

    public static void main(String[] args) {
        int n = 4;

        for ( int i = 1; i <= n; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(j);
            }

            // print 2*(n-1) spaces
            for ( int j=1 ;j<=2*(n-i);j++ )
                System.out.print(" ");

            for ( int j = i; j >= 1; j-- ) {
                System.out.print(j);
            }


            System.out.println();
        }
    }


}
