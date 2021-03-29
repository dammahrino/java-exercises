package com.dammah;

// https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithGreatesNumCandies {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();

        List<Boolean> output = new ArrayList<>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= max) {
                output.add(true);
            } else {
                output.add(false);
            }
        }

        return output;
    }
}
