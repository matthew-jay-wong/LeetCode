package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/product-of-array-except-self/description/">238. Product of Array Except Self</a>
 * </h1>
 * <h2>LeetCode 75</h2>
 * <h3>Medium</h3>
 * <p>
 *     Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
 * </p>
 * <p>
 *     The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
 * </p>
 * <p>
 *     You must write an algorithm that runs in O(n) time and without using the division operation.
 * </p>
 */
public class ProductOfArrayExceptSelf {
    public int[] solution(int[] nums) {

        int[] left = new int[nums.length];
        int[] right = new int[nums.length];
        Arrays.fill(left, 1);
        Arrays.fill(right, 1);

        for (int i = 1; i < nums.length; i++)
            left[i] = left[i - 1] * nums[i - 1];

        for (int i = nums.length - 2; i >= 0; i--)
            right[i] = right[i + 1] * nums[i + 1];

        for (int i = 0; i < nums.length; i++)
            left[i] *= right[i];

        return left;
    }
}
