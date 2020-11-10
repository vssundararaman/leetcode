package com.vidya.amazon.arraysandstrings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Output: Because nums[0] + nums[1] == 9, we return [0, 1].
 * Example 2:
 *
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * Example 3:
 *
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
public class TwoSum {

    public static void main(String[] args) {

        int[] nums = {2,7,15,24};

        System.out.println(Arrays.toString(addSum(nums, 9)));
    }

    static int[] addSum(int[] nums, int target){
        Map<Integer, Integer> count = new HashMap<>();

        for(int i=0; i < nums.length; i++){
            int compliment = target - nums[i];

            if(count.containsKey(compliment)){
                return new int[] {count.get(compliment), i};
            }

            count.put(nums[i],i);
        }

        throw new IllegalArgumentException("No Solution Found");
    }
}
