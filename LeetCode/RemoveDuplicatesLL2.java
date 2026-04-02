class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

public class RemoveDuplicatesLL2{
    static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static Node removeDuplicates(Node head){
        if (head==null) return head;
        Node dummy = new Node(-1);
        Node itr = dummy;
        dummy.next = head;
        Node curr = head.next;
        while(curr!=null){
            boolean flag = false;
            while(curr!=null && itr.next.data==curr.data){
                flag = true;
                curr = curr.next;
            }
            if(flag) itr.next = curr;
            else itr = itr.next;

            if(curr!=null) curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
          // Creating Linked List
        Node n1 = new Node(20);
        Node n2 = new Node(20);
        Node n3 = new Node(20);
        Node n4 = new Node(35);
        Node n5 = new Node(35);
        Node n6 = new Node(35);
        Node n7 = new Node(35);
        Node n8 = new Node(45);

          // Linking nodes
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        n5.next = n6;
        n6.next = n7;
        n7.next = n8;



        Node head = n1;
        printList(head);
        head = removeDuplicates(head);
        printList(head);
    }
}