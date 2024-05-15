package org.aryak.patterns;

/**
 *     A      (n-i) spaces
 *   A B A    (n-i) spaces
 * A B C B A
 *
 * @apiNote hard.
 */
public class Pattern17 {

    public static void main(String[] args) {
        int n = 3;

        for ( int i = 1; i <= n; i++) {

            // print (n-i) spaces
            for ( int j = 1; j <= n-i; j++ ) {
                System.out.print(" ");
            }

            int k = 65;
            for ( int j = 1; j <= (2 * i) - 1; j++ ) {
                System.out.print((char) k);
                if ( j <= i / 2 + 1 ) {
                    k++;
                } else {
                    k--;
                }
            }

            // print (n-i) spaces
            for ( int j = 1; j <= n-i; j++ ) {
                System.out.print(" ");
            }

            System.out.println();
        }
    }
}
