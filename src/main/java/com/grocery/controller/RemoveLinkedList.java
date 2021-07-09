package com.grocery.controller;


class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RemoveLinkedList {

        public ListNode removeElements(ListNode head, int val) {

            if(head == null) return null;
            if(head.val == val) return removeElements(head.next, val);

            //ListNode temp = head;

            while(head.next != null) {
                if(head.next.val == val) head.next = head.next.next;
                else head = head.next;
            }

            return head;
        }



    public static void main(String[] args) {
        ListNode l = new ListNode(7,null);
        ListNode l1 = new ListNode(7,l);
        ListNode l2 = new ListNode(7,l1);
        ListNode l3 = new ListNode(7,l2);

        RemoveLinkedList r = new RemoveLinkedList();
        ListNode head = r.removeElements(l3,7);
        System.out.println();
    }

}
