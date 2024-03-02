package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/maximum-odd-binary-number/description/">2864. Maximum Odd Binary Number:</a>
 * </h1>
 * <h2>Question of the Day: 01-03-2024</h2>
 * <h3>Easy</h3>
 * <p>You are given a binary string s that contains at least one '1'.</p>
 * <p>You have to rearrange the bits in such a way that the resulting binary number is the maximum odd binary number that can be created from this combination.</p>
 * <p>Return a string representing the maximum odd binary number that can be created from the given combination.</p>
 * <p>Note that the resulting string can have leading zeros.</p>
 */
public class MaximumOddBinaryNumber {
    public String solution(String s) {
        int oneCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '1')
                oneCount += 1;
        }

        int zeroCount = s.length() - oneCount;
        if (oneCount == 1)
            return "0".repeat(s.length() - 1) + "1";

        return "1".repeat(oneCount - 1) + "0".repeat(zeroCount) + "1";
    }
}
