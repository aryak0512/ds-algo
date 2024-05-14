package org.aryak.numbers;

public class GreatestCommonDivisor {

    /**
     * @param n1
     * @param n2
     * @return
     * @apiNote Brute force logic
     */
    public int gcd(int n1, int n2) {
        int minimum = n1 < n2 ? n1 : n2;
        int gcd = 1;
        for ( int i = minimum; i >= 1; i-- ) {
            if ( n1 % i == 0 && n2 % i == 0 ) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    /**
     * @param a
     * @param b
     * @return
     * @apiNote Euclidean algorithm states that : gcd(a,b) = gcd(a%b, b) where a > b
     */
    public int gcdEuclideanAlgorithm(int a, int b) {

        if ( a > b ) {
            a = a % b;
        } else {
            b = b % a;
        }

        int gcd = 1;
        int minimum = a < b ? a : b;
        for ( int i = minimum; i >= 1; i-- ) {
            if ( a % i == 0 && b % i == 0 ) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    /**
     * @param a
     * @param b
     * @return
     * @apiNote Euclidean algorithm states that : gcd(a,b) = gcd(a%b,b) where a > b
     * This keeps making the numbers smaller - utlimately one number becomes zero.
     * The other which remains i.e. non-zero is the GCD.
     */
    public int gcdEuclidean(int a, int b) {

        while ( a > 0 && b > 0 ) {
            if ( a > b ) {
                a = a % b;
            } else {
                b = b % a;
            }
        }
        // at the end, one number will become zero, and the other which remains is the GCD
        return a == 0 ? b : a;
    }
}
