package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/find-the-duplicate-number/">287. Find the Duplicate Number</a>
 * </h1>
 * <h2>
 *     Question of the Day: 24-03-2024
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
 * </p>
 * <p>
 *     There is only one repeated number in nums, return this repeated number.
 * </p>
 * <p>
 *     You must solve the problem without modifying the array nums and uses only constant extra space.
 * </p>
 */
public class FindTheDuplicateNumber {
    public int solution(int[] nums) {
        int slow = 0;
        int fast = 0;
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow != fast);

        slow = 0;
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }
}
