package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/squares-of-a-sorted-array">977. Squares of a Sorted Array</a>
 * </h1>
 * <h2>Question of the Day: 02-03-2024</h2>
 * <h3>Easy</h3>
 * <p>
 *     Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
 * </p>
 */
public class SquaresOfASortedArray {
    // O(nLog(n))
//    public int[] solution(int[] nums) {
//        return Arrays.stream(nums)
//                .mapToDouble(num -> Math.pow(num, 2))
//                .mapToInt(num -> (int) num)
//                .sorted()
//                .toArray();
//    }

    // O(n)
    public int[] solution(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int[] res = new int[nums.length];
        int i = nums.length - 1;
        while (left <= right) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                res[i] = (int) Math.pow(nums[left], 2);
                left += 1;
            } else {
                res[i] = (int) Math.pow(nums[right], 2);
                right -= 1;
            }
            i -= 1;
        }

        return res;
    }
}
