package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.WeakHashMap;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/decode-string/description/">394. Decode String</a>
 * </h1>
 * <h2>
 * LeetCode 75
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * The encoding rule is: k[encoded_string], where the encoded_string inside the square brackets is being repeated exactly k times. Note that k is guaranteed to be a positive integer.
 * </p>
 * <p>
 * You may assume that the input string is always valid; there are no extra white spaces, square brackets are well-formed, etc. Furthermore, you may assume that the original data does not contain any digits and that digits are only for those repeat numbers, k. For example, there will not be input like 3a or 2[4].
 * </p>
 */
public class DecodeString {

    static char[] lowercaseArray = new char[26];
    static char[] numberArray = new char[10];

    static {
        for (int i = 0; i < lowercaseArray.length; i++)
            lowercaseArray[i] = (char) ('a' + i);

        for (int i = 0; i < 10; i++)
            numberArray[i] = (char) ('0' + i);
    }

    public String solution(String s) {
        if (s.matches("^[a-z]+$"))
            return s;

        StringBuilder res = new StringBuilder();
        StringBuilder repeatCount = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Arrays.binarySearch(lowercaseArray, c) >= 0)
                res.append(c);
            else if (Arrays.binarySearch(numberArray, c) >= 0)
                repeatCount.append(c);
            else if (c == '[') {
                StringBuilder recurse = new StringBuilder();
                i += 1;
                c = s.charAt(i);
                int openBracketCount = 0;
                while (c != ']' || openBracketCount > 0) {
                    if (c == ']') {
                        openBracketCount -= 1;
                        if (openBracketCount == 0)
                            break;
                    }

                    recurse.append(c);
                    i += 1;
                    if (i == s.length())
                        break;
                    c = s.charAt(i);
                    if (c == '[')
                        openBracketCount += 1;
                }
                i -= 1;
                String repeatCountStr = repeatCount.toString();
                int repeat = repeatCountStr.isBlank() ? 1 : Integer.parseInt(repeatCountStr);
                res.append(solution(recurse.toString()).repeat(repeat));
                repeatCount.delete(0, repeatCount.length());
            }
        }
        return res.toString();
    }
}
