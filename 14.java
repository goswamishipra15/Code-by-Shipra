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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode first,second;
        //move to the kth node from front
        while(k-1>0){
            fast = fast.next;
            k--;
        }
        first = fast;
        
        // move to the kth node from back 
        //fast.next is null as the list is 1-indexed
        while(fast.next!=null){
            slow = slow.next;
            fast = fast.next;
        }
        second = slow;
        
        //now swapping the values
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}
