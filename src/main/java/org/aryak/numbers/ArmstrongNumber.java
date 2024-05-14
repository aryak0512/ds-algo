package org.aryak.numbers;

public class ArmstrongNumber {

    public boolean isArmstong(int n) {
        int t = n;
        int noOfDigits = 0;
        int sumOfCubesOfDigits = 0;
        while ( n > 0 ) {
            noOfDigits++;
            int d = n % 10;
            sumOfCubesOfDigits += Math.pow(d, 3);
            n = n / 10;
        }
        return t == sumOfCubesOfDigits && noOfDigits >1;
    }
}
