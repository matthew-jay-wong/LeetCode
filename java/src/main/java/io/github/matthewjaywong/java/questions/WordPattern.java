package io.github.matthewjaywong.java.questions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/word-pattern/description/">290. Word Pattern</a>
 * </h1>
 * <h2>
 *     Top Interview 150
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given a pattern and a string s, find if s follows the same pattern.
 * </p>
 * <p>
 *     Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 * </p>
 */
public class WordPattern {
    public boolean solution(String pattern, String s) {
        String[] split = s.split(" ");
        if (split.length != pattern.length())
            return false;

        Map<Character, String> map = new HashMap<>();
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < split.length; i++) {
            char curPattern = pattern.charAt(i);
            String curSplit = split[i].strip();
            if (!map.containsKey(curPattern)) {
                if (seen.contains(curSplit))
                    return false;
                map.putIfAbsent(curPattern, curSplit);
                seen.add(curSplit);
            }

            if (!map.get(curPattern).equals(curSplit))
                return false;
        }

        return true;
    }
}
