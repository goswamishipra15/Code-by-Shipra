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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode prev = dummy;
        ListNode cur = head;
        while(cur!=null){
            while(cur.next!=null && cur.val==cur.next.val){
                cur = cur.next;
            }
            // if not found duplicate then update the prev pointer
            if(prev.next==cur){
                prev = prev.next;
            }
            //if found dulicates remove that part of linkedlist
            else{
                prev.next = cur.next;
            }
            cur = cur.next;
        }
        return dummy.next;
    }
}
