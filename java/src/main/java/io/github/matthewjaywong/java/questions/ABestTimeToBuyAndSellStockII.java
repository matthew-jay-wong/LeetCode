package io.github.matthewjaywong.java.questions;

import java.util.Objects;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/">122. Best Time to Buy and Sell Stock II</a>
 * </h1>
 * <h2>
 * Top Interview 150
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * You are given an integer array prices where prices[i] is the price of a given stock on the ith day.
 * </p>
 * <p>
 * On each day, you may decide to buy and/or sell the stock. You can only hold at most one share of the stock at any time. However, you can buy it then immediately sell it on the same day.
 * </p>
 * <p>
 * Find and return the maximum profit you can achieve.
 * </p>
 */
public class ABestTimeToBuyAndSellStockII {


    public int solution(int[] prices) {
        if (prices.length == 1)
            return 0;

        if (prices.length == 2)
            return Math.max(0, prices[1] - prices[0]);

        int slow = 0;
        int fast = 1;
        int profit = 0;
        while (fast < prices.length) {
            int min = 0;
            int max = 0;
            while (fast < prices.length && prices[slow] > prices[fast]) {
                min = prices[slow];
                slow += 1;
                fast += 1;
            }
            System.out.printf("min: %d, slow: %d, fast: %d", min, slow, fast);

            while (fast < prices.length && prices[slow] < prices[fast]) {
                max = prices[fast];
                slow += 1;
                fast += 1;
            }
            System.out.printf("max: %d, slow: %d, fast: %d", max, slow, fast);

            if (max > min)
                profit += max - min;
        }

        return profit;
    }
}
