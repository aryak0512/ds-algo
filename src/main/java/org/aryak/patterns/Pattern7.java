package org.aryak.patterns;

/**
 * reverse star triangle
 *  *****      2(1) - 1 = 1
 *   ***       2(2) - 1 = 3
 *    *        2(3) - 1 = 5
 */
public class Pattern7 {

    public static void main(String[] args) {

        int n = 4;

        for ( int i = n; i >=1; i-- ) {

            // print (n-i) blanks
            for ( int j =1 ;j <=n-i ;j++ )
                System.out.print(" ");

            // print 2i- 1 stars
            for ( int j =1 ;j <=2*i-1 ;j++ )
                System.out.print("*");

            // print (n-i) blanks
            for ( int j =1 ;j <=n-i ;j++ )
                System.out.print(" ");

            // come on next line
            System.out.println();
        }
    }
}
