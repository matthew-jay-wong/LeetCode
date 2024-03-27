package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/subarray-product-less-than-k/description/">713. Subarray Product Less Than K</a>
 * </h1>
 * <h2>
 *     Question of the Day: 27-03-2024
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given an array of integers nums and an integer k, return the number of contiguous subarrays where the product of all the elements in the subarray is strictly less than k.
 * </p>
 */
public class SubarrayProductLessThanK {
    public int solution(int[] nums, int k) {
        int res = 0;
        for (int slow = 0; slow < nums.length; slow++) {
            int sum = 1;
            for (int fast = slow; fast < nums.length; fast++) {
                sum *= nums[fast];
                if (sum < k)
                    res += 1;
                else
                    break;
            }
        }

        return res;
    }
}
