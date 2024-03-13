package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/reverse-vowels-of-a-string/description/">345. Reverse Vowels of a String</a>
 * </h1>
 * <h2>LeetCode 75</h2>
 * <h3>Easy</h3>
 * <p>
 * Given a string s, reverse only all the vowels in the string and return it.
 * </p>
 * <p>
 * The vowels are 'a', 'e', 'i', 'o', and 'u', and they can appear in both lower and upper cases, more than once.
 * </p>
 */
public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        String VOWELS = "aeiouAEIOU";
        Stack<Character> encounteredVowels = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (VOWELS.indexOf(cur) != -1)
                encounteredVowels.push(cur);
        }

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (VOWELS.indexOf(cur) == -1)
                res.append(cur);
            else
                res.append(encounteredVowels.pop());
        }

        return res.toString();
    }
}
