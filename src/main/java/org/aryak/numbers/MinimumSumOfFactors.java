package org.aryak.numbers;

public class MinimumSumOfFactors {

    public int minimumSum(int n) {
        int minSum = Integer.MAX_VALUE;
        for ( int i = 1; i < Math.sqrt(n); i++ ) {
            if ( n % i == 0 ) {
                // then i & (n/i) are factors
                System.out.println("Factors : " + i +" and :" + n/i);
               if( i + (n/i) < minSum ){
                   minSum =  i + (n/i);
               }
            }
        }
        return minSum;
    }
}
