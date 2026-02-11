package MediumLevel;

import EasyLevel.MergeTwoSortedLists.ListNode;

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = addTwoNumbers(l1, l2);

        printList(result);

    }
    private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while(l1 != null || l2 != null|| carry != 0){

            int val1 = (l1 != null ? l1.val : 0);
            int val2 = (l2 != null ? l2.val : 0);

            int total = val1 + val2 + carry;
            carry = total/10;
            int digit = total % 10;

            current.next = new ListNode(digit);
            current = current.next;

            if(l1 != null) l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        return dummy.next;
    }
    private static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val);
            if (node.next != null) System.out.print(" -> ");
            node = node.next;
        }
    }
}
