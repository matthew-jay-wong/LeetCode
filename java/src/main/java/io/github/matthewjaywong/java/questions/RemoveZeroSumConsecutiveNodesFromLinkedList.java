package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;

/**
 * <h1>
 * <a href="https://leetcode.com/problems/remove-zero-sum-consecutive-nodes-from-linked-list/description/">1171. Remove Zero Sum Consecutive Nodes from Linked List</a>
 * </h1>
 * <h2>
 * Question of the Day: 12-03-2024
 * </h2>
 * <h3>
 * Medium
 * </h3>
 * <p>
 * Given the head of a linked list, we repeatedly delete consecutive sequences of nodes that sum to 0 until there are no such sequences.
 * </p>
 * <p>
 * After doing so, return the head of the final linked list.  You may return any such answer.
 * </p>
 */
public class RemoveZeroSumConsecutiveNodesFromLinkedList {
    public ListNode solution(ListNode head) {
        ListNode pre = null;
        ListNode slow = head;
        ListNode fast = head;
        int sum = 0;
        while (Objects.nonNull(slow)) {
            sum += fast.val;
            if (sum == 0) {
                if (Objects.isNull(pre)) {
                    head = fast.next;
                    slow = head;
                    fast = head;
                } else {
                    pre.next = fast.next;
                    slow = fast.next;
                    fast = slow;
                }
                sum = 0;
                continue;
            }
            fast = fast.next;
            if (Objects.isNull(fast)) {
                pre = slow;
                slow = slow.next;
                fast = slow;
                sum = 0;
            }
        }

        return head;
    }
}
