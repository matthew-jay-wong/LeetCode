package io.github.matthewjaywong.java.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/isomorphic-strings/description/">205. Isomorphic Strings</a>
 * </h1>
 * <h2>
 *     Top Interview 150
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given two strings s and t, determine if they are isomorphic.
 * </p>
 * <p>
 *     Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * </p>
 * <p>
 *     All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 * </p>
 */
public class IsomorphicStrings {
    public boolean solution(String s, String t) {
        Map<Character, Character> charMap = new HashMap<>();
        Set<Character> mapped = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if (!charMap.containsKey(sChar) && mapped.contains(tChar))
                return false;

            charMap.putIfAbsent(sChar, tChar);
            mapped.add(tChar);
            if (charMap.get(sChar) != tChar)
                return false;
        }

        return true;
    }
}
