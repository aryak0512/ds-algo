package org.aryak.numbers;

public class GeometricProgression {

    public int findNthTermOfGP(int a, int r, int n) {
        // formula tn = ar raise to n-1
        long product = a * (long) Math.pow(r, n - 1);
        return (int) product;
    }
}
