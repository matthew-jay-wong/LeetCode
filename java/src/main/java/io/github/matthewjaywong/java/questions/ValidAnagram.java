package io.github.matthewjaywong.java.questions;

import java.util.Arrays;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/valid-anagram/description/">242. Valid Anagram</a>
 * </h1>
 * <h2>
 *     Top Interview 150
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given two strings s and t, return true if t is an anagram of s, and false otherwise.
 * </p>
 * <p>
 *     An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * </p>
 */
public class ValidAnagram {
    public static void main(String[] args) {
        ValidAnagram validAnagram = new ValidAnagram();
        validAnagram.solution("anagram", "nagaram");
    }
    public boolean solution(String s, String t) {
        char[] sortedS = s.toCharArray();
        Arrays.sort(sortedS);

        char[] sortedT = t.toCharArray();
        Arrays.sort(sortedT);

        return String.valueOf(sortedS).equals(String.valueOf(sortedT));
    }
}
