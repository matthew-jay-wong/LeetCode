package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/minimum-size-subarray-sum/description/">209. Minimum Size Subarray Sum</a>
 * </h1>
 * <h2>
 * Top Interview 150
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Given an array of positive integers nums and a positive integer target, return the minimal length of a
 * subarray
 * whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.
 * </p>
 */
public class MinimumSizeSubarraySum {
    public int solution(int target, int[] nums) {
        int globalMinSize = Integer.MAX_VALUE;
        int localStartIndex = 0;
        int localSum = 0;

        for (int i = 0; i < nums.length; i++) {
            int cur = nums[i];
            if (cur >= target)
                return 1;

            if (localSum + cur < target) {
                localSum += cur;
                continue;
            }

            globalMinSize = Math.min(i - localStartIndex + 1, globalMinSize);
            localSum -= nums[localStartIndex];
            localStartIndex += 1;
            i -= 1;
        }

        return globalMinSize == Integer.MAX_VALUE ? 0 : globalMinSize;
    }
}
