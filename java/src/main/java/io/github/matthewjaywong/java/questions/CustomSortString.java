package io.github.matthewjaywong.java.questions;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/custom-sort-string/description/">791. Custom Sort String</a>
 * </h1>
 * <h2>
 *     Question of the Day: 11-03-2024
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 */
public class CustomSortString {
    public String solution(String order, String s) {
        Map<Character, Integer> orderMap = new HashMap<>();
        for (int i = 0; i < order.length(); i++)
            orderMap.put(order.charAt(i), i + 1);

        Comparator<Character> customComparator =
                Comparator.comparingInt(o -> orderMap.getOrDefault(o, Integer.MAX_VALUE));

        PriorityQueue<Character> sorted = new PriorityQueue<>(customComparator);
        for (char c : s.toCharArray())
            sorted.add(c);

        StringBuilder res = new StringBuilder();
        while (!sorted.isEmpty())
            res.append(sorted.poll());

        return res.toString();
    }
}
