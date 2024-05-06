package io.github.matthewjaywong.java.questions.may2024;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;

public class DeleteNodeInALinkedList {
    public void solution(ListNode node) {
        ListNode cur = node;
        ListNode next = node.next;
        while (Objects.nonNull(next.next)) {
            cur.val = next.val;
            cur = next;
            next = next.next;
        }

        cur.val = next.val;
        cur.next = null;
    }
}
