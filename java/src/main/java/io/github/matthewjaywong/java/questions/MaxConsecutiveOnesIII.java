package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/max-consecutive-ones-iii/description/">1004. Max Consecutive Ones III</a>
 * </h1>
 * <h2>
 * LeetCode 75
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Given a binary array nums and an integer k, return the maximum number of consecutive 1's in the array if you can flip at most k 0's.
 * </p>
 */
public class MaxConsecutiveOnesIII {
    public int solution(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        for (int slow = 0; slow < nums.length; slow++) {
            if (slow > 0 && nums[slow] == 1 && nums[slow - 1] == 1)
                continue;

            int flipCount = 0;
            boolean reachedEnd = true;
            for (int fast = slow; fast < nums.length; fast++) {
                if (nums[fast] == 0 && flipCount < k)
                    flipCount += 1;
                else if (nums[fast] == 0 && flipCount == k) {
                    max = Math.max(max, fast - slow);
                    reachedEnd = false;
                    break;
                }
            }

            if (reachedEnd) {
                max = Math.max(max, nums.length - slow);
                return max;
            }
        }

        return max;
    }
}
