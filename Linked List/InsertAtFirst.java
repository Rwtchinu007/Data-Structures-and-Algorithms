
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class InsertAtFirst {

    static Node insertAtFirst(Node head, int data) {
        Node newNode = new Node(data);
        if (head == null) {
            return newNode;
        }
        newNode.next = head;
        head = newNode;
        return head;
    }

    static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        // Node head = null;

        n1.next = n2;
        n2.next = n3;

        Node head = n1;
        printList(head);

        head = insertAtFirst(head, 5);
        head = insertAtFirst(head, 2);

        printList(head);
    }
}
