package io.github.matthewjaywong.java.questions.may2024;

import io.github.matthewjaywong.java.common.ListNode;

import java.util.Objects;
import java.util.Stack;

public class DoubleANumberRepresentedAsALinkedList {
    public ListNode solution(ListNode head) {
        Stack<ListNode> reversed = new Stack<>();
        ListNode cur = head;
        while (Objects.nonNull(cur)) {
            reversed.add(cur);
            cur = cur.next;
        }

        int carryOver = 0;
        while (!reversed.isEmpty()) {
            cur = reversed.pop();
            int doubled = cur.val * 2;
            if (doubled + carryOver > 9) {
                cur.val = doubled - 10 + carryOver;
                carryOver = 1;
            } else {
                cur.val = doubled + carryOver;
                carryOver = 0;
            }
        }

        if (carryOver == 1)
            return new ListNode(1, head);

        return head;
    }
}
