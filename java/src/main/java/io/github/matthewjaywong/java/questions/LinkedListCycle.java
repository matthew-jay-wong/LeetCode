package io.github.matthewjaywong.java.questions;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;

/**
 * <h1>
 *     <a href="https://leetcode.com/problems/linked-list-cycle/description/">141. Linked List Cycle</a>
 * </h1>
 * <h2>Question of the Day: 06-03-2024</h2>
 * <h3>Easy</h3>
 *
 * <p>
 *     Given head, the head of a linked list, determine if the linked list has a cycle in it.
 * </p>
 * <p>
 *     There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer.
 *     Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
 * </p>
 * <p>
 *     Return true if there is a cycle in the linked list. Otherwise, return false.
 * </p>
 */
public class LinkedListCycle {
    public boolean solution(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (Objects.nonNull(fast) && Objects.nonNull(fast.next)) {
            slow = slow.next;
            fast = fast.next.next;
            if (fast == slow)
                return true;
        }

        return false;
    }
}
