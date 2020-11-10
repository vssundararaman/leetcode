package com.vidya.amazon.arraysandstrings;

import java.util.HashSet;
import java.util.Set;
/**
 *Given a string s, find the length of the longest substring without repeating characters.
 *
 *
 *
 * Example 1:
 *
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 * Example 2:
 *
 * Input: s = "bbbbb"
 * Output: 1
 * Explanation: The answer is "b", with the length of 1.
 * Example 3:
 *
 * Input: s = "pwwkew"
 * Output: 3
 * Explanation: The answer is "wke", with the length of 3.
 * Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
 * Example 4:
 *
 * Input: s = ""
 * Output: 0
 *
 *
 * Constraints:
 *
 * 0 <= s.length <= 5 * 104
 * s consists of English letters, digits, symbols and spaces.
 */
public class LongestSubStringWithoutRepeatingCharacter {

    public static void main(String[] args) {
        String string = "abcabcbb";
        System.out.println(lengthOfLongestSubString(string));
        string = "bbbbb";
        System.out.println(lengthOfLongestSubString(string));
        string = "pwwkew";
        System.out.println(lengthOfLongestSubString(string));
    }

    static int lengthOfLongestSubString(String string){
        if(string == null || string.length() ==0){
            return 0;
        }
        int aPointer = 0, bPointer = 0, max = 0;
        Set<Character> charSet = new HashSet<>();

        for(int i=0;i<string.length();i++){

            if(!charSet.contains(string.charAt(bPointer))){
                charSet.add(string.charAt(bPointer));
                bPointer++;
                max = Math.max(max,charSet.size());
            }else{
                charSet.remove(string.charAt(aPointer));
                aPointer++;
            }
        }
        return max;
    }
}
