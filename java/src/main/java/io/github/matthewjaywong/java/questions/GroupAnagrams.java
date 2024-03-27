package io.github.matthewjaywong.java.questions;

import java.util.*;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/group-anagrams/description/">49. Group Anagrams</a>
 * </h1>
 * <h2>
 * Top Interview 150
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * </p>
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 * </p>
 */
public class GroupAnagrams {
    public List<List<String>> solution(String[] strs) {
        Map<String, List<String>> res = new HashMap<>();
        for (String str : strs) {
            char[] sorted = str.toCharArray();
            Arrays.sort(sorted);
            String key = String.valueOf(sorted);
            res.putIfAbsent(key, new ArrayList<>());
            res.computeIfPresent(key, (k, v) -> {
                v.add(str);
                return v;
            });
        }

        return new ArrayList<>(res.values());
    }
}
