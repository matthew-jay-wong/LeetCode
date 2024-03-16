package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/max-consecutive-ones-iii/description/">1004. Max Consecutive Ones III</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * </p>
 */
public class MaxConsecutiveOnesIII {
    public int solution(int[] nums, int k) {
        int last1 = -1;
        int i = 0;
        while (i < nums.length) {
            while (nums[i] == 0)
                i += 1;
            int left = i;

            while (nums[i] == 1)
                i += 1;
            int right  = i;
        }
        return -1;// TODO
    }
}
