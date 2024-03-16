package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/max-number-of-k-sum-pairs/description">1679. Max Number of K-Sum Pairs</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     You are given an integer array nums and an integer k.
 * </p>
 * <p>
 *     In one operation, you can pick two numbers from the array whose sum equals k and remove them from the array.
 * </p>
 * <p>
 *     Return the maximum number of operations you can perform on the array.
 * </p>
 */
public class MaxNumberOfKSumPairs {
    public int solution(int[] nums, int k) {
        Arrays.sort(nums);
        int res = 0;
        int i = 0;
        int j = nums.length - 1;
        while (i < j) {
            int sum = nums[i] + nums[j];
            if (sum == k) {
                res += 1;
                i += 1;
                j -= 1;
            } else if (sum < k) {
                i += 1;
            } else {
                j -= 1;
            }
        }

        return res;
    }
}
