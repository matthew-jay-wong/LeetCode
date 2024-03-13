package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/is-subsequence/description/">392. Is Subsequence</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
 * </p>
 * <p>
 *     A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
 * </p>
 */
public class IsSubsequence {
    public boolean solution(String s, String t) {
        int tIndex = 0;
        for (int i = 0; i < s.length(); i++) {
            char cur = s.charAt(i);
            boolean found = false;
            for (int j = tIndex; j < t.length(); j++) {
                if (cur == t.charAt(j)) {
                    found = true;
                    tIndex = j + 1;
                    break;
                }
            }

            if (!found)
                return false;
        }

        return true;
    }
}
