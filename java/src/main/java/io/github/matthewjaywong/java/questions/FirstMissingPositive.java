package io.github.matthewjaywong.java.questions;

import java.util.Arrays;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/first-missing-positive/description/">41. First Missing Positive</a>
 * </h1>
 * <h2>
 *     Question of the Day: 26-03-2024
 * </h2>
 * <h3>
 *     Hard
 * </h3>
 * <p>
 *     Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.
 * </p>
 * <p>
 *     You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
 * </p>
 */
public class FirstMissingPositive {
    public int solution(int[] nums) {
        int[] seenMap = new int[nums.length];
        Arrays.fill(seenMap, -1);
        for (int num : nums) {
            if (0 < num && num <= nums.length)
                seenMap[num - 1] = num;
        }

        for (int i = 0; i < seenMap.length; i++) {
            if (seenMap[i] == -1)
                return i + 1;
        }

        return nums.length + 1;
    }
}
