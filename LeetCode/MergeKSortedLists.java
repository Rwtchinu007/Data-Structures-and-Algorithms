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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq = new PriorityQueue<>(
            (a, b) -> a.val - b.val // we will compare nodes using their values
        );

        
        for (ListNode node : lists) {
            if (node != null) {
                pq.offer(node);
            }
        }

        ListNode dummy = new ListNode(-1); // we use dummy node to remove head node headache
        ListNode curr = dummy; // this is a pointer  which will be moving

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();

            curr.next = node; // curr ki next se node ko link krdo
            curr = curr.next; // fir us list ki phli value ko link krdo

            // Add the next node from the same list
            if (node.next != null) {
                pq.offer(node.next);  // fir jo bacha hua h usse min heap mein bhejdo
            }
        }

        return dummy.next;
    }
}