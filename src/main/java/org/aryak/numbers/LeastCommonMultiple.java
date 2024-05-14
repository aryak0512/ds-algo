package org.aryak.numbers;

public class LeastCommonMultiple {

    /**
     * @apiNote : LCM of a and b = a*b / GCD(a, b) where GCD can be determined by Euclidean algorithm
     * @param a
     * @param b
     * @return
     */
    public long lcm(int a, int b) {
        int gcd = new GreatestCommonDivisor().gcdEuclidean(a, b);
        long product = (long)a*b; // very crucial typecasting
        return product/ gcd;
    }
}
