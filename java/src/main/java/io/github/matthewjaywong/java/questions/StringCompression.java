package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/string-compression/description/">443. String Compression</a>
 * </h1>
 * <h2>LeetCode 75</h2>
 * <h3>Medium</h3>
 * <p>
 *     Given an array of characters chars, compress it using the following algorithm:
 * </p>
 * <ul>
 *     <ui>If the group's length is 1, append the character to s.</ui>
 *     <ui>Otherwise, append the character followed by the group's length.</ui>
 * </ul>
 * <p>
 *     The compressed string s should not be returned separately, but instead, be stored in the input character array chars. Note that group lengths that are 10 or longer will be split into multiple characters in chars.
 * </p>
 * <p>
 *     After you are done modifying the input array, return the new length of the array.
 * </p>
 * <p>
 *     You must write an algorithm that uses only constant extra space.
 * </p>
 */
public class StringCompression {
    public int compress(char[] chars) {
        int compressedIndex = 0;
        char cur = chars[0];
        int count = 1;

        for (int i = 1; i < chars.length; i++) {
            if (chars[i] == cur)
                count += 1;
            else {
                chars[compressedIndex] = cur;
                compressedIndex += 1;

                if (count > 1) {
                    char[] encode = String.valueOf(count).toCharArray();
                    for (int j = 1; j <= encode.length; j++) {
                        chars[compressedIndex] = encode[j];
                        compressedIndex += 1;
                    }
                }

                cur = chars[i];
                count = 1;
            }
        }

        return compressedIndex;
    }
}
