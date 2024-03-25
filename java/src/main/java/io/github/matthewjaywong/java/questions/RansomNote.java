package io.github.matthewjaywong.java.questions;

import java.util.HashMap;
import java.util.Map;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/ransom-note/description/">383. Ransom Note</a>
 * </h1>
 * <h2>
 *     Top Interview 150
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.
 * </p>
 * <p>
 *     Each letter in magazine can only be used once in ransomNote.
 * </p>
 */
public class RansomNote {
    public boolean solution(String ransomNote, String magazine) {
        Map<Character, Integer> magazineMap = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            magazineMap.putIfAbsent(c, 0);
            magazineMap.computeIfPresent(c, (k, v) -> v + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0)
                return false;

            magazineMap.computeIfPresent(c, (k, v) -> v - 1);
        }

        return true;
    }
}
