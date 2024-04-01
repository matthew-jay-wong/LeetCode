package io.github.matthewjaywong.java.questions.april2024;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/length-of-last-word/description/">58. Length of Last Word</a>
 * </h1>
 * <h2>
 * Question of the Day: 01-04-2024
 * </h2>
 * <h3>
 * Easy
 * </h3>
 * <p>
 * Given a string s consisting of words and spaces, return the length of the last word in the string.
 * </p>
 * <p>
 * A word is a maximal
 * substring
 * consisting of non-space characters only.
 * </p>
 */
public class LengthOfLastWord {
    public int solution(String s) {
        String[] split = s.split(" ");
        String last = split[split.length - 1];
        return last.length();
    }
}
