package com.vidya.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Write an algorithm to determine if a number n is "happy".
 *
 * A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
 *
 * Return True if n is a happy number, and False if not.
 *
 * Example:
 *
 * Input: 19
 * Output: true
 * Explanation:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 */
public class HappyNumber {

    public static void main(String[] args) {
        int n = 19;

        System.out.println(isHappy(n));
    }

    static boolean isHappy(int n){

        Set<Integer> seen = new HashSet<>();

        while (n !=1){
            int current  = n;
            int sum = 0;

            while (current != 0){
                sum += (current % 10) * (current % 10);
                current /= 10;
            }

            if(seen.contains(sum)){
                return false;
            }

            seen.add(sum);
            n = sum;
        }

        return true;
    }
}
