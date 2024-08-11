package org.aryak.recursion;

public class TaylorSeries {

    static double ans = 0;

    /**
     * @param x power of euler's number
     * @param n no. of terms
     * @return the value of taylor series expression till nth term
     */
    public double taylor(int x, int n) {

        if ( n == 1 ) {
            return 1;
        } else if ( n == 2 ) {
            return 1 + x;
        } else {
            int numerator = pow(x, n);
            int deno = fact(n);

            return numerator / (double) deno + taylor(x, n - 1);
        }
    }

    public int fact(int n) {

        if ( n > 1 ) {
            return fact(n - 1) * n;
        }
        return 1;
    }

    public int pow(int m, int n) {

        if ( n == 0 ) {
            return 1;
        }
        return m * pow(m, n - 1);
    }
}
