package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;
import java.util.Stack;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/palindrome-linked-list/description/">234. Palindrome Linked List</a>
 * </h1>
 * <h2>
 * Question of the Day: 22-03-2024
 * </h2>
 * <h3>
 * Easy
 * </h3>
 * <p>
 * Given the head of a singly linked list, return true if it is a
 * palindrome
 * or false otherwise.
 * </p>
 */
public class PalindromeLinkedList {
    public boolean solution(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode cur = head;
        while (Objects.nonNull(cur)) {
            stack.add(cur.val);
            cur = cur.next;
        }

        cur = head;
        while (!stack.isEmpty() && Objects.nonNull(cur)) {
            if (stack.pop() != cur.val)
                return false;
            cur = cur.next;
        }

        return true;
    }
}
