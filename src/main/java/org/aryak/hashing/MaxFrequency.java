package org.aryak.hashing;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {

    public static void main(String[] args) {
        int [] nums = new int []{1,2,4,3,3};
        int ans = new MaxFrequency().maxFrequency(nums, 3);
        System.out.println(ans);
    }

    public int maxFrequency(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for ( int n : nums ) {
            int i = map.get(n) == null ? 0 : map.get(n);
            map.put(n, i + 1);
        }
        return map.values().stream().max(Comparator.comparingInt(t -> t)).get();
    }
}
