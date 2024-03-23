package io.github.matthewjaywong.java.questions;

import java.util.*;
import java.util.stream.Collectors;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/combination-sum-iii/description/">216. Combination Sum III</a>
 * </h1>
 * <h2>
 * LeetCode 75
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Find all valid combinations of k numbers that sum up to n such that the following conditions are true:
 * </p>
 * <ul>
 *     <li>Only numbers 1 through 9 are used.</li>
 *     <li>Each number is used at most once.</li>
 * </ul>
 * <p>
 *     Return a list of all possible valid combinations. The list must not contain the same combination twice, and the combinations may be returned in any order.
 * </p>
 */
public class CombinationSumIII {
    public List<List<Integer>> solution(int k, int n) {
        return recurse(k, n, Collections.emptySet()).stream()
                .map(ArrayList::new)
                .collect(Collectors.toList());
    }

    public Set<Set<Integer>> recurse(int k, int n, Set<Integer> contains) {
        if (k == 9) {
            if (n != 45)
                return Collections.emptySet();

            return Set.of(Set.of(1, 2, 3, 4, 5 ,6, 7, 8, 9));
        }

        if (k == 1) {
            if (n < 1 || n > 9)
                return Collections.emptySet();

            return Set.of(Set.of(n));
        }

        Set<Set<Integer>> res = new HashSet<>();
        for (int i = 1; i < 10; i++) {
            if (contains.contains(i))
                continue;
            Set<Integer> containsDup = new HashSet<>(contains);
            containsDup.add(i);
            Set<Set<Integer>> recurseRes = this.recurse(k - 1, n - i, containsDup);
            System.out.println(recurseRes);

            for (Set<Integer> possible : recurseRes) {
                System.out.println(possible);
                Set<Integer> dup = new HashSet<>(possible);
                dup.add(i);
                if (dup.stream().mapToInt(Integer::intValue).sum() == n
                        && dup.size() == k)
                    res.add(dup);
            }
        }

        return res;
    }
}
