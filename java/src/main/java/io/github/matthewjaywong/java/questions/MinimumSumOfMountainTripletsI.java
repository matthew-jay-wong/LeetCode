package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/minimum-sum-of-mountain-triplets-i/">2908. Minimum Sum of Mountain Triplets I</a>
 * </h1>
 * <h2>07-03-2024</h2>
 * <h3>Easy</h3>
 * <p>
 *     A triplet of indices <code>(i, j, k)</code> is a mountain if:
 * </p>
 * <ul>
 *     <li>
 *         <code>i < j < k</code>
 *     </li>
 *     <li>
 *         <code>nums[i] < nums[j] and nums[k] < nums[j]</code>
 *     </li>
 * </ul>
 * <p>
 *     Return the minimum possible sum of a mountain triplet of nums. If no such triplet exists, return -1.
 * </p>
 */
public class MinimumSumOfMountainTripletsI {
    public int solution(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i + 2 < nums.length; i++) {
            for (int j = i + 1; j + 1 < nums.length; j++) {
                if (nums[i] >= nums[j])
                    continue;

                for (int k = j + 1; k < nums.length; k++) {
                    if (nums[k] < nums[j])
                        min = Math.min(min, nums[i] + nums[j] + nums[k]);
                }
            }
        }

        return min == Integer.MAX_VALUE ? -1 : min;
    }
}
