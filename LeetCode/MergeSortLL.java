
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Solution {

    public Node mergeTwoLists(Node list1, Node list2) {
        if (list1 == null) {
            return list2;
        }
        if (list2 == null) {
            return list1;
        }
        if (list1.data < list2.data) {
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        } else {
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
}

public class MergeSortLL {

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // creating Linked List 1
        Node l1 = new Node(5);
        Node l2 = new Node(20);
        Node l3 = new Node(23);
        Node l4 = new Node(40);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        // Node head1 = l1;

        // creating Linked List 2
        Node l5 = new Node(2);
        Node l6 = new Node(14);
        Node l7 = new Node(21);
        Node l8 = new Node(30);
        l5.next = l6;
        l6.next = l7;
        l7.next = l8;
        // Node head2 = l5;

        Node dummy = new Node(-1);
        Node temp = dummy;
        while (l1 != null && l5 != null) {
            if (l1.data < l5.data) {
                temp.next = l1;
                l1 = l1.next;
            } else {
                temp.next = l5;
                l5 = l5.next;
            }
            temp = temp.next;
        }
        if (l1 != null) {
            temp.next = l1;
        }
        if (l5 != null) {
            temp.next = l5;
        }

        printList(dummy.next);
    }
}
