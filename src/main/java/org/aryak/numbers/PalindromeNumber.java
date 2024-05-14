package org.aryak.numbers;

public class PalindromeNumber {

    /**
     * Time complexity : O (log10(n))
     * @param n
     * @return
     */
    public boolean isPalindrome(int n) {
        int t = n;
        int reverse = 0;
        int noOfDigits = 0;
        while ( n > 0 ) {
            int d = n % 10;
            noOfDigits++;
            reverse = reverse * 10 + d;
            n = n / 10;
        }
        // noOfDigits short-circuited for single digit edge cases
        return noOfDigits > 1 && t == reverse ;
    }
}
