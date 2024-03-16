package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/reverse-linked-list/description/">206. Reverse Linked List</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Easy
 * </h3>
 * <p>
 *     Given the head of a singly linked list, reverse the list, and return the reversed list.
 * </p>
 */
public class ReverseLinkedList {
    public ListNode solution(ListNode head) {
        if (Objects.isNull(head) || Objects.isNull(head.next))
            return head;

        ListNode slow = head;
        ListNode fast = head.next;

        slow.next = null;
        while (Objects.nonNull(fast)) {
           ListNode temp = fast.next;
           fast.next = slow;
           slow = fast;
           fast = temp;
        }

        return slow;
    }
}
