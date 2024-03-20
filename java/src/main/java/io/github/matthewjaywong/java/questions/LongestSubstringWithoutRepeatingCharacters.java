package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/longest-substring-without-repeating-characters/description/">3. Longest Substring Without Repeating Characters</a>
 * </h1>
 * <h2>
 * Top Interview 150
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Given a string s, find the length of the longest
 * substring
 * without repeating characters.
 * </p>
 */
public class LongestSubstringWithoutRepeatingCharacters {
    public int solution (String s) {
        if (s.isEmpty())
            return 0;

        int globalMaxSize = 1;
        int localStartIndex = 0;
        StringBuilder localStringBuilder = new StringBuilder();
        localStringBuilder.append(s.charAt(localStartIndex));
        for (int i = 1; i < s.length(); i++) {
            char cur = s.charAt(i);
            if (localStringBuilder.indexOf(String.valueOf(cur)) == -1) {
                localStringBuilder.append(cur);
                continue;
            }

            globalMaxSize = Math.max(i - localStartIndex + 1, globalMaxSize);
            localStringBuilder.delete(0, localStringBuilder.indexOf(String.valueOf(cur)) + 1);
            localStartIndex = s.indexOf(String.valueOf(cur), localStartIndex) + 1;
            i -= 1;
        }

        return globalMaxSize - 1;
    }
}
