package com.vidya.leetcode;

/**
 * Given two strings word1 and word2, return the minimum number of operations required to convert word1 to word2.
 *
 * You have the following three operations permitted on a word:
 *
 * Insert a character
 * Delete a character
 * Replace a character
 *
 *
 * Example 1:
 *
 * Input: word1 = "horse", word2 = "ros"
 * Output: 3
 * Explanation:
 * horse -> rorse (replace 'h' with 'r')
 * rorse -> rose (remove 'r')
 * rose -> ros (remove 'e')
 * Example 2:
 *
 * Input: word1 = "intention", word2 = "execution"
 * Output: 5
 * Explanation:
 * intention -> inention (remove 't')
 * inention -> enention (replace 'i' with 'e')
 * enention -> exention (replace 'n' with 'x')
 * exention -> exection (replace 'n' with 'c')
 * exection -> execution (insert 'u')
 *
 *
 * Constraints:
 *
 * 0 <= word1.length, word2.length <= 500
 * word1 and word2 consist of lowercase English letters.
 */
public class EditDistance {

    public static void main(String[] args) {

    }

    static int minDistance(String word1, String word2){

        // dp[i][j] : minimum steps to convert i long word1 and j long word2
        int dp[][] = new int[word1.length()+1][word2.length()+1];


        for(int i=0;i<word1.length();i++) dp[i][0]= i;
        for(int j=0;j<word2.length();j++) dp[0][j] = j;

        


    }
}
