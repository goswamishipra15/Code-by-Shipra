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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode dummy = new ListNode();
        int i1=1;
        ListNode cur = list1;
        dummy.next = cur;
        while(cur!=null && i1!=a){
            cur = cur.next;
            i1++;} //reach the end of first list
        ListNode temp = cur.next;
        cur.next = list2;  //add the second list
        //remove the required part from the list1
        while(temp!=null && a!=b){ 
            temp = temp.next;
            a++;
        }
        // move to the last part of new list1 for adding the leftover part of list1
        while(cur.next!=null){
            cur = cur.next;
        }
        //now adding the left part of list1
        cur.next=temp.next;
        temp.next = null;
        return dummy.next;
    }
}
