package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;
import java.util.Stack;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/reorder-list/">143. Reorder List</a>
 * </h1>
 * <h2>
 * Question of the Day: 23-03-2024
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * You are given the head of a singly linked-list. The list can be represented as:
 * </p>
 * <p>
 * <code>
 * L0 → L1 → … → Ln - 1 → Ln
 * </code>
 * </p>
 * <p>
 * Reorder the list to be on the following form:
 * </p>
 * <p>
 * <code>
 * L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
 * </code>
 * </p>
 * <p>
 * You may not modify the values in the list's nodes. Only nodes themselves may be changed.
 * </p>
 */
public class ReorderList {
    public void solution(ListNode head) {
        Stack<ListNode> stack = new Stack<>();
        int count = 0;

        ListNode cur = head;
        while (Objects.nonNull(cur)) {
            stack.add(cur);
            count += 1;
            cur = cur.next;
        }

        cur = head;
        for (int i = 0; i < Math.ceilDiv(count, 2); i++) {
            ListNode end = stack.pop();
            end.next = cur.next;
            cur.next = end;
            cur = cur.next.next;
        }

        cur.next.next = null;
    }
}
