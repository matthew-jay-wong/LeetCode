package io.github.matthewjaywong.java.questions;

import java.util.*;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/letter-combinations-of-a-phone-number/description/">17. Letter Combinations of a Phone Number</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 */
public class ALetterCombinationsOfAPhoneNumber {

    static Map<Character, List<String>> numberMapping = Map.of(
            '1', List.of(),
            '2', List.of("a", "b", "c"),
            '3', List.of("d", "e", "f"),
            '4', List.of("g", "h", "i"),
            '5', List.of("j", "k", "l"),
            '6', List.of("m", "n", "o"),
            '7', List.of("p", "q", "r", "s"),
            '8', List.of("t", "u", "v"),
            '9', List.of("w", "x", "y", "z")
    );

    public List<String> solution(String digits) {
        if (digits.isBlank())
            return Collections.emptyList();

        if (digits.length() == 1)
            return numberMapping.get(digits.charAt(0));

        List<String> recurse = this.solution(digits.substring(1));
        List<String> res = new ArrayList<>();
        for (String c: numberMapping.get(digits.charAt(0)))
            for (String s : recurse)
                res.add(c + s);

        return res;
    }
}
