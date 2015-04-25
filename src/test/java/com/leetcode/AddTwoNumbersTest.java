package com.leetcode;

import junit.framework.TestCase;
import org.junit.Test;

public class AddTwoNumbersTest extends TestCase {
    AddTwoNumbers object = new AddTwoNumbers();


    @Test
    public void testSolution() throws Exception {

        AddTwoNumbers.ListNode l1 = new AddTwoNumbers.ListNode(2);
        l1.next = new AddTwoNumbers.ListNode(4);
        l1.next.next = new AddTwoNumbers.ListNode(3);

        AddTwoNumbers.ListNode l2 = new AddTwoNumbers.ListNode(5);
        l2.next = new AddTwoNumbers.ListNode(6);
        l2.next.next = new AddTwoNumbers.ListNode(4);

        object.print(l1);
        object.print(l2);

        AddTwoNumbers.ListNode expected = new AddTwoNumbers.ListNode(7);
        expected.next = new AddTwoNumbers.ListNode(0);
        expected.next.next = new AddTwoNumbers.ListNode(8);

        AddTwoNumbers.ListNode result = object.addTwoNumbers(l1, l2);

        object.print(result);

    }
}