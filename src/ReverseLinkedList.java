package src;

import java.util.LinkedList;
import java.util.ListIterator;

public class ReverseLinkedList {

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
        }
    }

    public static void main(String[] args) {

        ListNode linkedList = new ListNode(1);
        linkedList.next = new ListNode(2);
        linkedList.next.next = new ListNode(3);
        linkedList.next.next.next = new ListNode(4);
        linkedList.next.next.next.next = new ListNode(5);
//        while (linkedList !=null) {
//            System.out.println(linkedList.data);
//            linkedList = linkedList.next;
//        }

        ListNode reverseListNode = reverseList(linkedList);
        while (reverseListNode !=null){
            System.out.println(reverseListNode.data);
            reverseListNode= reverseListNode.next;

        }

    }


      private static ListNode reverseList(ListNode head) {
          ListNode prev = null;
          ListNode current = head;
          ListNode next;

          while(current != null) {
              next = current.next;
              current.next = prev;
              prev = current;
              current = next;
          }
          return prev;
      }
}
