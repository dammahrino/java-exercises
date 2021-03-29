package com.dammah;

// https://leetcode.com/problems/shuffle-the-array/

/**
 * Input: nums = [2,5,1,3,4,7], n = 3
 * Output: [2,3,5,4,1,7]
 */

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] out = new int[nums.length];
        for (int i = 0; i < n; i++) {
            out[i*2] = nums[i];
            out[i*2+1] = nums[n+i];
        }
        return out;
    }
}
