package io.github.matthewjaywong.java.questions.april2024;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/number-of-students-unable-to-eat-lunch/">1700. Number of Students Unable to Eat Lunch</a>
 * </h1>
 * <h2>
 *     Question of the Day: 08-04-2024
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     The school cafeteria offers circular and square sandwiches at lunch break, referred to by numbers 0 and 1 respectively. All students stand in a queue. Each student either prefers square or circular sandwiches.
 * </p>
 * <p>
 *     The number of sandwiches in the cafeteria is equal to the number of students. The sandwiches are placed in a stack. At each step:
 * </p>
 * <ul>
 *     <li>
 *         If the student at the front of the queue prefers the sandwich on the top of the stack, they will take it and leave the queue.
 *     </li>
 *     <li>
 *         Otherwise, they will leave it and go to the queue's end.
 *     </li>
 * </ul>
 * <p>
 *     This continues until none of the queue students want to take the top sandwich and are thus unable to eat.
 * </p>
 * <p>
 *     You are given two integer arrays students and sandwiches where sandwiches[i] is the type of the i​​​​​​th sandwich in the stack (i = 0 is the top of the stack) and students[j] is the preference of the j​​​​​​th student in the initial queue (j = 0 is the front of the queue). Return the number of students that are unable to eat.
 * </p>
 */
public class NumberOfStudentsUnableToEatLunch {
    public int solution(int[] students, int[] sandwiches) {
        Queue<Integer> studentsQueue = new LinkedList<>();
        for (int student : students)
            studentsQueue.add(student);

        Stack<Integer> sandwichesStack = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i -= 1)
            sandwichesStack.add(sandwiches[i]);

        int skipCount = 0;
        while (!studentsQueue.isEmpty()) {
            int curStudent = studentsQueue.poll();
            if (curStudent == sandwichesStack.peek()) {
                sandwichesStack.pop();
                skipCount = 0;
            } else {
                studentsQueue.add(curStudent);
                skipCount += 1;
            }

            if (skipCount == studentsQueue.size())
                return skipCount;
        }

        return 0;
    }
}
