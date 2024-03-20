package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.Stack;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/number-of-provinces/description/">547. Number of Provinces</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     There are n cities. Some of them are connected, while some are not. If city a is connected directly with city b, and city b is connected directly with city c, then city a is connected indirectly with city c.
 * </p>
 * <p>
 *     A province is a group of directly or indirectly connected cities and no other cities outside of the group.
 * </p>
 * <p>
 *     You are given an n x n matrix isConnected where isConnected[i][j] = 1 if the ith city and the jth city are directly connected, and isConnected[i][j] = 0 otherwise.
 * </p>
 * <p>
 *     Return the total number of provinces.
 * </p>
 */
public class NumberOfProvinces {
    public int solution(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        Arrays.fill(visited, false);
        int res = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (visited[i])
                continue;

            int[] cur = isConnected[i];
            visited[i] = true;
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < cur.length; j++) {
                if (cur[j] == 1 && !visited[j])
                    stack.add(j);
            }

            while (!stack.isEmpty()) {
                int curStack = stack.pop();
                for (int j = 0; j < isConnected[curStack].length; j++) {
                    if (isConnected[curStack][j] == 1 && !visited[j])
                        stack.push(j);
                }

                visited[curStack] = true;
            }

            res += 1;
        }

        return res;
    }
}
