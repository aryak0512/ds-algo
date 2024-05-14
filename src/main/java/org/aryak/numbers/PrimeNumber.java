package org.aryak.numbers;

public class PrimeNumber {

    /**
     * @param n
     * @return
     * @apiNote Prime number defintion : "a number that has exactly 2 divisors - 1 & itself."
     * @Desription : Brute force approach - O(n)
     */
    public boolean isPrime(int n) {
        int noOfDivisors = 0;
        for ( int i = 1; i <= n; i++ ) {
            if ( n % i == 0 ) {
                noOfDivisors++;
            }
        }
        return noOfDivisors == 2;
    }

    /**
     * @param n
     * @return
     * @apiNote Go from 1 to sqrt of n
     * @Desription : Optimal approach - O (sqrt n)
     */
    public boolean isPrimeV2(int n) {
        int noOfDivisors = 0;
        for ( int i = 1; i <= Math.sqrt(n) ; i++ ) {
            if ( n % i == 0 ) {
                noOfDivisors++;
                // checking if 4*4=16 [then 4 will come 2 times]
                if( n / i != i){
                    noOfDivisors++;
                }
            }
        }
        return noOfDivisors == 2;
    }
}
