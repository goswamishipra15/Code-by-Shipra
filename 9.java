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
    public ListNode mergeList(ListNode l1, ListNode l2){
            ListNode dummy = new ListNode();
            ListNode tail = dummy;
            while(l1!=null && l2!=null){
                if(l1.val<=l2.val){
                    tail.next = l1;
                    l1 = l1.next;
                    tail = tail.next;
                }
                else{
                    tail.next = l2;
                    l2 = l2.next;
                    tail = tail.next;
                }
            }
            while(l1!=null){
                tail.next = l1;
                l1=l1.next;
                tail = tail.next;
            }
            while(l2!=null){
                tail.next = l2;
                l2 = l2.next;
                tail = tail.next;
            }
            return dummy.next;
        }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0) return null;
        if(lists.length==1) return lists[0];
        ListNode head = mergeList(lists[0],lists[1]);
        for(int i=2;i<lists.length;i++){
            head = mergeList(head,lists[i]);
        }
        return head;
    }
}
