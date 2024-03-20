package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 * <a href="https://leetcode.com/explore/interview/card/top-interview-questions-easy/92/array/727/">Remove Duplicates from Sorted Array</a>
 * </h1>
 * <h2>
 * Top Interview Questions: Easy Collection
 * </h2>
 * <p>
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 * </p>
 * <p>
 * Consider the number of unique elements of nums to be k, to get accepted, you need to do the following things:
 * </p>
 * <ul>
 *     <li>Change the array nums such that the first k elements of nums contain the unique elements in the order they were present in nums initially. The remaining elements of nums are not important as well as the size of nums.</li>
 *     <li>Return k.</li>
 * </ul>
 */
public class RemoveDuplicatesFromSortedArray {
    public int solution(int[] nums) {
        if (nums.length == 1)
            return 1;

        int slow = 0;
        int k = 1;
        for (int fast = 1; fast < nums.length; fast++) {
            if (nums[slow] == nums[fast])
                continue;

            nums[slow + 1] = nums[fast];
            slow += 1;
            k += 1;
        }

        return k;
    }
}
