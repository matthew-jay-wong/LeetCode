package io.github.matthewjaywong.java.questions;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/">1431. Kids With the Greatest Number of Candies</a>
 * </h1>
 * <h2>08-03-2024</h2>
 * <h3>Easy</h3>
 * <p>
 *     There are n kids with candies. You are given an integer array candies, where each candies[i] represents the number of candies the ith kid has, and an integer extraCandies, denoting the number of extra candies that you have.
 * </p>
 * <p>
 *     Return a boolean array result of length n, where result[i] is true if, after giving the ith kid all the extraCandies, they will have the greatest number of candies among all the kids, or false otherwise.
 * </p>
 * <p>
 *     Note that multiple kids can have the greatest number of candies.
 * </p>
 */
public class KidsWithTheGreatestNumberOfCandies {
    public List<Boolean> solution(int[] candies, int extraCandies) {
        if (candies.length == 0)
            return Collections.emptyList();
        int greatest = Arrays.stream(candies).max().getAsInt();
        return Arrays.stream(candies).mapToObj((count) -> count + extraCandies >= greatest).toList();
    }
}
