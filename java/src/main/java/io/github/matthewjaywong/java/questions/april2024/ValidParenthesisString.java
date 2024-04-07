package io.github.matthewjaywong.java.questions.april2024;

import java.util.Stack;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/valid-parenthesis-string/description/">678. Valid Parenthesis String</a>
 * </h1>
 * <h2>
 *     Question of the Day: 07-04-2024
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     Given a string s containing only three types of characters: '(', ')' and '*', return true if s is valid.
 * </p>
 * <p>
 *     The following rules define a valid string:
 * </p>
 * <ul>
 *     <li>
 *         Any left parenthesis '(' must have a corresponding right parenthesis ')'.
 *     </li>
 *     <li>
 *         Any right parenthesis ')' must have a corresponding left parenthesis '('.
 *     </li>
 *     <li>
 *         Left parenthesis '(' must go before the corresponding right parenthesis ')'.
 *     </li>
 *     <li>
 *         '*' could be treated as a single right parenthesis ')' or a single left parenthesis '(' or an empty string "".
 *     </li>
 * </ul>
 */
public class ValidParenthesisString {
    public boolean solution(String s) {
        Stack<Integer> starStack = new Stack<>();
        Stack<Integer> bracketStack = new Stack<>();
        for (int i = 0; i < s.length(); i += 1) {
            char c = s.charAt(i);

            if (c == '*') {
                starStack.add(i);
                continue;
            }

            if (c == '(') {
                bracketStack.add(i);
                continue;
            }

            if (bracketStack.isEmpty()) {
                if (starStack.isEmpty())
                    return false;
                starStack.pop();
            } else {
                bracketStack.pop();
            }
        }

        if (bracketStack.isEmpty())
            return true;

        if (bracketStack.size() > starStack.size())
            return false;

        while (!bracketStack.isEmpty()) {
            if (starStack.isEmpty())
                return false;

            if (bracketStack.peek() < starStack.peek()) {
                bracketStack.pop();
                starStack.pop();
            } else {
                starStack.pop();
            }
        }

        return true;
    }
}
