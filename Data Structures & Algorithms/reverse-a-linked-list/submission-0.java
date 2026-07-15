/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public ListNode reverseList(ListNode head) {
        //o1 space, o(n), so if im trying to go backwards
        ListNode current = head;
        ListNode previous = null;

        while(current != null){
            ListNode my_position = current; 
            if(current.next == null){
                head = current;
            }
            current = current.next;
            

            my_position.next = previous;
            previous = my_position;



            
            

        }

        return head;
    }
}
