package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/middle-of-the-linked-list/">876. Middle of the Linked List</a>
 * </h1>
 * <h2>Question of the Day: 07-03-2024</h2>
 * <h3>Easy</h3>
 * <p>
 *     Given the head of a singly linked list, return the middle node of the linked list.
 * </p>
 * <p>
 *     If there are two middle nodes, return the second middle node.
 * </p>
 */
public class MiddleOfTheLinkedList {
    public ListNode solution(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (Objects.nonNull(fast) && Objects.nonNull(fast.next)) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }
}
