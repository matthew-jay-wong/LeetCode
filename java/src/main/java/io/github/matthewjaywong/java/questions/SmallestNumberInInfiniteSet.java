package io.github.matthewjaywong.java.questions;

import java.util.PriorityQueue;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/smallest-number-in-infinite-set/description/">2336. Smallest Number in Infinite Set</a>
 * </h1>
 * <h2>
 * LeetCode 75
 * </h2>
 * <h3>
 * Medium
 * </h3>
 */
public class SmallestNumberInInfiniteSet {

    private final PriorityQueue<Integer> addedBack;
    private int cur;

    public SmallestNumberInInfiniteSet() {
        this.addedBack = new PriorityQueue<>();
        this.cur = 1;
    }

    public int popSmallest() {
        System.out.println(cur);
        if (this.addedBack.isEmpty() || this.cur < this.addedBack.peek())
            return cur++;

        return this.addedBack.poll();
    }

    public void addBack(int num) {
        System.out.println(num);
        if (num < this.cur && !this.addedBack.contains(num))
            this.addedBack.add(num);
    }
}
