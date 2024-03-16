package io.github.matthewjaywong.java.questions;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/number-of-recent-calls/description/">933. Number of Recent Calls</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     You have a RecentCounter class which counts the number of recent requests within a certain time frame.
 * </p>
 * <p>
 *     Implement the RecentCounter class:
 * </p>
 * <ul>
 *     <li>RecentCounter() Initializes the counter with zero recent requests.</li>
 *     <li>int ping(int t) Adds a new request at time t, where t represents some time in milliseconds, and returns the number of requests that has happened in the past 3000 milliseconds (including the new request). Specifically, return the number of requests that have happened in the inclusive range [t - 3000, t].</li>
 * </ul>
 * <p>
 *     It is guaranteed that every call to ping uses a strictly larger value of t than the previous call.
 * </p>
 */
public class RecentCounter {

    Queue<Integer> queue;

    public RecentCounter() {
        this.queue = new PriorityQueue<>();
    }

    public int ping(int t) {
        this.queue.add(t);
        while (!this.queue.isEmpty() && this.queue.peek() < t - 3000)
            this.queue.poll();

        return this.queue.size();
    }
}
