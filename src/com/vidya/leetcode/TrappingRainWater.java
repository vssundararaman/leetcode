package com.vidya.leetcode;

/**
 * Given n non-negative integers representing an elevation map where the width of each bar is 1, compute how much water it can trap after raining
 *
 * Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
 * Output: 6
 * Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. In this case, 6 units of rain water (blue section) are being trapped.
 * Example 2:
 *
 * Input: height = [4,2,0,3,2,5]
 * Output: 9
 */
public class TrappingRainWater {

    public static void main(String[] args) {

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingRainWater(height));

        int[] height1 = {4,2,0,3,2,5};
        System.out.println(trappingRainWater(height1));
    }

    static int trappingRainWater(int[] height) {

        if (height == null || height.length == 0) {
            return 0;
        }

        int water = 0, left = 0, level = 0, right = height.length - 1;

        while (left < right) {
            int lower = height[height[left] < height[right] ? left++ : right--];

            level = Math.max(level, lower);

            water += level - lower;
        }
        return water;

    }
}
