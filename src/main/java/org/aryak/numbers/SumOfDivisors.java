package org.aryak.numbers;

public class SumOfDivisors {

    /**
     * @implNote Time Complexity : O(n)
     * @see <a href="https://www.geeksforgeeks.org/problems/sum-of-all-divisors-from-1-to-n4738/1">...</a>
     * @apiNote Given a positive integer N., The task is to find the value of Σi from 1 to N F(i) where function F(i) for the number i is defined as the sum of all divisors of i.
     * @param n
     * @return
     */
    public int sumOfDivisors(int n) {
        int answer = 0;
        for ( int i = 1; i <= n; i++ ) {
            answer = answer + i * (n / i);
        }
        return answer;
    }
}
