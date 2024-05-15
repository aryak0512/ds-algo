package org.aryak.patterns;

/**
 * 1
 * 0 1
 * 1 0 1
 */
public class Pattern10 {

    public static void main(String[] args) {
        //method1();
        method2();
    }

    // better way
    private static void method2() {
        int n =3;
        int num =0;

        for ( int i = 1; i <= n; i++ ) {
            if ( i % 2 == 0 ) {
                num = 0;
            } else {
                num = 1;
            }
            for ( int j = 1; j <= i; j++ ) {
                System.out.print(num + " ");
                num = 1 - num;
            }
            System.out.println();
        }
    }

    private static void method1() {
        int n = 4;
        int num = 1;
        for ( int i = 1; i <= n; i++ ) {
            for ( int j = 1; j <= i; j++ ) {
                if ( i % 2 != 0 ) {
                    if ( j % 2 != 0 ) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                } else {
                    if ( j % 2 == 0 ) {
                        System.out.print("1 ");
                    } else {
                        System.out.print("0 ");
                    }
                }
            }
            System.out.println();
        }
    }
}
