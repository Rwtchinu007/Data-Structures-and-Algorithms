class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}
public class InsertAtLast{
    static void printList(Node head){
        Node temp= head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

   static Node insertAtLast(Node head, int value) {
    Node n = new Node(value);

    if (head == null) {
        return n;
    }

    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;
    }

    temp.next = n;
    return head;
}


    public static void main(String[] args) {
       Node n1 = new Node(10);
       Node n2 = new Node(20);
       Node n3 = new Node(30);

       n1.next = n2;
       n2.next = n3;
       Node head = n1;

       printList(head);
       insertAtLast(head, 40);
       insertAtLast(head, 100);
       printList(head);

    }
}