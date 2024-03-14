package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/binary-subarrays-with-sum/description/">930. Binary Subarrays With Sum</a>
 * </h1>
 * <h2>Question of the Day: 14-03-2024</h2>
 * <h3>Medium</h3>
 * <p>
 * Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.
 * </p>
 * <p>
 * A subarray is a contiguous part of the array.
 * </p>
 */
public class BinarySubarraysWithSum {
    public int solution(int[] nums, int goal) {
        int goalCount = 0;
        for (int i = 0; i < nums.length; i++) {
            int curCount = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (curCount == goal)
                    goalCount += 1;

                curCount += nums[j];
                if (curCount > goal)
                    break;
            }

            if (curCount == goal)
                goalCount += 1;
        }

        return goalCount;
    }
}
