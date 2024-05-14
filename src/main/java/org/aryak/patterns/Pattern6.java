package org.aryak.patterns;

/**
 * star triangle
 *   *      2(1) - 1 = 1
 *  ***     2(2) - 1 = 3
 * *****    2(3) - 1 = 5
 */
public class Pattern6 {

    public static void main(String[] args) {

        int n = 4;

        for ( int i = 1; i <= n; i++ ) {
            // Step 1 : print (n-i) blank spaces
            for(int j = 1; j <= (n-i) ;j++)
                System.out.print(" ");

            // Step 2 : print (2i -1) stars
            for(int j = 1; j <= (2*i-1) ;j++)
                System.out.print("*");

            // Step 3 : print (n-i) blank spaces again
            for(int j = 1; j <= (n-i) ;j++)
                System.out.print(" ");

            // come on next line
            System.out.println();
        }
    }
}
