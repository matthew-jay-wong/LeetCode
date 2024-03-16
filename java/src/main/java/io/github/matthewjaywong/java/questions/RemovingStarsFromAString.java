package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/removing-stars-from-a-string/description/">2390. Removing Stars From a String</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     You are given a string s, which contains stars *.
 * </p>
 * <p>
 *     In one operation, you can:
 * </p>
 * <ul>
 *     <li>Choose a star in s.</li>
 *     <li>Remove the closest non-star character to its left, as well as remove the star itself.</li>
 * </ul>
 * <p>
 *     Return the string after all stars have been removed.
 * </p>
 * <p>
 *     Note:1
 * </p>
 * <ul>
 *     <li>The input will be generated such that the operation is always possible.</li>
 *     <li>It can be shown that the resulting string will always be unique.</li>
 * </ul>
 */
public class RemovingStarsFromAString {
    public String solution(String s) {
        StringBuilder res = new StringBuilder();
        for (char c : s.toCharArray()) {
            res.append(c);
            if (c == '*')
                res.delete(res.length() - 2, res.length());
        }

        return res.toString();
    }
}
