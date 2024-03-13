package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/reverse-words-in-a-string/description/">151. Reverse Words in a String</a>
 * </h1>
 * <h2>LeetCode 75</h2>
 * <h3>Medium</h3>
 * <p>
 * Given an input string s, reverse the order of the words.
 * </p>
 * <p>
 * A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
 * </p>
 * <p>
 * Note that s may contain leading or trailing spaces or multiple spaces between two words. The returned string should only have a single space separating the words. Do not include any extra spaces.
 * </p>
 */
public class ReverseWordsInAString {
    public String solution(String s) {
        return String.join(
                " ",
                Arrays.stream(s.split(" "))
                        .filter(a -> !a.isBlank())
                        .collect(Collectors.toList())
                        .reversed()
        );
    }
}
