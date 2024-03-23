package io.github.matthewjaywong.java.questions;

import java.util.PriorityQueue;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/kth-largest-element-in-an-array/">215. Kth Largest Element in an Array</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given an integer array nums and an integer k, return the kth largest element in the array.
 * </p>
 * <p>
 *     Note that it is the kth largest element in the sorted order, not the kth distinct element.
 * </p>
 * <p>
 *     Can you solve it without sorting?
 * </p>
 */
public class KthLargestElementInAnArray {
    public int solution(int[] nums, int k) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for (int num : nums)
            priorityQueue.add(num);

        int res = priorityQueue.peek();
        for (int i = 0; i < nums.length - k; i++)
            res = priorityQueue.poll();

        return res;
    }
}
