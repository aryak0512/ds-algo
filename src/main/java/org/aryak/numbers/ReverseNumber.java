package org.aryak.numbers;

public class ReverseNumber {

    /**
     * Time complexity : O (log10(n))
     * @param n
     * @return
     */
    public int reverse(int n) {
        int reverse = 0;
        while ( n > 0 ) {
            int d = n % 10;
            reverse = reverse * 10 + d;
            n = n/10;
        }
        //System.out.println("Reverse : " + reverse);
        return reverse;
    }
}
