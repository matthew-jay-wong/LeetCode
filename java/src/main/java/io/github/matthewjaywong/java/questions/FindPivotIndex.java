package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/find-pivot-index/description/">724. Find Pivot Index</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given an array of integers nums, calculate the pivot index of this array.
 * </p>
 * <p>
 *     The pivot index is the index where the sum of all the numbers strictly to the left of the index is equal to the sum of all the numbers strictly to the index's right.
 * </p>
 * <p>
 *     If the index is on the left edge of the array, then the left sum is 0 because there are no elements to the left. This also applies to the right edge of the array.
 * </p>
 * <p>
 *     Return the leftmost pivot index. If no such index exists, return -1.
 * </p>
 */
public class FindPivotIndex {
    public int solution(int[] nums) {
        int[] left = new int[nums.length];
        left[0] = 0;
        for (int i = 1; i < nums.length; i++)
            left[i] = nums[i - 1] + left[i - 1];

        int[] right = new int[nums.length];
        right[nums.length - 1] = 0;
        for (int i = nums.length - 2; i >= 0; i--)
            right[i] = nums[i + 1] + right[i + 1];

        for (int i = 0; i < nums.length; i++) {
            if (left[i] == right[i])
                return i;
        }


        return -1; // TODO
    }
}
