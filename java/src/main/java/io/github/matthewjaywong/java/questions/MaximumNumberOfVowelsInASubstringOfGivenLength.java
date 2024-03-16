package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/maximum-number-of-vowels-in-a-substring-of-given-length/description">1456. Maximum Number of Vowels in a Substring of Given Length</a>
 * </h1>
 * <h2>
 * LeetCode 75
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Given a string s and an integer k, return the maximum number of vowel letters in any substring of s with length k.
 * </p>
 * <p>
 * Vowel letters in English are 'a', 'e', 'i', 'o', and 'u'.
 * </p>
 */
public class MaximumNumberOfVowelsInASubstringOfGivenLength {
    public int solution(String s, int k) {
        String vowels = "aeiou";
        int sum = 0;
        boolean firstIsVowel = false;
        for (int j = 0; j < k; j++) {
            if (vowels.indexOf(s.charAt(j)) == -1)
                continue;

            if (j == 0)
                firstIsVowel = true;
            sum += 1;
        }

        int max = sum;
        for (int i = k; i < s.length(); i++) {
            if (firstIsVowel)
                sum -= 1;

            firstIsVowel = vowels.indexOf(s.charAt(i - k + 1)) != -1;
            if (vowels.indexOf(s.charAt(i)) == -1)
                continue;

            sum += 1;
            max = Math.max(max, sum);
        }

        return max;
    }
}
