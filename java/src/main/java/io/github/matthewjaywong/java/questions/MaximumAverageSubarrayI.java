package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/maximum-average-subarray-i/description">643. Maximum Average Subarray I</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     You are given an integer array nums consisting of n elements, and an integer k.
 * </p>
 * <p>
 *     Find a contiguous subarray whose length is equal to k that has the maximum average value and return this value. Any answer with a calculation error less than 10-5 will be accepted.
 * </p>
 */
public class MaximumAverageSubarrayI {
    public double solution(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        double sum = 0;
        for (int j = 0; j < k; j++)
            sum += nums[k - 1 - j];
        max = Math.max(max, sum);

        for (int i = k; i < nums.length; i++) {
            sum -= nums[i - k];
            sum += nums[i];
            max = Math.max(max, sum);
        }

        return max / k;
    }
}
