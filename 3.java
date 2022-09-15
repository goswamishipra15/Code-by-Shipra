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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size = 0;
        ListNode temp = head;
        while(temp!=null){
            temp = temp.next;
            size++;
        }
        if(size==n){
            return head.next;
        }
        int pos = size-n;
        int cp = 1;
        ListNode cur = head;
        while(cp!=pos){
            cur = cur.next;
            cp++;
        }
        cur.next = cur.next.next;
        return head;
    }
}
