package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/delete-the-middle-node-of-a-linked-list/description/">2095. Delete the Middle Node of a Linked List</a>
 * </h1>
 * <h2>
 *     LeetCode 75
 * </h2>
 * <h3>
 *     Medium
 * </h3>
 * <p>
 *     You are given the head of a linked list. Delete the middle node, and return the head of the modified linked list.
 * </p>
 * <p>
 *     The middle node of a linked list of size n is the ⌊n / 2⌋th node from the start using 0-based indexing, where ⌊x⌋ denotes the largest integer less than or equal to x.
 * </p>
 * <ul>
 *     <li>
 *     For n = 1, 2, 3, 4, and 5, the middle nodes are 0, 1, 1, 2, and 2, respectively.</li>
 * </ul>
 */
public class DeleteTheMiddleNodeOfALinkedList {
    public ListNode solution(ListNode head) {
        if (Objects.isNull(head.next))
            return null;

        ListNode slow = head;
        ListNode fast = head;
        while (Objects.nonNull(fast.next) && Objects.nonNull(fast.next.next)) {
            fast = fast.next.next;
            if (Objects.isNull(fast.next))
                break;
            slow = slow.next;
        }

        slow.next = slow.next.next;
        return head;
    }
}
