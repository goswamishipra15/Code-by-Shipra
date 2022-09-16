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
    public ListNode middleNode(ListNode head) {
        int size = 0; // checking the size of list
        ListNode cur = head;
        while(cur!=null){
            cur = cur.next;
            size++;
        }
        // find the middle of list
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        if(size%2==1)     //if size is odd return the middle
            return slow;
        else
            return slow.next;      //if size is even return the middle next
    }
}
