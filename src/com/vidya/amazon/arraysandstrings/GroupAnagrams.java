package com.vidya.amazon.arraysandstrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};

        System.out.println(groupAnagrams(strings));

        String[] strings1 = {"a"};
        System.out.println(groupAnagrams(strings1));
    }
    static List<List<String>> groupAnagrams(String[] strings){

        if(strings == null || strings.length == 0){
            return new ArrayList<>();
        }

        List<List<String>> result = new ArrayList<>();
        Map<String,ArrayList<String>> stringMap = new HashMap<>();

        for(String str: strings){
            char[] chars = new char[26];

            for(int i = 0; i < str.length() ;i++){
                chars[str.charAt(i) - 'a']++;
            }

            String newString = new String(chars);

            if(stringMap.containsKey(newString)){
                stringMap.get(newString).add(str);
            }else{
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add(str);
                stringMap.put(newString,arrayList);
            }
        }

        result.addAll(stringMap.values());

        return result;
    }
}
