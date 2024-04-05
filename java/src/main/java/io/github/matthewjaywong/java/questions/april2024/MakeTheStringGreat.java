package io.github.matthewjaywong.java.questions.april2024;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/make-the-string-great/description/">1544. Make The String Great</a>
 * </h1>
 * <h2>
 * Question of the Day: 05-04-2024
 * </h2>
 * <h3>
 * Easy
 * </h3>
 * <p>
 * Given a string s of lower and upper case English letters.
 * </p>
 * <p>
 * A good string is a string which doesn't have two adjacent characters s[i] and s[i + 1] where:
 * </p>
 * <ul>
 *     <li>
 *         0 <= i <= s.length - 2
 *     </li>
 *     <li>
 *         s[i] is a lower-case letter and s[i + 1] is the same letter but in upper-case or vice-versa.
 *     </li>
 * </ul>
 * <p>
 *     To make the string good, you can choose two adjacent characters that make the string bad and remove them. You can keep doing this until the string becomes good.
 * </p>
 * <p>
 *     Return the string after making it good. The answer is guaranteed to be unique under the given constraints.
 * </p>
 * <p>
 *     Notice that an empty string is also good.
 * </p>
 */
public class MakeTheStringGreat {
    public static void main(String[] args) {
        MakeTheStringGreat makeTheStringGreat = new MakeTheStringGreat();
        System.out.println(makeTheStringGreat.solution("abBAcC"));
    }
    public String solution(String s) {
        int i = 0;
        StringBuilder cur = new StringBuilder(s);
        while (true) {
            if (i == cur.length() - 1)
                return cur.toString();

            char ch0 = cur.charAt(i);
            char ch1 = cur.charAt(i + 1);
            if (((Character.isUpperCase(ch0) && Character.isLowerCase(ch1))
                    || (Character.isLowerCase(ch0) && Character.isUpperCase(ch1)))
                    && (Character.toLowerCase(ch0) == Character.toLowerCase(ch1))) {
                cur.delete(i, i + 2);
                if (cur.isEmpty())
                    return "";
                if (i > 0)
                    i--;
            } else {
                i++;
            }
        }
    }
}
