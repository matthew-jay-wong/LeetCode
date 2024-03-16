package io.github.matthewjaywong.java.questions;

import java.util.*;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/equal-row-and-column-pairs/description">2352. Equal Row and Column Pairs</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given a 0-indexed n x n integer matrix grid, return the number of pairs (ri, cj) such that row ri and column cj are equal.
 * </p>
 * <p>
 *     A row and column pair is considered equal if they contain the same elements in the same order (i.e., an equal array).
 * </p>
 */
public class EqualRowAndColumnPairs {
    public int solution(int[][] grid) {
        Map<String, Integer> rowSet = new HashMap<>();
        for (int[] row : grid) {
            String key = Arrays.toString(row);
            rowSet.putIfAbsent(key, 0);
            rowSet.computeIfPresent(key, (k, v) -> v + 1);
        }

        int res = 0;
        for (int i = 0; i < grid.length; i++) {
            int[] column = new int[grid.length];
            for (int j = 0; j < grid.length; j++)
                column[j] = grid[j][i];

            String key = Arrays.toString(column);
            if (rowSet.containsKey(Arrays.toString(column)))
                res += rowSet.get(key);
        }

        return res;
    }
}
