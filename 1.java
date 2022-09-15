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
    public boolean isPalindrome(ListNode head) {
        if(head.next==null){
            return true;
        }
        
        //FIND THE MIDDLE INDEX OF LIST 
        
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        //REVERSE THE LAST PART OF LIST
        
        ListNode second = slow.next;
        slow.next = null;
        ListNode prev = null;
        ListNode cur = second;
        while(cur!=null){
            ListNode nex = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nex;
        }
        second = prev;
        
        // COMPARE FIRST AND SECOND HALF OF LIST
        
        ListNode first = head;
        while(second!=null){
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        return true;
    }
}
