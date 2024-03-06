package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/minimum-length-of-string-after-deleting-similar-ends">1750. Minimum Length of String After Deleting Similar Ends</a>
 * </h1>
 * <h2>
 *     Question of the Day: 05-03-2024
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given a string s consisting only of characters 'a', 'b', and 'c'.
 *     You are asked to apply the following algorithm on the string any number of times:
 * </p>
 * <ol>
 *     <li>Pick a non-empty prefix from the string s where all the characters in the prefix are equal.</li>
 *     <li>Pick a non-empty suffix from the string s where all the characters in this suffix are equal.</li>
 *     <li>The prefix and the suffix should not intersect at any index.</li>
 *     <li>The characters from the prefix and suffix must be the same.</li>
 *     <li>Delete both the prefix and the suffix.</li>
 * </ol>
 * <p>
 *     Return the minimum length of s after performing the above operation any number of times (possibly zero times).
 * </p>
 */
public class MinimumLengthOfStringAfterDeletingSimilarEnds {
    public int solution(String s) {
        String subStr = s;
        while (subStr.length() > 1 && subStr.charAt(0) == subStr.charAt(subStr.length() - 1)) {
            int startIndex = 1;
            while (startIndex < subStr.length() && subStr.charAt(startIndex) == subStr.charAt(0))
                startIndex += 1;
            subStr = subStr.substring(startIndex);
            if (subStr.isEmpty())
                return 0;

            int endIndex = subStr.length() - 2;
            while (endIndex >= 0 && subStr.charAt(endIndex) == subStr.charAt(subStr.length() - 1))
                endIndex -= 1;
            subStr = subStr.substring(0, endIndex + 1);
        }

        return subStr.length();
    }
}
