
class Node {

    int data; //value
    Node next; //reference to next node

    // constructor is a method that runs automatically when you create an object
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CreationLL {

    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        // linking 
        n1.next = n2;
        n2.next = n3;

        // head of LL
        Node head = n1;

        // printing LL
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}
