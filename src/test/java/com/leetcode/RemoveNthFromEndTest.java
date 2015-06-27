package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class RemoveNthFromEndTest extends TestCase {
    RemoveNthFromEnd object = new RemoveNthFromEnd();


    @Test
    public void testSolution() throws Exception {
        printListNode(object.removeNthFromEnd(initListNode(1, 2, 3, 4, 5), 2));
        printListNode(object.removeNthFromEnd(initListNode(1), 1));
        printListNode(object.removeNthFromEnd(initListNode(1, 2), 2));
    }

    private void printListNode(ListNode list) {
        while (list != null) {
            System.out.println(list.val);
            list = list.next;
        }
    }

    private ListNode initListNode(int... x) {
        ListNode head = new ListNode(x[0]);
        ListNode current = head;
        for (int i = 1; i < x.length; i++) {
            ListNode node = new ListNode(x[i]);
            current.next = node;
            current = node;
        }
        return head;
    }
}