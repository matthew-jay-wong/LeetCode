package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/move-zeroes/">283. Move Zeroes</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
 * </p>
 * <p>
 *     Note that you must do this in-place without making a copy of the array.
 * </p>
 */
public class MoveZeroes {
    public void solution(int[] nums) {
        int slow = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[slow] = nums[i];
                slow += 1;
            }
        }

        for (int i = slow; i < nums.length; i++)
            nums[i] = 0;
    }
}
