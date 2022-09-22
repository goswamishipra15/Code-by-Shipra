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
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null) return head;
        ListNode dummy = new ListNode();
        ListNode prev = dummy;
        ListNode cur = head;
        while(cur!=null && cur.next!=null){
            //save next pointers
            ListNode nextPair = cur.next.next;
            ListNode nex = cur.next;
            //reverse pair
            nex.next = cur;
            cur.next = nextPair;
            prev.next = nex;
            //update pointers
            prev = cur;
            cur = nextPair;
        }
        return dummy.next;
    }
}
