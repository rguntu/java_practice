package set1;

import java.util.HashMap;
import java.util.Map;

public class LongestSubArrayWithSumK {

//    Input: nums = [1, -1, 5, -2, 3], k = 3
//    Output: 4
//
    public static void main(String[] args) {
        int [] nums = {1, -1, 5, -2, 3};
        int k = 3;
        sol(nums,k);
    }

    private static void sol(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        mp.put(0,-1);
        int count = 0;
        int sum = 0;
        int maxLen = 0;
        for(int currentIndex=0; currentIndex<nums.length; currentIndex++) {
            sum = sum+nums[currentIndex];
            if(mp.containsKey(sum-k)) {
                int pIndex = mp.get(sum-k);
                maxLen = Math.max(currentIndex - pIndex, maxLen);
            }
            mp.putIfAbsent(sum, currentIndex);
        }
        System.out.println(maxLen);
    }
}
