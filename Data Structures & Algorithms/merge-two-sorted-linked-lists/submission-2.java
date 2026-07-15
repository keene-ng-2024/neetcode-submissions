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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null){
            return list2;
        }
        if(list2 == null){
            return list1;
        }

        ListNode a_pointer = list1;
        ListNode b_pointer = list2;
        ListNode previous = null;
        ListNode head = null;
        
        //now both definetely have elements in them
        while(a_pointer != null){

            if(previous == null){
                if(a_pointer.val <= b_pointer.val){
                    previous = a_pointer;
                    a_pointer = a_pointer.next;
                    
                    head = list1;
                }else{
                    previous = b_pointer;
                    b_pointer = b_pointer.next;

                    head = list2;

                }
                continue;
            }

            if(b_pointer == null){
                previous.next = a_pointer;
                break;
            }

            if(a_pointer.val <= b_pointer.val){
                //assign to the correct one first
                previous.next = a_pointer;
                previous = a_pointer;

                //move forward in list 1
                a_pointer = a_pointer.next;
            }
            else{
                previous.next = b_pointer;
                previous = b_pointer;

                //move forward in list 2
                b_pointer = b_pointer.next;
            }
        }

        if(b_pointer != null){
            previous.next = b_pointer;
        }

       

        return head;

    }
}