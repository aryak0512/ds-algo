package org.aryak.recursion;

public class PalindromeString {

    // using iterative, single pointer approach
    public boolean isPalindromeV1(String s) {
        int i = s.length() - 1;
        int mid = (s.length() -1)/ 2;
        while ( i > mid) {
            if ( s.charAt(i) != s.charAt(s.length() - 1 - i) )
                return false;
            i--;
        }
        return true;
    }


    /* *
     * using RECURSIVE approach
     *
     * @apiNote : i starts from right most character at moves to the left till midway
     * @param i
     * @param s
     * @return
     */
    public boolean isPalindromeV2(int i, String s) {
        int mid = (s.length() - 1) / 2;
        if ( i < mid ) {
            return true;
        }
        // check corresponding other side character
        if ( s.charAt(i) != s.charAt(s.length() - 1 - i) )
            return false;
        return isPalindromeV2(i - 1, s);

    }

    private void swap(int i, int j, StringBuilder s) {
        char temp = s.charAt(i);
        s.setCharAt(i, s.charAt(j));
        s.setCharAt(j, temp);
    }

    public String removeNonAlphabets(String s){
        StringBuilder sb = new StringBuilder();
        for ( int i = 0; i < s.length(); i++ ) {
            if ( isAlphabet(s.charAt(i)) ) {
                sb.append((s.charAt(i)));
            }
        }
        return sb.toString().toLowerCase();
    }

    /**
     * @apiNote
     * condition 1 : A-Z
     * condition 2 : a-z
     * condition 3 : numeric 0-9
     * @param asciiValue
     * @return
     */
    private boolean isAlphabet(char asciiValue) {
        return (asciiValue >= 65 && asciiValue <=90) ||
                (asciiValue >= 97 && asciiValue <=122) ||
                (asciiValue >= 48 && asciiValue <= 57);
    }
}
