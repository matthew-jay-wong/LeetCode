package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/keys-and-rooms/">841. Keys and Rooms</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     There are n rooms labeled from 0 to n - 1 and all the rooms are locked except for room 0. Your goal is to visit all the rooms. However, you cannot enter a locked room without having its key.
 * </p>
 * <p>
 *     When you visit a room, you may find a set of distinct keys in it. Each key has a number on it, denoting which room it unlocks, and you can take all of them with you to unlock the other rooms.
 * </p>
 * <p>
 *     Given an array rooms where rooms[i] is the set of keys that you can obtain if you visited room i, return true if you can visit all the rooms, or false otherwise.
 * </p>
 */
public class KeysAndRooms {
    public boolean solution(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        Arrays.fill(visited, false);
        visited[0] = true;

        Stack<Integer> keys = new Stack<>();
        keys.addAll(rooms.getFirst());

        while (!keys.isEmpty()) {
            int cur = keys.pop();
            if (visited[cur])
                continue;

            visited[cur] = true;
            keys.addAll(rooms.get(cur));
        }

        for (boolean room : visited) {
            if (!room)
                return false;
        }

        return true;
    }
}
