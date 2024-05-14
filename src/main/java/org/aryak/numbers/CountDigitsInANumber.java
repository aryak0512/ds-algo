package org.aryak.numbers;

public class CountDigitsInANumber {

    /**
     * Time complexity : O (log10(n))
     * @param n
     * @return
     */
    public int getNumberOfDigits(int n) {
        if ( n == 0 ) {
            return 1;
        }
        return ((int) Math.log10(n)) + 1;
    }

    /**
     * Time complexity : O (log10(n))
     * @param n
     * @return
     */
    public int getNumberOfDigitsV2(int n) {
        if ( n == 0 ) {
            return 1;
        }

        int count = 0;
        while ( n > 0 ) {
            int digit = n % 10;
            System.out.println("Digit is : " + digit);
            count += 1;
            n = n / 10;
        }
        return count;
    }
}
