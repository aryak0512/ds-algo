package org.aryak.recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        print(3);
    }

    public static void print(int n) {
        if ( n > 1 ) {
            print(n - 1);
        }
        System.out.print(n + " ");
    }
}
