package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/">19. Remove Nth Node From End of List</a>
 * </h1>
 * <h2>Question of the Day: 03-03-2024</h2>
 * <h3>Medium</h3>
 * <p>
 *     Given the head of a linked list, remove the nth node from the end of the list and return its head.
 * </p>
 */
public class RemoveNthNodeFromEndOfList {
    public ListNode solution(ListNode head, int n) {
        if (n == 1 && Objects.isNull(head.next))
            return null;

        ListNode slow = null;
        ListNode fast = head;

        int i = 1;
        while (Objects.nonNull(fast)) {
            fast = fast.next;
            if (i > n)
                slow = Objects.nonNull(slow) ? slow.next : head;

            i += 1;
        }

        if (Objects.isNull(slow)) {
            assert head != null;
            head = head.next;
        } else {
            slow.next = slow.next.next;
        }

        return head;
    }
}
