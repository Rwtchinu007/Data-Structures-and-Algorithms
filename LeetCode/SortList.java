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
    public ListNode sortList(ListNode head) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // Put all values into the heap
        ListNode curr = head;

        while (curr != null) {
            minHeap.offer(curr.val);
            curr = curr.next;
        }

        // Put values back into the linked list
        curr = head;

        while (curr != null) {
            curr.val = minHeap.poll();
            curr = curr.next;
        }

        return head;
    }
}