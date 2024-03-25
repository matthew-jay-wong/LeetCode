package io.github.matthewjaywong.java.questions;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/">167. Two Sum II - Input Array Is Sorted</a>
 * </h1>
 * <h2>
 * Top Interview 150
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 <= numbers.length.
 * </p>
 * <p>
 * Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.
 * </p>
 * <p>
 * The tests are generated such that there is exactly one solution. You may not use the same element twice.
 * </p>
 * <p>
 * Your solution must use only constant extra space.
 * </p>
 */
public class TwoSumII {
    public int[] solution(int[] numbers, int target) {
        if (numbers.length == 2)
            return new int[]{1, 2};

        for (int slow = 0; slow < numbers.length - 1; slow++) {
            for (int fast = slow + 1; numbers[slow] + numbers[fast] <= target; fast++) {
                if (numbers[slow] + numbers[fast] == target)
                    return new int[]{slow, fast};
            }
        }

        return new int[]{};
    }
}
