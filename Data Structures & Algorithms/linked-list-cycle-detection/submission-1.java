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
    public boolean hasCycle(ListNode head) {

        //we check the val? can a node be a hash table key?
        //its okay lets do by value first

        HashMap<Integer,Integer> db = new HashMap<>();
        if(head == null){
            return false;
        }
        while(head.next != null){
            int current = head.val;
            if(db.containsKey(head.val)){
                return true;
            }
            else{
                db.put(current, 1);
            }
            head = head.next;
        }

        return false;
        
    }
}
