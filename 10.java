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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode result[] = new ListNode[k];
        int size = 0;
        // finding the size of given linked list
        ListNode cur = head;
        while(cur!=null){
            cur =  cur.next;
            size++;
        }
        // finding the required size of part
        int width = size/k;
        int extra = size%k; // find the extra size of first part of list
        cur = head;
        for(int i=0;i<k  && cur!=null;i++){
            result[i] = cur;
            for(int j=0;j<width+(extra>0?1:0)-1;j++){
                cur = cur.next;    
            }
            //find the tail of each part of sublist
            ListNode prev = cur.next;
            cur.next = null;
            cur = prev;
            //update pointer 
            extra--;
        }
        return result;
    }
}
