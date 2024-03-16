package io.github.matthewjaywong.java.questions;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/determine-if-two-strings-are-close/description/">1657. Determine if Two Strings Are Close</a>
 * </h1>
 * <h2>
 * LeetCode 75
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Two strings are considered close if you can attain one from the other using the following operations:
 * </p>
 * <ul>
 *     <li>
 *         Operation 1: Swap any two existing characters.
 *         <ul>
 *             <li>For example, abcde -> aecdb</li>
 *         </ul>
 *     </li>
 *     <li>
 *         Operation 2: Transform every occurrence of one existing character into another existing character, and do the same with the other character.
 *         <ul>
 *             <li>For example, aacabb -> bbcbaa (all a's turn into b's, and all b's turn into a's)</li>
 *         </ul>
 *     </li>
 * </ul>
 * <p>
 *     You can use the operations on either string as many times as necessary.
 * </p>
 * <p>
 *     Given two strings, word1 and word2, return true if word1 and word2 are close, and false otherwise.
 * </p>
 */
public class DetermineIfTwoStringsAreClose {
    public boolean solution(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        Map<Character, Integer> word1CountMap = new HashMap<>();
        for (char c : word1.toCharArray()) {
            word1CountMap.putIfAbsent(c, 0);
            word1CountMap.computeIfPresent(c, (key, val) -> val + 1);
        }

        Map<Character, Integer> word2CountMap = new HashMap<>();
        for (char c : word2.toCharArray()) {
            word2CountMap.putIfAbsent(c, 0);
            word2CountMap.computeIfPresent(c, (key, val) -> val + 1);
        }

        return word1CountMap.keySet().equals(word2CountMap.keySet())
                && word1CountMap.values().stream().sorted().toList().equals(word2CountMap.values().stream().sorted().toList());
    }
}
