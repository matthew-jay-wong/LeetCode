package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/increasing-triplet-subsequence/">334. Increasing Triplet Subsequence</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 */
public class IncreasingTripletSubsequence {
    public boolean solution(int[] nums) {
        int[] min = new int[nums.length];
        min[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            min[i] = Math.min(min[i - 1], nums[i]);

        int[] max = new int[nums.length];
        max[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--)
            max[i] = Math.max(max[i + 1], nums[i]);

        for (int i = 1; i < nums.length - 1; i++)
            if (min[i] < nums[i] && nums[i] < max[i])
                return true;

        return false;
    }
}
