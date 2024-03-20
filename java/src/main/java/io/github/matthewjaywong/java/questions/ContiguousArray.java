package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/contiguous-array/description/">525. Contiguous Array</a>
 * </h1>
 * <h2>
 *     Question of the Day: 16-03-2024
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given a binary array nums, return the maximum length of a contiguous subarray with an equal number of 0 and 1.
 * </p>
 */
public class ContiguousArray {
    public int solution(int[] nums) {
        int globalMax = 0;
        for (int slowIndex = 0; slowIndex < nums.length; slowIndex++) {
            int oneCount = 0;
            int zeroCount = 0;
            int localMax = 0;
            for (int fastIndex = slowIndex; fastIndex < nums.length; fastIndex++) {
                if (nums[fastIndex] == 0)
                    zeroCount += 1;
                else
                    oneCount += 1;

                if (zeroCount == oneCount)
                    localMax = zeroCount + oneCount;
            }

            globalMax = Math.max(globalMax, localMax);
        }

        return globalMax;
    }
}
