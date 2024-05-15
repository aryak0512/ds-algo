package org.aryak.recursion;

public class SumOfCubeOfNumbers {

    public int sumOfCubes(int n) {

        if ( n > 1 ) {
            return (int) Math.pow(n,3) + sumOfCubes(n - 1);
        }

        return 1;
    }
}
