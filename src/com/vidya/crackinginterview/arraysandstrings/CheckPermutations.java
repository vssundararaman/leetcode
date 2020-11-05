package com.vidya.crackinginterview.arraysandstrings;

import java.util.Arrays;

public class CheckPermutations {
    public static void main(String[] args) {
        System.out.println(checkPermutations("god","dog"));
        System.out.println(checkPermutations("east","taes"));
    }

    static boolean checkPermutations(String string1, String string2){
        if(string1.length() != string2.length()){
            return false;
        }
        return Sort(string1).equals(Sort(string2));
    }

    static String Sort(String s){
        char[] content = s.toCharArray();
        Arrays.sort(content);
        return new String(content);
    }
}
