package com.dammah;

public class Sum1DArray {
    public int[] runningSum(int[] nums) {
        int[] outArray = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                outArray[0] = nums[0];
            } else {
                outArray[i] = nums[i] + outArray[i-1];
            }
        }
        return outArray;
    }
}
