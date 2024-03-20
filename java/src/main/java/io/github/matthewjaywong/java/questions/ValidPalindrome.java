package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/valid-palindrome/description/">125. Valid Palindrome</a>
 * </h1>
 * <h2>
 *     Top Interview 150
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
 * </p>
 * <p>
 *     Given a string s, return true if it is a palindrome, or false otherwise.
 * </p>
 */
public class ValidPalindrome {
    public boolean solution(String s) {
        String lowerAndFiltered =
                Arrays.stream(s.toLowerCase().split("")).map(String::valueOf).filter(c -> c.matches("^[a-z]$")).collect(Collectors.joining());
        return lowerAndFiltered.contentEquals(new StringBuilder(lowerAndFiltered).reverse());
    }
}
