
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CycleLL {

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Creating Linked List
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(35);
        Node n5 = new Node(30);
        Node n6 = new Node(60);
        Node n7 = new Node(70);

        // Linking nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;

        Node head = n1;
        Node slow = head;
        Node fast = head;
       boolean hasCycle = false;

while (fast != null && fast.next != null) {
    fast = fast.next.next;
    slow = slow.next;

    if (slow == fast) {
        hasCycle = true;
        break;   // 🚨 STOP HERE
    }
}

if (hasCycle) {
    System.out.println("Cyclic");
} else {
    System.out.println("Non Cyclic");
}
    }
}
