package com.dammah;

// https://leetcode.com/problems/richest-customer-wealth/

import java.util.Arrays;

/**
 * Input: accounts = [[1,2,3],[3,2,1]]
 * Output: 6
 */

public class RichestCustomerWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;
        for (int i = 0; i < accounts.length; i++) {
            int actual = Arrays.stream(accounts[i]).sum();
            if (actual > max) {
                max = actual;
            }
        }
        return max;
    }
}
